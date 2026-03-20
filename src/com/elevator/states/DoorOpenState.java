package com.elevator.states;

import com.elevator.model.Elevator;

public class DoorOpenState implements ElevatorState {

    @Override
    public void handleRequest(Elevator elevator, int destinationFloor) {

        System.out.println("Door opening at floor " + elevator.getCurrentFloor());
        elevator.setState(new IdleState());
    }
}