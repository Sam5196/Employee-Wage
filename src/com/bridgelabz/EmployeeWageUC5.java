package com.bridgelabz;

public class EmployeeWageUC5 {
    static int IS_FULL_TIME = 1;
    static int Is_PART_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int NUM_0F_WORKING_DAYS = 20;
    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        for (int i = 1; i <= NUM_0F_WORKING_DAYS; i++) {
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            if (empCheck == IS_FULL_TIME)
                empHrs = 8;
            else if (empCheck == Is_PART_TIME)
                empHrs = 4;
            else
                empHrs = 0;
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Day " + i + " :" + empWage);
        }
        System.out.println("Total Employee Wage :" + totalEmpWage);

    }



}

