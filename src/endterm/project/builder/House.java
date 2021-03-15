package endterm.project.builder;

public class House {



    String walls;
    String windows;
    int windowsNumber;
    int doors;
    boolean swimmingPool;

    public House() {
    }



    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public int getWindowsNumber() {
        return windowsNumber;
    }

    public void setWindowsNumber(int windowsNumber) {
        this.windowsNumber = windowsNumber;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", windows='" + windows + '\'' +
                ", windowsNumber=" + windowsNumber +
                ", doors=" + doors +
                ", swimmingPool=" + swimmingPool +
                '}';
    }
}