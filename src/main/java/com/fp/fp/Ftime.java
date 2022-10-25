package com.fp.fp;

public class Ftime extends Professor implements PayRoll {
    private int degreeRate;

    public Ftime(int PersonID, String FirstName, String LastName, String Email, String address, String Category, String Password,
                 String Phone, String speciality, int DepartmentID, boolean isDean, String degree, int degreeRate) {
        super(PersonID, FirstName, LastName, Email, address, Category, Password, Phone, speciality, DepartmentID, isDean, degree);
        this.degreeRate = degreeRate;
    }

    public int getDegreeRate() {
        return degreeRate;
    }

    public void setDegreeRate(int degreeRate) {
        this.degreeRate = degreeRate;
    }


    @Override
    public void Payroll() {

    }

    @Override
    public void FTPayroll(int degreeRate) {
        System.out.println("The payroll for " + getFirstName() + " " + getLastName() + " is " + ((32 * degreeRate * 2) * 0.85) + " dollars.");
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
