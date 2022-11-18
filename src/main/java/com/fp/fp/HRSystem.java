package com.fp.fp;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HRSystem {

    private ArrayList<Department> departments;

    public HRSystem() {
        departments = new ArrayList<>();
    }

    public void addPerson(int depID, Person person) throws Exception {

        for (Department department : departments) {
            if (department.getDepartmentID() == depID) {

                department.addPerson(person);

                return;
            }
        }

        throw new Exception("Invalid Department ID");
    }

    public void setDean(int depid, Person person) throws Exception {
        if (!(person instanceof Professor)) {
            throw new Exception("Dean should be Professor!");
        }
        for (Department department : departments) {
            if (department.getDepartmentID() == depid) {

                department.setDean((Professor) person);

                return;
            }
        }

        throw new Exception("Invalid Department ID");
    }

    public String getInfo() {
        String s = "";
        for (Department department : departments) {
            s += department.getInfo() + "\n";
        }
        return s;
    }

    public void addDepartment(Department dep) throws Exception {
        for (Department department : departments) {
            if (department.getDepartmentID() == dep.getDepartmentID()) {
                throw new Exception("Department with this id already exists!");
            }
        }
        departments.add(dep);

    }

    public void saveData() {
        try {
            PrintWriter pw = new PrintWriter(new File("Departments.txt"));
            for (Department department : departments) {
                pw.println(department.getDepartmentID() + "," + department.getDepartmentName());
            }

            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            PrintWriter pw = new PrintWriter(new File("Persons.txt"));
            for (Department department : departments) {
                for (Person person : department.getPersons()) {
                    pw.println(department.getDepartmentID() + "," + person.getCSVInfo() + "," + false);
                }
                if (department.getDean() != null) {
                    pw.println(department.getDepartmentID() + "," + department.getDean().getCSVInfo() + "," + true);
                }
            }

            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadData() {

        try {

            Scanner reader = new Scanner(new File("Departments.txt"));

            reader.useDelimiter(",");

            while (reader.hasNextLine()) {

                Scanner sc = new Scanner(reader.nextLine());
                sc.useDelimiter(",");

                int depID = sc.nextInt();
                String name = sc.next();
                try{
                    addDepartment(new Department(depID, name));
                }catch (Exception ex){
                    System.out.println(ex);
                }

            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }


        try {

            Scanner reader = new Scanner(new File("Persons.txt"));

            reader.useDelimiter(",");

            while (reader.hasNextLine()) {

                Scanner sc = new Scanner(reader.nextLine());
                sc.useDelimiter(",");

                int depID = sc.nextInt();
                String type = sc.next();
                boolean isDean = false;
                Person person = null;
                if (type.equals("Staff")) {
                    person = new Staff(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
                    String d = sc.next();
                    isDean = d.equals("true");
                } else if (type.equals("FullTimeProfessor")) {
                    person = new FullTime(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
                    String d = sc.next();
                    isDean = d.equals("true");
                } else if (type.equals("PartTimeProfessor")) {
                    person = new PartTime(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
                    String d = sc.next();
                    isDean = d.equals("true");
                }
                if (person != null) {
                    if (isDean) {
                        setDean(depID, person);
                    } else {
                        addPerson(depID, person);
                    }
                }
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

    }


}
