package br.com.java8.streamresume;

public class Car extends Vehicle {
    private String color;
    private int wheelsNumber;

    public Car(String color, int wheelsNumber) {
        this.color = color;
        this.wheelsNumber = wheelsNumber;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
