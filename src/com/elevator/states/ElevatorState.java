package com.elevator.states;

import com.elevator.model.Elevator;

public interface ElevatorState {

    void handleRequest(Elevator elevator, int destinationFloor);

}