package com.elevator.states;

import com.elevator.model.Elevator;
import com.elevator.model.Direction;

public class MovingUpState implements ElevatorState {

    @Override
    public void handleRequest(Elevator elevator, int destinationFloor) {

        System.out.println("Elevator moving UP...");
        elevator.setDirection(Direction.UP);

        elevator.moveToFloor(destinationFloor);
        elevator.setState(new DoorOpenState());
    }
}