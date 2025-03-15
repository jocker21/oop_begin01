package com.lesson.oop3;

public class Computer {
    public String model;
    public int ram;
    public int ssd;
    public double speed;

    public Computer(String model, int ram, int sdd, double speed) {
        this.model = model;
        this.ram = ram;
        this.ssd = sdd;
        this.speed = speed;
    }
    public void compImfo() {
        System.out.println("Model: " + model + ", Ram: " + ram + "Gb, Ssd: " + ssd +
                "Gb, speed: " + speed +"Ghz");
    }
}
