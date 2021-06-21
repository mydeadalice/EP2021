package ru.tselishcheva.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Repository {
    private static HashMap<String, Person> persons = new HashMap<>();

    static {
        persons.put("Ren Zhang", new Person("Ren Zhang", "(410) 789-8372", "405 Vienna Ct, Franklin, TN"));
        persons.put("Ming-Gia Hsieh", new Person("Ming-Gia Hsieh", "(408) 246-5768", "3336 Oxford Ln, San Jose, CA"));
        persons.put("Antione Hunter", new Person("Antione Hunter", "(773) 684-2461", "4525 S Vincennes Ave Apt 3, Chicago, IL"));
    }

    public ArrayList<Person> listOfPersons() {
        ArrayList<Person> list = new ArrayList<>();
        for (Map.Entry<String, Person> person : persons.entrySet()) {
            list.add(person.getValue());
        }
        return list;
    }

    public Person personByName(String name) {
        return persons.get(name);
    }

    public void addPerson(String name, String phonenumber, String address) {
        persons.put(name, new Person(name, phonenumber, address));
    }

    public void updatePerson(String name, String phonenumber, String address) {
        persons.get(name).setPhonenumber(phonenumber);
        persons.get(name).setAddress(address);
    }

    public void removePerson(String name) {
        persons.remove(name);
    }
}