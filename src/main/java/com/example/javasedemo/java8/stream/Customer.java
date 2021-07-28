package com.example.javasedemo.java8.stream;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/28
 */
public class Customer {
    private int id;
    private String firstName;
    private String lastName;

    /**
     * Creates an instance of customer.
     */
    public Customer(final int id, final String firstName, final String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

}