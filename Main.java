package com.company;

public class Main {

    public static void main(String[] args) {
	Person person1 = new Person("Jack","Smith",33);
    Person.Passport passOfPerson1 = person1.new Passport("A","123456789");


        System.out.println(person1);
        System.out.println(passOfPerson1);
    }
}
