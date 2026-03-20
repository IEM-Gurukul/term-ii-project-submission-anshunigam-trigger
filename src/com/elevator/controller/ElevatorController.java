package com.elevator.controller;

import com.elevator.model.Elevator;

import java.util.TreeSet;

public class ElevatorController {

    private Elevator elevator;

    private TreeSet<Integer> upRequests;
    private TreeSet<Integer> downRequests;

    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
        upRequests = new TreeSet<>();
        downRequests = new TreeSet<>((a, b) -> b - a); // descending
    }

    // Add request
    public void addRequest(int floor) {

    if(floor < 0 || floor > 10) {   // assume 10 floors
        throw new IllegalArgumentException("Invalid floor number");
    }

    if(floor > elevator.getCurrentFloor()) {
        upRequests.add(floor);
    } else {
        downRequests.add(floor);
    }
}

    // Process requests
    public void processRequests() {

    System.out.println("Processing UP requests...");

    // Handle UP direction
    while(!upRequests.isEmpty()) {
        int nextFloor = upRequests.pollFirst();
        elevator.requestFloor(nextFloor);
    }

    System.out.println("Processing DOWN requests...");

    // Handle DOWN direction
    while(!downRequests.isEmpty()) {
        int nextFloor = downRequests.pollFirst();
        elevator.requestFloor(nextFloor);
    }
}
}