package com.bridgelabz.assignmentsrfp259.day03.employeewage;

public class EmployeeWage {
    public static final int FULLTIME = 1;
    public static final int PARTTIME = 2;
    public static final int EMP_WAGE_PH = 20;
    public static final int WORKING_DAYS_PM = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        EmployeeWage ew = new EmployeeWage();
        ew.computeEmpWage(empHrs, empWage, totalEmpWage, totalEmpHrs, totalWorkingDays);
    }

    public void computeEmpWage(int empHrs, int empWage, int totalEmpWage, int totalEmpHrs, int totalWorkingDays) {
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < WORKING_DAYS_PM) {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case FULLTIME:
                    empHrs = 8;
                    empWage = empHrs * EMP_WAGE_PH;
                    System.out.println("Employee Daily Wage is :" + empWage);
                    break;

                case PARTTIME:
                    empHrs = 4;
                    empWage = empHrs * EMP_WAGE_PH;
                    System.out.println("Employee PartTime Wage is :" + empWage);
                    break;

                default:
                    empHrs = 0;
                    empWage = empHrs * EMP_WAGE_PH;
                    System.out.println("Employee Is Absent So Wage is :" + empWage);
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Total Employee Working Hours is :" + totalEmpHrs);
            totalEmpWage += empWage;
            System.out.println("Employee Wage For Month is :" + totalEmpWage);
        }
    }
}