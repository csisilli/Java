package com.company;

public class Person {
    private String name;
    private String age;
    private String job;

    //print obj = new print;
    // obj.print()

    //Question 2


    public  Person(String name, String age, String job) {
        this.name = name;
        this.age = age;
        this.job= job;
    }


    //Part of Question 3 part 2



    public String toString()  {


        return "This Person name is: " + name + " "+ "The Person age is: " + " " +age + " "+"This Person job is: "+ job;
    }

    public double assignJob(){
        return 0;
    }

    public boolean printJob(){
        return false;
    }


}


