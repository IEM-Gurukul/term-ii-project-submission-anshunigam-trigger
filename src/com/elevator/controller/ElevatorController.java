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
        }

        System.out.println("Processing DOWN requests...");

        while(!downRequests.isEmpty()) {
            int next = downRequests.pollFirst();
            elevator.requestFloor(next);
        }
    }
}