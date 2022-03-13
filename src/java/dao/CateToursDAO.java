/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBcontext;
import entity.CateTour;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Admin
 */
public class CateToursDAO {

    public List<CateTour> getAllCategories() {
        List<CateTour> list = new ArrayList<>();
        try {
            String sql = "select * from categorytours";
            Connection conn = new DBcontext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //              Category category = new Category(rs.getInt(1), rs.getString(2));
                CateTour catetours = CateTour.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2)).build();

                list.add(catetours);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
