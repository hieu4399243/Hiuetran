/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Student;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        StudentDAO student = new StudentDAO();
        List<Student> list = student.getAllStudent();
        for (Student a : list) {
            System.out.println("ID "+ a.getId()+ "Name " + a.getName() + "Gender " + a.getGender()+"dob "+a.getDob());
        }
//          Student s=student.getStudentByID("2");
//          System.out.println(s);
    }
}
