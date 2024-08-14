/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gabriel
 */
public class Course_DAO extends Content_DAO {
    // Variables
    private int totalCourseHours;

    public Course_DAO(String title, String description, int totalCourseHours) {
        super(title, description);
        this.totalCourseHours = totalCourseHours;
    }
    
    // Functions
    @Override
    public double calculateTotalXP() { return STANDARD_XP * totalCourseHours; }
    
    
    // Getters 
    public int getTotalCourseHours() {
        return totalCourseHours;
    }
    
    
    // Setters
    public void setTotalCourseHours(int totalCourseHours) {
        this.totalCourseHours = totalCourseHours;
    }
    
    
}
