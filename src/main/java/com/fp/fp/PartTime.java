package com.fp.fp;

public class PartTime extends Professor implements PayRoll {

    private int degreeRate;
    private int hoursWorked;

    public PartTime() {
        super(0, null, null, null, null, null, null, null, null, null);
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public PartTime(int PersonID, String FirstName, String LastName, String Email, String address, String Password, String Phone,
            String speciality, String degree, int hoursWorked) {
        super(PersonID, FirstName, LastName, Email, address, "Professor", Password, Phone, speciality, degree);
        this.degreeRate = getDegreeRate();
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void setDegree(String degree) {
        super.setDegree(degree);
        this.degreeRate = getDegreeRate();
    }
    
    

    public String getCSVInfo() {
        return "PartTimeProfessor," + super.getCSVInfo() + "," + hoursWorked;
    }

    @Override
    public double ComputePayRoll() {
        return (hoursWorked * degreeRate * 2) * 0.76;
    }

    @Override
    public String toString() {
        return "Part Time Professor: {" + super.toString()
                + ", hoursWorked='" + hoursWorked + "'}";
    }

}
