[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Elevator Control System Simulation Using Object-Oriented Programming

---

## Problem Statement (max 150 words)

In multi-floor buildings, elevators receive multiple requests from different floors at the same time. If these requests are not handled efficiently, it can lead to unnecessary movement, increased waiting time, and poor system performance. 

This project aims to simulate an elevator control system that processes floor requests and determines the optimal movement of the elevator. The system uses a scheduling approach to manage requests based on direction, ensuring efficient operation. It also models real-world elevator behavior using object-oriented programming concepts and the State Design Pattern.

---

## Target User

- Office buildings  
- Hospitals  
- Shopping malls  
- Educational institutions  

---

## Core Features

- Accept multiple elevator requests  
- Direction-based movement (UP/DOWN)  
- State-based behavior using State Pattern  
- Command-line interface for user input  
- Exception handling for invalid floor entries  

---

## OOP Concepts Used

- Abstraction: Elevator operations are exposed through simple methods while hiding internal logic  
- Inheritance: State classes follow a common interface structure  
- Polymorphism: Different states handle requests differently using the same method  
- Exception Handling: Invalid floor inputs are handled gracefully  
- Collections / Threads: TreeSet is used to manage and sort requests efficiently  

---

## Proposed Architecture Description

The system is divided into multiple components for modular design. The Elevator class represents the elevator and stores its current state and position. The ElevatorController manages incoming requests and processes them using a SCAN-like scheduling approach. 

State behavior is handled using separate classes such as IdleState, MovingUpState, MovingDownState, and DoorOpenState, following the State Design Pattern. This allows the elevator to change its behavior dynamically based on its current state. The Main class provides a command-line interface for user interaction.

---

## How to Run

1. Open the project in VS Code or any Java IDE  
2. Navigate to Main.java  
3. Compile and run the program  
4. Enter the number of requests  
5. Enter floor numbers as input  
6. Observe the elevator movement in the console  

---

## Git Discipline Notes

The project follows proper Git practices with more than 10 meaningful commits. Each commit represents a logical step in development, such as creating classes, implementing features, and improving system behavior. Commits are distributed across multiple days to reflect continuous development.