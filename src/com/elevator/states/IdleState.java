package com.elevator.states;

import com.elevator.model.Elevator;

public class IdleState implements ElevatorState {

    @Override
    public void handleRequest(Elevator elevator, int destinationFloor) {

        if(destinationFloor > elevator.getCurrentFloor()){
            elevator.setState(new MovingUpState());
        }
        else if(destinationFloor < elevator.getCurrentFloor()){
            elevator.setState(new MovingDownState());
        }
        else {
            System.out.println("Already at the requested floor");
            return;
        }

        // Delegate to new state
        elevator.requestFloor(destinationFloor);
    }
}