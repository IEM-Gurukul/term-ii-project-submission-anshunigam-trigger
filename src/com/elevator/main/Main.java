package com.elevator.main;

import com.elevator.model.Elevator;

public class Main {

    public static void main(String[] args) {

        Elevator elevator = new Elevator();

        elevator.requestFloor(5);
        elevator.requestFloor(2);
        elevator.requestFloor(7);

    }
}