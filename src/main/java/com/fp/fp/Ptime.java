package com.fp.fp;

public class Ptime extends Professor implements PayRoll {

    private int degreeRate;
    private int hoursWorked;

    public Ptime(int PersonID, String FirstName, String LastName, String Email, String address, String Category, String Password, String Phone, String speciality, int DepartmentID, boolean isDean, String degree, int degreeRate, int hoursWorked) {
        super(PersonID, FirstName, LastName, Email, address, Category, Password, Phone, speciality, DepartmentID, isDean, degree);
        this.degreeRate = degreeRate;
        this.hoursWorked = hoursWorked;
    }

    public int getDegreeRate() {
        return degreeRate;
    }

    public void setDegreeRate(int degreeRate) {
        this.degreeRate = degreeRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void Payroll(int degreeRate, int hoursWorked) {
        System.out.println("Payroll for Part-time Professor");
        double salary = (32 * degreeRate * 2) * 0.75;

    }


}