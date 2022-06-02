/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author window
 */
public class DBUser {
    Connection conn;
    public String status = "";
    public List<User> usersList = new ArrayList<User>();
    public DBUser() {
        try {
            conn = new DBContext().getConnection();
            status = "connection!";
        } catch (Exception e) {
            status = "Not connection: " + e.getMessage();
        }
    }
    public List<User> loadUsers(){
        usersList = new ArrayList<User>();
        try {
            String sql = "select * from UsersHE151368";
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                 String username = rs.getString("username");
                 String email = rs.getString("email");
                 String phone = rs.getString("phone");
                 User user =  new User();
                 user.setUsername(username);
                 user.setEmail(email);
                 user.setPhone(phone);
               
                 usersList.add(user);
            }
           
        } catch (SQLException e) {
            status = "Error when login " +e.getMessage();
        }
        return usersList;
    }
    public Long login(String username,String password) {
        Long id = null;
        try {
            String sql = "select * from UsersHE151368 where username = ? and password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                 id = rs.getLong(1);   
            }
           
        } catch (SQLException e) {
            status = "Error when login " +e.getMessage();
        }
        return id;
    }
    public Long register(User user) {
        Long id = null;
        try {
            String sql = "insert into UsersHE151368(firstName,lastName,gender,username,password,email) values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setBoolean(3, user.isGender());
            ps.setString(4, user.getUsername());
            ps.setString(5, user.getPassword());
            ps.setString(6, user.getEmail());
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
    public User loadUserById(Long userId){
        User user = null;
        try {
            String sql = "select * from UsersHE151368 where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1,userId);      
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong(1);
                String firstName = rs.getString(2);
                String lastName  = rs.getString(3);
                boolean gender = rs.getBoolean(4);
                String address = rs.getString(5);
                String username = rs.getString(6);
                String password = rs.getString(7);
                String email = rs.getString(8);
                String phone = rs.getString(9);
                String image = rs.getString(10);
                int role  = rs.getInt(11);
                user = new User(id, firstName, lastName, gender, address, username, password, email, phone, image, role);
            }
        } catch (SQLException e) {
            status = "Error when load by id " +e.getMessage();
        }
        return user;
    }public User findUserByUsernameandEmail(String usernameP,String emailP){
        User user = null;
        try {
            String sql = "select * from UsersHE151368 where username = ? and email = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,usernameP);      
            ps.setString(2,emailP);      
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong(1);
                String firstName = rs.getString(2);
                String lastName  = rs.getString(3);
                boolean gender = rs.getBoolean(4);
                String address = rs.getString(5);
                String username = rs.getString(6);
                String password = rs.getString(7);
                String email = rs.getString(8);
                String phone = rs.getString(9);
                String image = rs.getString(10);
                int role  = rs.getInt(11);
                user = new User(id, firstName, lastName, gender, address, username, password, email, phone, image, role);
            }
        } catch (SQLException e) {
            status = "Error when load by id " +e.getMessage();
        }
        return user;
    }
     
    public void update(User user) {
        try {
            String sql = "UPDATE UsersHE151368 SET firstName=?, lastName=?, gender=?,address=?,email = ?,phone=? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setBoolean(3, user.isGender());
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getEmail());
            ps.setString(6, user.getPhone());
        
            ps.setLong(7, user.getId());
  
            ps.execute();
        } catch (SQLException e) {
            status = "Error when update user" +e.getMessage();
        }
    }
    public void updateByPassword(String  password,Long id) {
        try {
            String sql = "UPDATE UsersHE151368 SET  password= ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,password);
            ps.setLong(2,id);
           
            ps.execute();
        } catch (SQLException e) {
            status = "Error when update password user" +e.getMessage();
        }
    }
    public void updateByImage(String  image,Long id) {
        try {
            String sql = "UPDATE UsersHE151368 SET  image= ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,image);
            ps.setLong(2,id);
           
            ps.execute();
        } catch (SQLException e) {
            status = "Error when update user" +e.getMessage();
        }
    }
}
