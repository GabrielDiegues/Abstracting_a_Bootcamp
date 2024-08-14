/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Gabriel
 */
public class Bootcamp_DAO {
    // Variables
    private String name;
    private final LocalDate initialDate;
    private final LocalDate finalDate;
    private Set<Dev_DAO> enrolledDevs;
    private Set<Content_DAO> contents;
    
    
    // Getters
    public Set<Content_DAO> getContents() {
        return contents;
    }

    
    public Set<Dev_DAO> getEnrolledDevs() {
        return enrolledDevs;
    }
    
    
    public String getName() {
        return name;
    }
    // Constructor
    public Bootcamp_DAO(String name, Set<Content_DAO> contents) {
        this.name = name;
        this.contents = contents;
        this.initialDate = LocalDate.now();
        this.finalDate = initialDate.plusDays(45);
        this.enrolledDevs = new HashSet();
    }
}
