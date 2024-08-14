/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public abstract class Content_DAO {
    // Variables
    protected final float STANDARD_XP = 10f;
    
    private String title;
    private String description;
    
    
    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    
    
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    // Functions
    public abstract double calculateTotalXP();

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.title);
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
        final Content_DAO other = (Content_DAO) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }
    
    
    // Constructor
    public Content_DAO(String title, String description) {
        this.title = title;
        this.description = description;
    }
    
    
    public Content_DAO() {
    }
}
