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
        downRequests = new TreeSet<>((a, b) -> b - a);
    }

    public void addRequest(int floor) {

        if(floor < 0 || floor > 10) {
            throw new IllegalArgumentException("Invalid floor number");
        }

        if(upRequests.contains(floor) || downRequests.contains(floor)) {
            System.out.println("Request already exists.");
            return;
        }

        if(floor > elevator.getCurrentFloor()) {
            upRequests.add(floor);
        } else {
            downRequests.add(floor);
        }
    }
public void processRequests() {

    System.out.println("Processing UP requests...");

    while(!upRequests.isEmpty()) {
        int next = upRequests.pollFirst();
        elevator.requestFloor(next);
        elevator.requestFloor(next); // triggers door open
    }

    System.out.println("Processing DOWN requests...");

    if(downRequests.isEmpty()) {
        System.out.println("No DOWN requests remaining.");
    }

    while(!downRequests.isEmpty()) {
        int next = downRequests.pollFirst();
        elevator.requestFloor(next);
        elevator.requestFloor(next);
    }
}
}