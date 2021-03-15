package endterm.project.builder;

public class Director {

    public void createHouse(HouseBuilder houseBuilder){
        houseBuilder.create();
        houseBuilder.buildSwimmingPool(false);
        houseBuilder.colorWalls("red");
        houseBuilder.countWindows(20);
        houseBuilder.putDoors(12);
        houseBuilder.putWindows("plastic windows");
    }
}
