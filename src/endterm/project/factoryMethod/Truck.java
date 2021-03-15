package endterm.project.factoryMethod;

public class Truck implements Transport{


    @Override
    public void deliver() {
        System.out.println("Delivery was made by truck");
    }
}
