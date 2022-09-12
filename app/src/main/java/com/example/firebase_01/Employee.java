package com.example.firebase_01;

public class Employee {
    private String Name01;
    private String Position03;
    public Employee(){}

    public Employee(String name01, String position03) {
        Name01 = name01;
        Position03 = position03;
    }

    public String getName01() {
        return Name01;
    }

    public void setName01(String name01) {
        Name01 = name01;
    }

    public String getPosition03() {
        return Position03;
    }

    public void setPosition03(String position03) {
        Position03 = position03;
    }
}
