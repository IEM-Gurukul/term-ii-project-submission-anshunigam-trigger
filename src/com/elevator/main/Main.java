package com.elevator.main;

import com.elevator.model.Elevator;
import com.elevator.controller.ElevatorController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Elevator elevator = new Elevator();
        ElevatorController controller = new ElevatorController(elevator);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of requests:");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter floor: ");
            int floor = sc.nextInt();

            try {
                controller.addRequest(floor);
            } catch (Exception e) {
                System.out.println("Invalid floor input");
            }
        }

        controller.processRequests();

        sc.close();
    }
}