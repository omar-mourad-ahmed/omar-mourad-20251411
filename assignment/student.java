/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment6;

/**
 *
 * @author msi
 */
public class student {
     private String studentID;
    private String studentName;
    private double GPA;

    public student(String studentID, String studentName, double GPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.GPA = GPA;
    }

    public student() {
        this.studentID = "000";
        this.studentName = "Unknown";
        this.GPA = 0.0;
    }

    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public double getGPA() { return GPA; }
    public void setGPA(double GPA) { this.GPA = GPA; }

    public boolean isHonorStudent() {
        return GPA >= 3.5;
    }
}
