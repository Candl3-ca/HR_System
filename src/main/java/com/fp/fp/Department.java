package com.fp.fp;

public class Department {

    private int DepartmentID;
    private String DepartmentName;

    public Department(int DepartmentID, String DepartmentName) {
        this.DepartmentID = DepartmentID;
        this.DepartmentName = DepartmentName;
    }

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentID=" + DepartmentID +
                ", DepartmentName='" + DepartmentName + '\'' +
                '}';
    }


    // NEED TO DO THIS
//    public void showStaffList() {
//        System.out.println("Stall List");
//    }
//
//    public void showProfessorList() {
//        System.out.println("Professor List");
//    }
//
//    public void loadTextFile() {
//        System.out.println("Load Text File");
//    }
//

}
