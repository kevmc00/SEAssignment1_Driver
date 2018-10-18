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
        Student peter = new Student("Peter", LocalDate.parse("1996-06-13"));
        Student amanda = new Student("Amanda", LocalDate.parse("2000-07-24"));
        Student marcus = new Student("Marcus", LocalDate.parse("2003-03-22"));
        
        Module mod1 = new Module("Software Engineering", "CT417");
        mod1.addStudent(peter);
        mod1.addStudent(amanda);
        Module mod2 = new Module("Machine Learning & Data Mining","CT475");
        mod2.addStudent(marcus);
        mod2.addStudent(peter);
        Module mod3 = new Module("System on Chip Design I", "EE341");
        mod3.addStudent(amanda);
        mod3.addStudent(marcus);
        
        Course cs = new Course("Computer Science");
        cs.addModule(mod1);
        cs.addModule(mod2);
        
        Course eng = new Course("Computer and Electronic Engineering");
        eng.addModule(mod3);
        

    }
}
