package com.hampus.demo;

import com.hampus.demo.modules.Student;

public class Main
{
    public static void main(String[] args)
    {

        /* TODO
         *   Change the names of files + packages to relevant names
         *   Find the errors in the code and resolve it!
         */

        //Jag antar att det blir lite fri tolkning för vissa saker här men allt funkar nu
        Student student = new Student(23,"Hampus");

        student.sayHello("Källberg");
        System.out.println(student.DoubleMyAge());
        runMyForLoop();
    }

    public static void runMyForLoop()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Inside the method runMyForLoop" + i);
        }
    }
}