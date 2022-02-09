/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBcontext;
import entity.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
// tương tác db -> lấy dữ liệu
public class StudentDAO {

    Connection conn = null;// kết nối tới SQL sever
    PreparedStatement ps = null;// ném câu lệnh query từ netbean sang SQL
    ResultSet rs = null;// nhận kết quả trả về

    public List<Student> getAllStudent() {
        // khi mk lấy dữ liệu từ sql sever hay có lỗi 
        try {
            String quey = "select * from Student";
            conn = new DBcontext().getConnection();// mở kết nối tới Sql server
            ps = conn.prepareStatement(quey);// ném câu lệnh query vào trong SQL server
            rs = ps.executeQuery();// excute và nhận kết quả trả về
            List<Student> list = new ArrayList<>();
            while (rs.next()) {// kiểm tra từng dòng
                //1 là cột đầu tiên, 2 là cột 2
                Student a = new Student(rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getDate(4));
                list.add(a);
            }

            return list;
        } catch (Exception e) {

        }
        return null;
    }

    public void deleteStudent(String id) {
        String query = "delete from student\n"
                + "where id=?";
        try {

            conn = new DBcontext().getConnection();// mở kết nối tới Sql server
            ps = conn.prepareStatement(query);// ném câu lệnh query vào trong SQL server
            ps.setString(1, id);
            ps.executeUpdate();

        } catch (Exception e) {

        }

    }

    public void insertStudent(String name, String gender, String dob) {
        String query = "insert into Student\n"
                + "values(?,?,?)";
        try {

            conn = new DBcontext().getConnection();// mở kết nối tới Sql server
            ps = conn.prepareStatement(query);// ném câu lệnh query vào trong SQL server
            // set name vào dấu chấm hỏi 1
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, dob);
            ps.executeUpdate();

        } catch (Exception e) {

        }
    }

    public Student getStudentByID(String id) {
        String query = "select * from student\n"
                + "where id = ?";
        try {

            conn = new DBcontext().getConnection();// mở kết nối tới Sql server
            ps = conn.prepareStatement(query);// ném câu lệnh query vào trong SQL server
            ps.setString(1, id);
            rs = ps.executeQuery();// excute và nhận kết quả trả về
            while (rs.next()) {

                return new Student(rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getDate(4));

            }
        } catch (Exception e) {

        }
        return null;
    }

    public void updateStudent(String id, String name, String gender, String dob) {
        String query = "update student \n"
                + "set [name]=?, \n"
                + "gender=?, \n"
                + "dob=?\n"
                + "where id=?";
        try {

            conn = new DBcontext().getConnection();// mở kết nối tới Sql server
            ps = conn.prepareStatement(query);// ném câu lệnh query vào trong SQL server
            // set name vào dấu chấm hỏi 1
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, dob);
            ps.setString(4, id);
            ps.executeUpdate();

        } catch (Exception e) {

        }
    }
}
