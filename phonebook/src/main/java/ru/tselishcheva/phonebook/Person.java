package ru.tselishcheva.phonebook;

public class Person {
    private String name;
    private String phonenumber;
    private String address;

    public Person(String name, String phonenumber, String address) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}