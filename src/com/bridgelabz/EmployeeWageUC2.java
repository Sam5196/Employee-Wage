package com.bridgelabz;

public class EmployeeWageUC2 {
    static int IS_FULL_TIME = 1;
    static int EMP_WAGE_PER_HOUR = 20;
    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);

        if (empCheck == 1)
            System.out.println("Full Time");
        else if (empCheck == 2)
            System.out.println("Part Time");
        else
            System.out.println("Employee Absent");

        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
        } else
            empHrs = 0;

        empWage = empHrs * EMP_WAGE_PER_HOUR;
        System.out.println("Employee Hours :" + empHrs);
        System.out.println("Employee Wage :" + empWage);


    }
}
