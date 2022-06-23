package com.sunglowsys.singletonDisignPattern.EagerLoading;

public class TestStudent {
    public static void main(String[] args) {

        Student.getInstance();
        Student.getInstance();
        Student.getInstance();
        Student.getInstance();
        // call  the methode multiple time but only one object is created
    }
}
