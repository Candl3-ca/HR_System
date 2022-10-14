package com.fp.fp;

public class Ftime extends Professor implements PayRoll {
    private int degreeRate;

    public Ftime(int PersonID, String FirstName, String LastName, String Email, String address, String Category, String Password, String Phone, String speciality, int DepartmentID, boolean isDean, String degree, int degreeRate) {
        super(PersonID, FirstName, LastName, Email, address, Category, Password, Phone, speciality, DepartmentID, isDean, degree);
        this.degreeRate = degreeRate;
    }

    public int getDegreeRate() {
        return degreeRate;
    }

    public void setDegreeRate(int degreeRate) {
        this.degreeRate = degreeRate;
    }

    public void Payroll(int degreeRate) {
        System.out.println("Payroll for Full-time Professor");
        double salary = (32 * degreeRate * 2) * 0.85;

    }
}
