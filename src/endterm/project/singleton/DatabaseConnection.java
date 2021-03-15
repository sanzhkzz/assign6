package endterm.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// The singleton's constructor should always be private to
// prevent direct construction calls with the `new`
// operator.
public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;
    private String url = "jdbc:postgresql://localhost:5432/healthcare";
    private String username = "postgres";
    private String password = "Majorlazer228";

    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password); // private constructor
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }

        return instance;
    }


}




//Implement “lazy initialization” inside the static method. It should create a new object on its first call and put it into the static field. The method should always return that instance on all subsequent calls.
//
//Make the constructor of the class private. The static method of the class will still be able to call the constructor, but not the other objects.
//
//Go over the client code and replace all direct calls to the singleton’s constructor with calls to its static creation method.