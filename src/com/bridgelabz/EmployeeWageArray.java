package com.bridgelabz;


public class EmployeeWageArray implements InterfaceCompanyWage  {
    int numberOfCompanies = 0;
    CompanyEmpWage[] companyEmployeeWagesArray = new CompanyEmpWage[5];



    public void addCompanyEmpWage(String companyName, int totalWorkingHr, int totalWorkingDays, int wagePerHr) {
        companyEmployeeWagesArray[numberOfCompanies] = new CompanyEmpWage(companyName, totalWorkingHr, totalWorkingDays, wagePerHr);
        numberOfCompanies++;
    }

    public void calWageComputation() {
        for (int i = 0; i < numberOfCompanies; i++) {
            companyEmployeeWagesArray[i].setTotalEmployeeWage(this.calWageComputation(companyEmployeeWagesArray[i]));
            System.out.println(companyEmployeeWagesArray[i]);
        }
    }


    public int calWageComputation(CompanyEmpWage companyEmployeeWage) {
        int empHr = 0, maxWorkingDays = 0, maxWorkingHr = 0;

        while (maxWorkingHr <= companyEmployeeWage.totalWorkingHr && maxWorkingDays < companyEmployeeWage.totalWorkingDays) {
            maxWorkingDays++;
            int check = (int) (Math.random() * 3);
            switch (check) {
                case 1:
                    empHr = 8;
                    break;
                case 2:
                    empHr = 4;
                    break;
                default:
                    empHr = 0;
                    break;
            }

            maxWorkingHr += empHr;


            int empWage = maxWorkingHr * companyEmployeeWage.wagePerHr;
            companyEmployeeWage.totalEmployeeWage = companyEmployeeWage.totalEmployeeWage + empWage;
        }
        return companyEmployeeWage.totalEmployeeWage;
    }
    public static void main(String[] args) {
        EmployeeWageArray employeeWage = new EmployeeWageArray();
        employeeWage.addCompanyEmpWage("jio", 34, 4, 19);
        employeeWage.addCompanyEmpWage("Airtel", 15, 7, 27);
        employeeWage.calWageComputation();
    }
}