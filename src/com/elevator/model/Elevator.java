package com.elevator.model;

import com.elevator.states.ElevatorState;
import com.elevator.states.IdleState;

public class Elevator {

    private int currentFloor;
    private String direction;
    private ElevatorState state;

    // Constructor
    public Elevator() {
        this.currentFloor = 0;
        this.direction = "IDLE";
        this.state = new IdleState();
    }

    // Getter for current floor
    public int getCurrentFloor() {
        return currentFloor;
    }

    // Setter for current floor
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    // Getter for direction
    public String getDirection() {
        return direction;
    }

    // Setter for direction
    public void setDirection(String direction) {
        this.direction = direction;
    }

    // Getter for state
    public ElevatorState getState() {
        return state;
    }

    // Setter for state
    public void setState(ElevatorState state) {
        this.state = state;
    }

    // Move elevator
    public void moveToFloor(int floor) {
        System.out.println("Elevator moving from floor " + currentFloor + " to floor " + floor);
        this.currentFloor = floor;
    }

    // Request floor (handled by state)
    public void requestFloor(int destinationFloor) {
        state.handleRequest(this, destinationFloor);
    }
}