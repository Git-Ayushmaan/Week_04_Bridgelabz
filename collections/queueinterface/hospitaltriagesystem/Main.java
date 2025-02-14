package com.example.collections.queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Patient Name (type 'exit' to stop): ");
            String name = sc.next();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter Patient Priority: ");
            int priority;

            // Check for valid integer input
            while (!sc.hasNextInt()) {
                System.out.print("Invalid input! Enter a valid integer for priority: ");
                sc.next(); // Consume invalid input
            }
            priority = sc.nextInt();

            Patient patient = new Patient(name, priority);
            priorityQueue.add(patient);
        }

        sc.close(); // Close Scanner

        System.out.println("\nPriority Queue (Sorted Order):");
        while (!priorityQueue.isEmpty()) {
            Patient p = priorityQueue.poll();
            System.out.println(p.getName() + " - Priority: " + p.getPriority());
        }
    }
}
