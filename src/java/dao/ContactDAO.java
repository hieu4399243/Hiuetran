/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBcontext;
import entity.Contact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ContactDAO {

    public Contact login(String user, String pass) {
        String query = "select * from account\n"
                + "where [username]=? and [password]=?";
        try {
            Connection conn = new DBcontext().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Contact contact = Contact.builder()
                        .id(rs.getInt(1))
                        .username(rs.getString(2))
                        .password(rs.getString(3))
                        .isSell(rs.getInt(4))
                        .isAdmin(rs.getInt(5))
                        .displayName(rs.getString(6))
                        .role(rs.getString(7)).build();
                return contact;

            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Contact checkExist(String user) {
        String query = "select * from account\n"
                + "where [username]=?";
        try {
            Connection conn = new DBcontext().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Contact contact = Contact.builder()
                        .id(rs.getInt(1))
                        .username(rs.getString(2))
                        .password(rs.getString(3))
                        .isSell(rs.getInt(4))
                        .isAdmin(rs.getInt(5))
                        .displayName(rs.getString(6))
                        .role(rs.getString(7)).build();
                return contact;

            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void signUp(String user, String pass,String displayname) {
        String query = "insert into Account \n"
                + "values ( ?, ?, 0,0,?,?)";
        try {
            Connection conn = new DBcontext().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, displayname);
            ps.executeUpdate();

        } catch (Exception e) {

        }
    }

}
