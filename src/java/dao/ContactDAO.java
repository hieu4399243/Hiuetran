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

/**
 *
 * @author Admin
 */
public class ContactDAO {

    public boolean saveContact(Contact contact) {
        boolean f = false;

        try {

            String query = "INSERT INTO dbo.Account VALUES(?, ?, ?, ?, ?, ?, ?)";
            Connection con = new DBcontext().getConnection();
            PreparedStatement pstmt = con.prepareStatement(query);

            
            pstmt.setInt(1, contact.getId());
            pstmt.setString(2, contact.getUsername());
            pstmt.setString(3, contact.getPassword());
            pstmt.setString(4, contact.getDisplayName());
            pstmt.setString(5, contact.getAddress());
            pstmt.setString(6, contact.getEmail());
            pstmt.setString(7, contact.getPhone());

            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

}
