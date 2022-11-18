package com.fp.fp;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private int DepartmentID;
    private String DepartmentName;

    private Professor dean;

    private List<Person> persons;

    public Department() {
        this.DepartmentID = 0;
        this.DepartmentName = "";
        persons = new ArrayList<>();
    }

    public Department(int DepartmentID, String DepartmentName) {
        this.DepartmentID = DepartmentID;
        this.DepartmentName = DepartmentName;
        persons = new ArrayList<>();
    }

    public List<Person> getPersons() {
        return persons;
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

    public Professor getDean() {
        return dean;
    }

    public void setDean(Professor dean) {
        this.dean = dean;
    }

    public void addPerson(Person person) throws Exception {
        if (contains(person)) {
            throw new Exception("Person with same id already added!");
        }
        persons.add(person);
    }

    @Override
    public String toString() {
        return "Department{"
                + "DepartmentID=" + DepartmentID
                + ", DepartmentName='" + DepartmentName + '\''
                + '}';
    }

    public void showStaffList() {

        System.out.println("Staff List");
        for (Person p : persons) {
            if (p instanceof Staff) {
                System.out.println(p);
            }
        }
    }

    public void showProfessorList() {
        System.out.println("Professor List");
        for (Person p : persons) {
            if (p instanceof Professor) {
                System.out.println(p);
            }
        }
    }

    public void loadTextFile() {
        System.out.println("Load Text File");

    }

    private boolean contains(Person person) {
        for (Person p : persons) {
            if (p.getPersonID() == person.getPersonID()) {
                return true;
            }
        }
        return false;
    }

    public String getInfo() {
        String s = "";
        s += ("Department ID: " + DepartmentID) + "\n";
        s += ("Department Name: " + DepartmentName) + "\n";
        s += ("Department Dean: " + dean) + "\n";
        s += ("Department Memebers") + "\n";

        for (Person person : persons) {
            s += person.getInfo() + "\n";
        }
        return s;
    }

}
