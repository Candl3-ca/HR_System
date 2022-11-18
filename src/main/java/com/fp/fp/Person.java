package com.fp.fp;

public abstract class Person {

    private int PersonID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String address;
    private String Password;
    private String Phone;

    public Person(int PersonID, String FirstName, String LastName, String Email, String address, String Password, String Phone) {
        this.PersonID = PersonID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.address = address;
        this.Password = Password;
        this.Phone = Phone;
    }

    public int getPersonID() {
        return PersonID;
    }

    public void setPersonID(int PersonID) {
        this.PersonID = PersonID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public abstract String getCategory();

    public String getCSVInfo() {
        return PersonID
                + "," + FirstName
                + "," + LastName
                + "," + Email
                + "," + address
                + "," + Password
                + "," + Phone;
    }

    @Override
    public String toString() {
        return "ID=" + PersonID
                + ", FirstName='" + FirstName + '\''
                + ", LastName='" + LastName + '\''
                + ", Email='" + Email + '\''
                + ", address='" + address + '\''
                + ", Category='" + getCategory() + '\''
                + ", Password='" + Password + '\''
                + ", Phone='" + Phone + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return getPersonID() == person.getPersonID() && getFirstName().equals(person.getFirstName()) && getLastName().equals(person.getLastName()) && getEmail().equals(person.getEmail()) && getAddress().equals(person.getAddress()) && getCategory().equals(person.getCategory()) && getPassword().equals(person.getPassword()) && getPhone().equals(person.getPhone());
    }

    public String getInfo() {
        return (toString());
    }

}
