/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment6;

/**
 *
 * @author msi
 */
public class Assignment6 {

    public static void main(String[] args) {
      student s1 = new student("101", "Ahmed", 3.2);
        student s2 = new student();

        s2.setGPA(3.8);

        System.out.println("Student 1: ID = " + s1.getStudentID() + ", Name = " + s1.getStudentName() + ", GPA = " + s1.getGPA());
        System.out.println("Honor student? " + s1.isHonorStudent());

        System.out.println("Student 2: ID = " + s2.getStudentID() + ", Name = " + s2.getStudentName() + ", GPA = " + s2.getGPA());
        System.out.println("Honor student? " + s2.isHonorStudent());
    }
}
