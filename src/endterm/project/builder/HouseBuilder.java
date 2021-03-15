package endterm.project.builder;


public interface HouseBuilder {
    void create();

    void colorWalls(String walls);

    void putWindows(String windows);

    void countWindows(int windowsNumber);

    void putDoors(int doors);


    void buildSwimmingPool(boolean swimmingPool);


    House getResult();
}
