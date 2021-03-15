package endterm.project.factoryMethod;

public class RoadLogistics implements Logistics {


    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
