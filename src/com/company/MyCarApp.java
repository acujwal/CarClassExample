package com.company;

public class MyCarApp {

   public static void main(String[] args) {
	// write your code here
       Car myCar = new Car();


       Vehicle myVehicle = new Vehicle();


       myCar.setColor(" Blue ");
       System.out.println(" ");

       myCar.setWeight("260 tone");
       System.out.printf("");

       myVehicle.setModel("Toyota SE");
       System.out.printf("");

       myVehicle.setYear("2018");
       System.out.printf("");

       myVehicle.setAcceleration("65 Mph");
       System.out.printf("");

       myVehicle.setReadSpeed("180 Mph");
       System.out.printf("");

       myVehicle.setStart("45 Mph");
       System.out.printf("");

       myVehicle.setStop("1.15 min");
       System.out.printf("");

       System.out.println(" This is my current Vehicle Model : " + myVehicle.getModel());
       System.out.println("Current year : " + myVehicle.getYear());
       System.out.println(" This is the current color : " + myCar.getColor());
       System.out.println("weight of the car : " + myCar.getWeight());



       System.out.println("New car' color: " + myCar.getColor());
       System.out.println("New car' Weight: " + myCar.getWeight());
       System.out.println("Model of the Car : "+ myVehicle.getModel());
       System.out.println("Making year : " + myVehicle.getYear());
       System.out.println("Acceleration : " + myVehicle.getAcceleration());
       System.out.println("Read Speed : " + myVehicle.getReadSpeed());
       System.out.println("Start speed : " + myVehicle.getStart());
       System.out.println("Stop time : " + myVehicle.getStop());
    }
}
