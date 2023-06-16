package com.example.demo2;
import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
class DoPayroll {
    public static void main(String args[]) throws IOException {
        Scanner diskScanner = new Scanner(new File("C:\\Users\\hp\\Desktop\\EmployeeInfo.txt"));
        for (int empNum = 1; empNum <= 3; empNum++) {
            payOneEmployee(diskScanner);
        }
        diskScanner.close();
    }
    static void payOneEmployee(Scanner aScanner) {
        Employee anEmployee = new Employee();
        anEmployee.setName(aScanner.nextLine());
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();
    }
}
class Employee {
    private String name;
    private String jobTitle;
    public void setName(String nameIn) {
        name = nameIn;
    }
    public String getName() {
        return name;
    }
    public void setJobTitle(String jobTitleIn) {
        jobTitle = jobTitleIn;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void cutCheck(double amountPaid) {
        out.printf("Pay to the order of %s ", name);
        out.printf("(%s) ***$", jobTitle);
        out.printf("%,.2f\n", amountPaid);
    }
}