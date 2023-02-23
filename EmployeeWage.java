package com.bridgelabz.assignmentsrfp259.day03.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        int FULLTIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == FULLTIME) {
            System.out.println("Employee Is Present");
        }
        else {
            System.out.println("Employee Is Absent");
        }
    }
}
