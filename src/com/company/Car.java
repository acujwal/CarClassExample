package com.company;

public class Car extends Vehicle{

    private String color;
    private String weight;

    public Car(){
        super();
        System.out.println("A car has been created!");
}



    public String getColor() {
        return color;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
