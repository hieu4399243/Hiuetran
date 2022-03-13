/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBcontext;
import entity.Product;
import entity.Tours;
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
public class ToursDAO {
public List<Tours> getAllTours() {
        List<Tours> list = new ArrayList<>();
        try {
            String sql = "select * from tours";
            Connection conn = new DBcontext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tours tours = Tours.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .quantity(rs.getInt(3))
                        .price(rs.getDouble(4))
                        
                        .imageUrl(rs.getString(5))
                        .createdDate(rs.getString(6))
                        .categoryId(rs.getInt(7)).build();
                list.add(tours);
            }
        } catch (Exception ex) {
            Logger.getLogger(CateToursDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Tours> getToursByCategoryTourId(int categoryId) {
        List<Tours> list = new ArrayList<>();
        try {
            String sql = "select * from tours where tours.category_id=?";
            Connection conn = new DBcontext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tours tours = Tours.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .quantity(rs.getInt(3))
                        .price(rs.getDouble(4))
                        
                        .imageUrl(rs.getString(5))
                        .createdDate(rs.getString(6))
                        .categoryId(rs.getInt(7)).build();
                list.add(tours);
            }
        } catch (Exception ex) {
            Logger.getLogger(CateToursDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

     public int getTotalTours() {
        try {
            String sql = "select count(id)  from Tours ";
            Connection conn = new DBcontext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(CateToursDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Tours> search(String keyword) {
        List<Tours> list = new ArrayList<>();
        try {
            String sql = "select *  from Tours where name like ?";
            Connection conn = new DBcontext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tours tours = Tours.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .quantity(rs.getInt(3))
                        .price(rs.getDouble(4))
                        
                        .imageUrl(rs.getString(5))
                        .createdDate(rs.getString(6))
                        .categoryId(rs.getInt(7)).build();
                list.add(tours);
            }
        } catch (Exception ex) {
            Logger.getLogger(CateToursDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public Tours getToursByID(int toursId) {
        try {
            String sql = "select *  from Tours where id = ?";
            Connection conn = new DBcontext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, toursId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tours tours = Tours.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .quantity(rs.getInt(3))
                        .price(rs.getDouble(4))
                        
                        .imageUrl(rs.getString(5))
                        .createdDate(rs.getString(6))
                        .categoryId(rs.getInt(7)).build();
                return tours;
            }
        } catch (Exception ex) {
            Logger.getLogger(CateToursDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
