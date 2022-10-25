package com.fp.fp;

import java.util.Objects;
import java.util.Scanner;

public class Staff extends Person implements PayRoll {
    private String Duty;
    private int workload;
    private int DepartmentID;

    Scanner sc = new Scanner(System.in);

    public Staff(int PersonID, String FirstName, String LastName, String Email, String address, String Category, String Password, String Phone, String Duty, int workload, int DepartmentID) {
        super(PersonID, FirstName, LastName, Email, address, Category, Password, Phone);
        this.Duty = Duty;
        this.workload = workload;
        this.DepartmentID = DepartmentID;
    }

    public String getDuty() {
        return Duty;
    }

    public void setDuty(String duty) {
        Duty = duty;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int departmentID) {
        DepartmentID = departmentID;
    }




    public void VerifyWorkload(int workload) {
        if (workload > 40) {
            System.out.println("Workload is too high"
                             + "\nPlease re-input your workload");
            workload = sc.nextInt();
        } else {
            System.out.println("Workload is valid");
        }
    }


    @Override
    public String toString() {
        return "Staff{" +
                "Duty='" + Duty + '\'' +
                ", workload=" + workload +
                ", DepartmentID=" + DepartmentID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Staff staff)) return false;
        if (!super.equals(o)) return false;
        return getWorkload() == staff.getWorkload() && getDepartmentID() == staff.getDepartmentID() && getDuty().equals(staff.getDuty());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDuty(), getWorkload(), getDepartmentID());
    }

    @Override
    public void Payroll() {

    }

    @Override
    public void FTPayroll(int degreeRate) {

    }

    @Override
    public void PTPayroll(int degreeRate, int hoursWorked) {

    }

    @Override
    public void SPayroll(int workload) {
        System.out.println("The payroll for " + getFirstName() + " " + getLastName() + " is " + ((workload * 32 * 2) * 0.75 )+ " dollars.");
    }

    @Override
    public void welcomeUser() {
        System.out.println("Welcome " + getFirstName() + " " + getLastName() + "!");
    }

}
