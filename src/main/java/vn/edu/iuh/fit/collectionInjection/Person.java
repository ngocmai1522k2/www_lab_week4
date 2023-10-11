package vn.edu.iuh.fit.collectionInjection;

import java.util.List;

public class Person {
    private int age;
    private String name;
    private List<Address> addresses;
    private List<String> emails;

    public Person() {
    }

    public Person(int age, String name, List<Address> addresses, List<String> emails) {
        this.age = age;
        this.name = name;
        this.addresses = addresses;
        this.emails = emails;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", addresses=" + addresses +
                ", emails=" + emails +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
}
