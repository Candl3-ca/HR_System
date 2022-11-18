package com.fp.fp;

public class FullTime extends Professor implements PayRoll {

    private int degreeRate;

    public FullTime() {
        super(0, null, null, null, null, null, null, null, null, null);
    }

    public FullTime(int PersonID, String FirstName, String LastName, String Email, String address, String Password,
            String Phone, String speciality, String degree) {
        super(PersonID, FirstName, LastName, Email, address, "Professor", Password, Phone, speciality, degree);
        this.degreeRate = getDegreeRate();
    }

    @Override
    public void setDegree(String degree) {
        super.setDegree(degree);
        this.degreeRate = getDegreeRate();
    }

    public String getCSVInfo() {
        return "FullTimeProfessor," + super.getCSVInfo();
    }

    @Override
    public double ComputePayRoll() {
        return (32 * degreeRate * 2) * 0.85;
    }

    @Override
    public String toString() {
        return "Full Time Professor: {" + super.toString() + "'}";
    }
}
