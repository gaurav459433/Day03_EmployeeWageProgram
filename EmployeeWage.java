package com.bridgelabz.assignmentsrfp259.day03.employeewage;

public class EmployeeWage {
    public static final int FULLTIME = 1;
    public static final int PARTTIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");

        EmployeeWage dmart = new EmployeeWage("DMart", 20, 2, 10);
        EmployeeWage reliance = new EmployeeWage("Reliance", 15, 5, 25);
        EmployeeWage tcs = new EmployeeWage("TCS", 10, 6, 30);
        dmart.computeEmpWage();
        reliance.computeEmpWage();
        tcs.computeEmpWage();
    }

    public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public int computeEmpWage() {

        int totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;
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
            System.out.println("Day-" + totalWorkingDays + " Employee Wage is :" + empWage);
        }
        System.out.println("Total Employee Wage for Company " + company + " is:" + totalEmpWage);
        return totalEmpWage;
    }
}