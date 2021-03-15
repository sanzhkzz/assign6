package endterm.project.factoryMethod;

public class Ship implements Transport{


    @Override
    public void deliver() {
        System.out.println("Delivery was made by ship");
    }
}
