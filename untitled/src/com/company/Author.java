package com.company;

class Author {
    private String firstName;
    private String lastName;
    private int age;

    public Author(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void incAge(int age) {
        this.age = age;
    }
}

class Price{

    private int value;
    private String currency;


    public Price(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public int getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }
}

class Book{

    private Author author;

    private Price price;

    public Book(Author author, Price price) {
        this.author = author;
        this.price = price;
    }

    public void doublePrice(){

    }
}
