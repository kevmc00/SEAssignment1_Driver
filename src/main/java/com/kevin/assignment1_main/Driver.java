/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevin.assignment1_main;

import com.kevin.assignment1.*;
import java.time.*;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args){
        
        Course eng = new Course("Computer and Electronic Engineering");
        Course cs = new Course("Computer Science");
        
        Module mod1 = new Module("Software Engineering", "CT417");
        Module mod2 = new Module("Machine Learning & Data Mining","CT475");
        Module mod3 = new Module("System on Chip Design I", "EE341");
        
        cs.addModule(mod1);
        cs.addModule(mod2);
        eng.addModule(mod2);
        eng.addModule(mod3);
        
        Student peter = new Student("Peter", LocalDate.parse("1996-06-13"), cs);
        Student amanda = new Student("Amanda", LocalDate.parse("2000-07-24"), cs);
        Student marcus = new Student("Marcus", LocalDate.parse("2003-03-22"), eng);
        
        ArrayList<Course> allCourse = new ArrayList<Course>();
        allCourse.add(cs);
        allCourse.add(eng);
        
        ArrayList<Student> allStudent = new ArrayList<Student>();
        allStudent.add(peter);
        allStudent.add(amanda);
        allStudent.add(marcus);
        
        System.out.println("************ Courses ************");
        for (Course c : allCourse){
            System.out.println(c.getName() + "\nModules:");
            ArrayList<Module> modules = c.getModules();
            for (Module m : modules){
                System.out.println(m.getName());
            }
            System.out.println("------------------------------------");
        }
        System.out.println("************ Students ************");
        for (Student s : allStudent){
            System.out.println(s.getName() + " (Username: " + s.getUsername() + ")");
            System.out.println("Course: " + s.getCourse().getName());
            System.out.println("\nList of Modules:");
            ArrayList<Module> modules = s.getModules();
            for(Module m : modules){
                System.out.println(m.getName());
            }
            System.out.println("------------------------------------");
        }
        
    }
}
