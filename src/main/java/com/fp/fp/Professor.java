package com.fp.fp;

import java.util.Objects;
import java.util.Scanner;

public class Professor extends Person implements PayRoll {
    private String speciality;
    private int DepartmentID;
    private boolean isDean;
    private String degree;

    Scanner sc = new Scanner(System.in);

    public Professor(int PersonID, String FirstName, String LastName, String Email, String address, String Category, String Password, String Phone, String speciality, int DepartmentID, boolean isDean, String degree) {
        super(PersonID, FirstName, LastName, Email, address, Category, Password, Phone);
        this.speciality = speciality;
        this.DepartmentID = DepartmentID;
        this.isDean = isDean;
        this.degree = degree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int departmentID) {
        DepartmentID = departmentID;
    }

    public boolean isDean() {
        return isDean;
    }

    public void setDean(boolean dean) {
        isDean = dean;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "speciality='" + speciality + '\'' +
                ", DepartmentID=" + DepartmentID +
                ", isDean=" + isDean +
                ", degree='" + degree + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor professor)) return false;
        if (!super.equals(o)) return false;
        return getDepartmentID() == professor.getDepartmentID() && isDean() == professor.isDean() && Objects.equals(getSpeciality(), professor.getSpeciality()) && Objects.equals(getDegree(), professor.getDegree());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeciality(), getDepartmentID(), isDean(), getDegree());
    }


//    Need to verify if the ID is valid for both the person and the department. If the ID is not valid, the user will be prompted to re-enter the ID and throw an illegal exception.

//    public void VerifyDepartment() {
//        System.out.println("Input your Department ID");
//         DepartmentID = sc.nextInt();
//        if (DepartmentID != null) {
//            System.out.println("Department ID is valid");
//        } else {
//            throw new IllegalArgumentException("Department ID is invalid");
//        }
//    }
//
//    public void VerifyID(int PersonID) {
//        if (PersonID != null) {
//            System.out.println("ID is valid");
//        } else {
//            throw new IllegalArgumentException("ID is invalid");
//        }
//    }

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

    }

    @Override
    public void welcomeUser() {
        System.out.println("Welcome " + getFirstName() + " " + getLastName() + "!");
    }
}
