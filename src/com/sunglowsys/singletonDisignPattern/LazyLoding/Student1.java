package com.sunglowsys.singletonDisignPattern.LazyLoding;

public class Student1 {
    //we take here null so that on requirement object is created
    private  static  Student1 st1 = null;

    private Student1() {
        System.out.println("object is created ");
    }
    public static  Student1 getInstance1() {
        if (st1==null) {

            //we use here syncronization so that multiple thread cannot create object
            synchronized (Student1.class) {
                if (st1 == null) {

                }
                st1 = new Student1();
            }
        }
        return st1;
    }

}
