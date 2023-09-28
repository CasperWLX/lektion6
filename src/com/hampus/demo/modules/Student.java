package com.hampus.demo.modules;

public class Student
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public int DoubleMyAge()
    {
        return age*2;
    }
    public void sayHello(String name)
    {
        System.out.println("Hello " + name + "!");
    }
}