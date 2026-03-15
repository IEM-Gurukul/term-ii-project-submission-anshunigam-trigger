package com.elevator.model;

public class Elevator {

    private int currentFloor;
    private String direction;

    public Elevator() {
        currentFloor = 0;
        direction = "IDLE";
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int floor) {
        this.currentFloor = floor;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void moveToFloor(int floor) {
        System.out.println("Elevator moving to floor " + floor);
        currentFloor = floor;
    }
}