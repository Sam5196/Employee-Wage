package com.bridgelabz;

public class EmployeeWageUC6 {
    static int IS_FULL_TIME = 1;
    static int Is_PART_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int NUM_0F_WORKING_DAYS = 20;
    static final int NUM_OF_WORKING_HOURS = 100;
    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpWage = 0;

        while(totalEmpHrs<=NUM_OF_WORKING_HOURS && totalWorkingDays<NUM_0F_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            if (empCheck == IS_FULL_TIME)
                empHrs = 8;
            else if (empCheck == Is_PART_TIME)
                empHrs = 4;
            else
                empHrs = 0;
            empWage=empHrs*EMP_RATE_PER_HOUR;
            totalEmpWage +=empWage;
            totalEmpHrs +=empHrs;
            System.out.println("Day "+totalWorkingDays+":"+empHrs+"*"+EMP_RATE_PER_HOUR+"="+empWage);
        }

        System.out.println("Total Employee Working Days :"+totalWorkingDays);
        System.out.println("Total Employee Working Hours :"+totalEmpHrs);
        System.out.println("Total Employee Wage :"+totalEmpWage);

    }



}

