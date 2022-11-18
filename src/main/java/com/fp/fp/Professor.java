package com.fp.fp;

import java.util.Objects;

public abstract class Professor extends Person implements PayRoll {

    private String speciality;
    private String degree;

    public Professor(int PersonID, String FirstName, String LastName, String Email, String address, String Category, String Password, String Phone, String speciality, String degree) {
        super(PersonID, FirstName, LastName, Email, address, Password, Phone);
        this.speciality = speciality;
        this.degree = degree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getDegreeRate() {
        if (degree.equals("PhD")) {
            return 112;
        }
        if (degree.equals("Master")) {
            return 82;
        }
        if (degree.equals("Bachelor")) {
            return 42;
        }
        return 0;
    }

    public String getCSVInfo() {
        return super.getCSVInfo() + "," + speciality + "," + degree;
    }

    @Override
    public String getCategory() {
        return "Teacher";
    }

    @Override
    public String toString() {
        return super.toString()
                + ", speciality='" + speciality + '\''
                + ", degree='" + degree + '\''
                + ", degree rate='" + getDegreeRate() + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Professor)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Professor professor = (Professor) o;
        return Objects.equals(getSpeciality(), professor.getSpeciality()) && Objects.equals(getDegree(), professor.getDegree());
    }

}
