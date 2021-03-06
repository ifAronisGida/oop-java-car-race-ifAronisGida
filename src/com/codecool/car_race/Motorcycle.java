package com.codecool.car_race;

import java.util.Random;

class Motorcycle extends Vehicle {

    private int normalSpeed;
    private String name;

    private static int motorcycleNumber = 1;

    Motorcycle() {
        normalSpeed = 100;
        speed = normalSpeed;
        name = generateMotorcycleName();
        motorcycleNumber++;
    }

    String getName() {
        return name;
    }

    private String generateMotorcycleName() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motorcycle ");
        sb.append(motorcycleNumber);
        return sb.toString();

    }

    void prepareForLap(Race race) {
        if (race.isItRaining()) {
            Random r = new Random();
            speed = speed - (r.nextInt(46) + 5);
        } else {
            speed = normalSpeed;
        }
        System.out.println("set " + name + "'s speed to: " + speed);
    }
}
