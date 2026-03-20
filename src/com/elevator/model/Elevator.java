package com.elevator.model;

import com.elevator.states.ElevatorState;
import com.elevator.states.IdleState;

public class Elevator {

    private int currentFloor;
    private Direction direction;
    private ElevatorState state;

    public Elevator() {
        this.currentFloor = 0;
        this.direction = Direction.IDLE;
        this.state = new IdleState();
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int floor) {
        this.currentFloor = floor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public ElevatorState getState() {
        return state;
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public void moveToFloor(int floor) {
        System.out.println("---------------------------------");
        System.out.println("Moving from floor " + currentFloor + " to " + floor);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.currentFloor = floor;
        System.out.println("---------------------------------");
    }

    public void requestFloor(int destinationFloor) {
        System.out.println("Current State: " + state.getClass().getSimpleName());
        state.handleRequest(this, destinationFloor);
    }
}