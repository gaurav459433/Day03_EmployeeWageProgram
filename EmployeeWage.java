package com.bridgelabz.assignmentsrfp259.day03.employeewage;

public class EmployeeWage {
    public static final int FULLTIME = 1;
    public static final int PARTTIME = 2;
    public static final int EMP_WAGE_PH  = 20;
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");

        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
            case FULLTIME :
            empHrs = 8;
            empWage = empHrs * EMP_WAGE_PH;
            System.out.println("Employee Daily Wage is :" +empWage);
            break;

            case PARTTIME :
            empHrs = 4;
            empWage = empHrs * EMP_WAGE_PH;
            System.out.println("Employee PartTime Wage is :" +empWage);
            break;

            default :
            empHrs = 0;
            empWage = empHrs * EMP_WAGE_PH;
            System.out.println("Employee Is Absent So Wage is :" +empWage);
        }
    }
}
