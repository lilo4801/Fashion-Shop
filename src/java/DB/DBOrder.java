/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Model.Order;
import Model.Review;
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
public class DBOrder {
    Connection conn;
    public String status = "";
    
    public DBOrder() {
        try {
            conn = new DBContext().getConnection();
            status = "connection!";
        } catch (Exception e) {
            status = "Not connection: " + e.getMessage();
        }
    }
    public Long insertOrder(Order order){
        Long id = null;
        try {
            String sql = "insert into OrdersHE151368(product_id,cart_id,quantity,totalPrice) values (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, order.getProductId());
            ps.setLong(2, order.getCartId());
            ps.setInt(3, order.getQuantity());
            ps.setFloat(4, order.getTotalPrice());
           
            ps.executeUpdate();
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                id = generatedKeys.getLong(1);
            }
            else {
                throw new SQLException("Creating order failed, no ID obtained.");
            }
        }
        } catch (SQLException e) {
            status = "Error when order cart " +e.getMessage();
        }
        
        return id;
    }
     public List<Order> loadOrderByCartId(Long cartIdI){
        List<Order> orderList = new ArrayList<Order>();
        try {
            String sql = "select * from OrdersHE151368 where cart_id = ? and status = 1";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, cartIdI);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                 Long id = rs.getLong(1);
                 Long productId = rs.getLong(2);
                 Long cartId = rs.getLong(3);
                 int quantity = rs.getInt(4);
                 float totalPrice = rs.getFloat(5);
                 orderList.add(new Order(id, productId, cartId, quantity,totalPrice));
            }
           
        } catch (SQLException e) {
            status = "Error when loding order " +e.getMessage();
        }
        return orderList;
    }
       public void updateByOrder(int quantity,float price,Long orderId) {
        try {
            String sql = "UPDATE OrdersHE151368 SET  quantity= ?,totalPrice =?  WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, quantity);
            ps.setFloat(2,price);
            ps.setLong(3,orderId);
           
            ps.execute();
        } catch (SQLException e) {
            status = "Error when update price order" +e.getMessage();
        }
    }
     public void deleteFromCart(Long orderId) {
          try {
            String sql = "UPDATE OrdersHE151368 set status=? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            // 0 for hiddent form cart
            // 1 for active
            ps.setInt(1,0);
            ps.setLong(2,orderId);
            ps.execute();
        } catch (SQLException e) {
            status = "Error when delete  order" +e.getMessage();
        }
     }
}
