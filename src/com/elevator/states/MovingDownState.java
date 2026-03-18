package com.elevator.states;

import com.elevator.model.Elevator;

public class MovingDownState implements ElevatorState {

    @Override
    public void handleRequest(Elevator elevator, int destinationFloor) {

        System.out.println("Elevator moving DOWN...");

        elevator.setDirection("DOWN");
        elevator.moveToFloor(destinationFloor);

        elevator.setState(new DoorOpenState());
    }
}