package com.elevator.model;

public class Request {

    private int sourceFloor;
    private int destinationFloor;

    public Request(int source, int destination) {
        this.sourceFloor = source;
        this.destinationFloor = destination;
    }

    public int getSourceFloor() {
        return sourceFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }
}