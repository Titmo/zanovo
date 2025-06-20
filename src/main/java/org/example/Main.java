package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.allStaff();
        System.out.println("employeeBook.totalSalary() = " + employeeBook.totalSalary());
        System.out.println("employeeBook.max() = " + employeeBook.max());
        System.out.println("employeeBook.min() = " + employeeBook.min());
        System.out.println("employeeBook.averageSalary() = " + employeeBook.averageSalary());
        employeeBook.getAllName();
        employeeBook.salaryIndexation(10);
        System.out.println("employeeBook.minDepartmentSalary(3) = " + employeeBook.minDepartmentSalary(3));
        System.out.println("employeeBook.maxDepartmentSalary(3) = " + employeeBook.maxDepartmentSalary(3));
        System.out.println("employeeBook.totalSalaryDep(3) = " + employeeBook.totalSalaryDep(3));
        System.out.println("employeeBook.averageSalaryDep(3) = " + employeeBook.averageSalaryDep(3));
        employeeBook.salaryIndexationDep(3,10);
        employeeBook.getAllNameDap(3);
        employeeBook.salaryLess(80_000);
        employeeBook.salaryHigher(80_000);

    }


}