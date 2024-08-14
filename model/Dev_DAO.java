/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Dev_DAO extends Content_DAO {
   // Variables
    private String name;
    private Set<Content_DAO> enrolledContents;
    private Set<Content_DAO> completedContents;
    private static Set<Dev_DAO> allDevs = new HashSet<>();
    private double xp = 0d;
    // Functions
    public void enrollBootcamp(Bootcamp_DAO bootcamp) { 
        this.enrolledContents.addAll(bootcamp.getContents());
        bootcamp.getEnrolledDevs().add(this);
    }
    
    
    public void advance(Bootcamp_DAO bootcamp) {
        Optional<Content_DAO> optionalContent = enrolledContents.stream().findFirst();
        if(optionalContent.isPresent() && bootcamp.getContents().contains(optionalContent.get())) {
            completedContents.add(optionalContent.get());
            enrolledContents.remove(optionalContent.get());
        }
        else {
            JOptionPane.showMessageDialog(null, "You don't have any enrolled content");
        }
    }
    
    
    
    public void checkingRegisteredDev() {
        if(this.getName().trim().equals("")) { JOptionPane.showMessageDialog(null, "User can't be null"); }
        else if(allDevs.contains(this)) {
            JOptionPane.showMessageDialog(null, "This account already exist");
        }
        else {
        allDevs.add(this);
        JOptionPane.showMessageDialog(null, "You have been registered");
        }
        
    }
    
    

    
    
    @Override
    public double calculateTotalXP() {
        return this.completedContents.stream()
                .mapToDouble(Content_DAO::calculateTotalXP)
                .sum();
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev_DAO other = (Dev_DAO) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    
    // Getters
    public String getName() {
        return name;
    }

    public Set<Content_DAO> getEnrolledContents() {
        return enrolledContents;
    }

    public Set<Content_DAO> getCompletedContents() {
        return completedContents;
    }

    
    public Set<Dev_DAO> getAllDevs() {
        return allDevs;
    }

    
    public double getXp() {
        xp = calculateTotalXP();
        return xp;
    }
    
   
    // Constructor
    public Dev_DAO(String name) {
        this.name = name;
        this.enrolledContents = new LinkedHashSet<>();
        this.completedContents = new LinkedHashSet<>();
    }
}
