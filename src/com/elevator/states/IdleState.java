package com.elevator.states;

import com.elevator.model.Elevator;

public class IdleState implements ElevatorState {

    @Override
    public void handleRequest(Elevator elevator, int destinationFloor) {

        if(destinationFloor > elevator.getCurrentFloor()){
            elevator.setDirection("UP");
        } 
        else if(destinationFloor < elevator.getCurrentFloor()){
            elevator.setDirection("DOWN");
        } 
        else {
            System.out.println("Elevator already at requested floor.");
            return;
        }

        elevator.moveToFloor(destinationFloor);
    }
}