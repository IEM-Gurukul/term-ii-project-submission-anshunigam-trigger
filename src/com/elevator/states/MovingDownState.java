package com.elevator.states;

import com.elevator.model.Elevator;
import com.elevator.model.Direction;

public class MovingDownState implements ElevatorState {

    @Override
    public void handleRequest(Elevator elevator, int destinationFloor) {

        System.out.println("Elevator moving DOWN...");
        elevator.setDirection(Direction.DOWN);

        elevator.moveToFloor(destinationFloor);
        elevator.setState(new DoorOpenState());
    }
}