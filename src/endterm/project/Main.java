package endterm.project;

import endterm.project.builder.Director;
import endterm.project.builder.House;
import endterm.project.builder.HouseBuild;

import endterm.project.factoryMethod.Ship;
import endterm.project.factoryMethod.Truck;

public class Main {


    /*
    *
    2nd task
    *
    * */
    public static void main(String[] args) {
     Truck truck=new Truck();
     truck.deliver();

     Ship ship=new Ship() ;
     ship.deliver();


      /*
    *
    3rd task
    *
    * */
        Director director = new Director();
        HouseBuild houseBuild = new HouseBuild();
        director.createHouse(houseBuild);
        House house = houseBuild.getResult();
        System.out.println(house);

    }
}

