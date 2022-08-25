package com.company;

public class Person {
    private final String fname;
    private final String lname;
    private final int age;

    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " +
                "fname= " + fname +
                ", lname= " + lname +
                ", age= " + age;
    }
    public class Passport {
        String passCode;
        String passSerie;

        public Passport(String passCode, String passSerie) {
            this.passCode = passCode;
            this.passSerie = passSerie;
        }

        @Override
        public String toString() {
            return "Passport: " +
                    "passCode= " + passCode +
                    ", passSerie= " + passSerie;
        }
    }
}
