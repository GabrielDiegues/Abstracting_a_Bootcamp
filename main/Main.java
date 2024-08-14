/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import model.Bootcamp_DAO;
import model.Content_DAO;
import model.Course_DAO;
import model.Mentoring_DAO;

/**
 *
 * @author Gabriel
 */
public class Main {
    public static Bootcamp_DAO bootcamp1;
    public static Bootcamp_DAO bootcamp2;
    public static Set<Bootcamp_DAO> allBootcamps;
    public static void main(String[] args) {
        Set<Content_DAO> temp = new LinkedHashSet();
        allBootcamps = new HashSet<>();
        allBootcamps.add(bootcamp1);
        allBootcamps.add(bootcamp2);
        
        temp.add(new Course_DAO("Java Course", "Java Course Description", 8));
        temp.add(new Course_DAO("SpringBoot Course", "SpringBoot Course Description", 4));
        temp.add(new Mentoring_DAO("Java Mentoring", "Java Mentoring Description"));
        bootcamp1 = new Bootcamp_DAO("Bootcamp Java Developer", temp);
        temp = new LinkedHashSet();
        
        temp.add(new Course_DAO("Python Course", "Python Course Description", 8));
        temp.add(new Course_DAO("NumPy Course", "Numpy Description", 4));
        temp.add(new Mentoring_DAO("Python Mentoring", "Python Mentoring Description"));
        bootcamp2 = new Bootcamp_DAO("Bootcamp Python Developer", temp);

        
        
        //System.out.println(bootcamp1.getName());
        new view.Index_GUI().setVisible(true);
    }
    
}
