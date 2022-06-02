/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author window
 */
public class DBCategory {
    Connection conn;
    public String status = "";
    public List<Category> categoryList = new ArrayList<Category>();
    public DBCategory() {
        try {
            conn = new DBContext().getConnection();
            status = "connection!";
        } catch (Exception e) {
            status = "Not connection: " + e.getMessage();
        }
    }
    public List<Category>  loadCategories(){
        categoryList = new ArrayList<Category>();
        try {
            String sql = "select * from CategoryHE151368";
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                 Long id = rs.getLong(1);
                 String name =rs.getString(2);
                 String des = rs.getString(3);
                 categoryList.add(new Category(id, name, des));
            }
           
        } catch (SQLException e) {
            status = "Error when login " +e.getMessage();
        }
        return categoryList;
    }
    public Long insertCategory(Category category) {
        Long id = null;
        try {
            String sql = "insert into CategoryHE151368(name,description) values (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, category.getName());
            ps.setString(2, category.getDescription());
            ps.executeUpdate();
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                id = generatedKeys.getLong(1);
            }
            else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }
        } catch (SQLException e) {
            status = "Error when register " +e.getMessage();
        }
        return id;
    }
}
