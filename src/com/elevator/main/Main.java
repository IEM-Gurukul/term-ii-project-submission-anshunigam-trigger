package com.elevator.main;

import com.elevator.model.Elevator;
import com.elevator.controller.ElevatorController;

public class Main {

    public static void main(String[] args) {

        Elevator elevator = new Elevator();
        ElevatorController controller = new ElevatorController(elevator);

        controller.addRequest(5);
        controller.addRequest(2);
        controller.addRequest(8);
        controller.addRequest(1);

        controller.processRequests();
    }
}