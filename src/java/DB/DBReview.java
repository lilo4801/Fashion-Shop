/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Model.Review;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author window
 */
public class DBReview {
    Connection conn;
    public String status = "";
    public List<Review> reviewsList = new ArrayList<Review>();
    public DBReview() {
        try {
            conn = new DBContext().getConnection();
            status = "connection!";
        } catch (Exception e) {
            status = "Not connection: " + e.getMessage();
        }
    }
    public List<Review> loadReviews(){
        reviewsList = new ArrayList<Review>();
        try {
            String sql = "select * from ReviewHE151368";
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                 Long id = rs.getLong(1);
                 String comment = rs.getString(2);
                 int rating = rs.getInt(3);
                 Long productId = rs.getLong(4);
                 Long userId= rs.getLong(5);
                 Review re = new Review(id, comment, rating, productId, userId);
                 reviewsList.add(re);
            }
           
        } catch (SQLException e) {
            status = "Error when login " +e.getMessage();
        }
        return reviewsList;
    }
    public void updateReview(Review re){
        
        try {
            String sql = "UPDATE  ReviewHE151368 set rating = ? , comment =? WHERE id = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, re.getRating());
            ps.setString(2, re.getComment());
            ps.setLong(3, re.getId());
            ps.execute();
           
        } catch (SQLException e) {
            status = "Error when update review " +e.getMessage();
        }
       
    }
    public List<Review> loadReviewsByProductId(Long idP){
        reviewsList = new ArrayList<Review>();
        try {
            String sql = "select * from ReviewHE151368 where product_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, idP);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                 Long id = rs.getLong(1);
                 String comment = rs.getString(2);
                 int rating = rs.getInt(3);
                 Long productId = rs.getLong(4);
                 Long userId= rs.getLong(5);
                 Review re = new Review(id, comment, rating, productId, userId);
                 reviewsList.add(re);
            }
           
        } catch (SQLException e) {
            status = "Error when login " +e.getMessage();
        }
        return reviewsList;
    }
     public Review loadReviewsByUserId(Long userIdP,Long productIdP){
        Review rv = null;
        try {
            String sql = "select * from ReviewHE151368 where user_id = ? and product_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, userIdP);
            ps.setLong(2, productIdP);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                 Long id = rs.getLong(1);
                 String comment = rs.getString(2);
                 int rating = rs.getInt(3);
                 Long productId = rs.getLong(4);
                 Long userId= rs.getLong(5);
                 rv = new Review(id, comment, rating, productId, userId);
            }
           
        } catch (SQLException e) {
            status = "Error when review " +e.getMessage();
        }
        return rv;
    }
    public Long insertReview(Review re) {
        Long id = null;
        try {
            String sql = "insert into ReviewHE151368(comment,rating,product_id,user_id) values (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,re.getComment());
            ps.setInt(2, re.getRating());
            ps.setLong(3, re.getProductId());
            ps.setLong(4, re.getUserId());
           
            ps.executeUpdate();
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                id = generatedKeys.getLong(1);
            }
            else {
                throw new SQLException("Creating review failed, no ID obtained.");
            }
        }
        } catch (SQLException e) {
            status = "Error when insert review " +e.getMessage();
        }
        
        return id;
    }
}
