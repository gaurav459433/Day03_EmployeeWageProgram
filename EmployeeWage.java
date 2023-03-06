package com.bridgelabz.assignmentsrfp259.day03.employeewage;

public class EmployeeWage {
    public static final int FULLTIME = 1;
    public static final int PARTTIME = 2;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");

        computeEmpWage("DMart",20,2,10);
        computeEmpWage("Reliance",15,5,25);
        computeEmpWage("TCS",10,6,30);
    }

    public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
        int totalEmpWage = 0,totalWorkingDays = 0,totalEmpHrs = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            int empHrs = 0;
            totalWorkingDays++;

            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case FULLTIME:
                    empHrs = 8;
                    System.out.println("Employee is Present & Doing Full Time: ");
                    break;

                case PARTTIME:
                    empHrs = 4;
                    System.out.println("Employee is Present & Doing Part Time: ");
                    break;

                default:
                    empHrs = 0;
                    System.out.println("Employee Is Absent: ");
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Total Employee Working Hours is :" + totalEmpHrs);
            int empWage = empHrs * empRatePerHour;
            totalEmpWage += empWage;
            System.out.println("Employee Wage For Month is :" + totalEmpWage);
        }
        System.out.println("Total Employee Wage for Company "+company+" is:"+ totalEmpWage);
        return totalEmpWage;
    }
}