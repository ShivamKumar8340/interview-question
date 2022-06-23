package com.sunglowsys.singletonDisignPattern.EagerLoading;

public class Student {

    // we  use private here so that any case multiple object is not created
    private static Student st = new Student();


    //it is mandatory to create private constructor so that  any case multiple object is not created
    private Student() {
        System.out.println("student object is created");
    }
    //we use static so that we call this methode by class Name
    public static Student getInstance() {
        return st;
    }

}
