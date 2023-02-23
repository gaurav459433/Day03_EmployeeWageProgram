package com.bridgelabz.assignmentsrfp259.day03.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        int FULLTIME = 1;
        int EMP_WAGE_PH  = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == FULLTIME) {
            empHrs = 8;
        }
        else {
            empHrs = 0;
        }
        empWage = empHrs * EMP_WAGE_PH;
        System.out.println("Employee Daily Wage is :" +empWage);
    }
}
