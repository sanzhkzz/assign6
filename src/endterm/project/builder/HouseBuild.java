package endterm.project.builder;

public class HouseBuild implements HouseBuilder{
    private House house ;
    public void House(){

    }
    @Override
    public void create() {
        this.house=new House();
    }

    @Override
    public void colorWalls(String walls) {
       this.house.setWalls(walls);
    }

    @Override
    public void putWindows(String windows) {
       this.house.setWindows(windows);
    }

    @Override
    public void countWindows(int windowsNumber) {
     this.house.setWindowsNumber(windowsNumber);
    }

    @Override
    public void putDoors(int doors) {
    this.house.setDoors(doors);
    }



    @Override
    public void buildSwimmingPool(boolean swimmingPool) {
        this.house.setSwimmingPool(swimmingPool);
    }

    @Override
    public House getResult() {
        return this.house;
    }
}
