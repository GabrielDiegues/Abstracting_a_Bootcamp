/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Mentoring_DAO extends Content_DAO {
    // Variables
    private LocalDate date;
    
    // Functions
    @Override
    public double calculateTotalXP() { return STANDARD_XP + 20d; }
    
    
    // Getters
    public LocalDate getDate() {
        return date;
    }

    
    // Setters
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    
    // Construtor
    public Mentoring_DAO(String title, String description) {
        super(title, description);
        this.date = LocalDate.now();
    }
}
