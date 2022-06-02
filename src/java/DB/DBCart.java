/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Model.Cart;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author window
 */
public class DBCart {

    Connection conn;
    public String status = "";

    public DBCart() {
        try {
            conn = new DBContext().getConnection();
            status = "connection!";
        } catch (Exception e) {
            status = "Not connection: " + e.getMessage();
        }
    }

    public Long insertCart(Cart cart) {
        Long id = null;
        try {
            String sql = "insert into CartHE151368(user_id,totalPriceOfProduct,checkPay) values (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setLong(1, cart.getUserId());
            ps.setFloat(2, cart.getTotalPriceOfProduct());
            ps.setBoolean(3, cart.isCheckPay());
            ps.executeUpdate();
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    id = generatedKeys.getLong(1);
                } else {
                    throw new SQLException("Creating cart failed, no ID obtained.");
                }
            }
        } catch (SQLException e) {
            status = "Error when insert cart " + e.getMessage();
        }
        return id;
    }

    public Cart findReccentCart(Long userIdI) {
        Cart cart = null;
        try {
            String sql = "select top 1* from CartHE151368 where user_id = ? order by id desc";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, userIdI);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Long cartId = rs.getLong(1);
                Long userId = rs.getLong(2);
                float totalPriceOfPrdocut = rs.getFloat(3);
                boolean checkPay = rs.getBoolean(4);
                cart = new Cart(userId, totalPriceOfPrdocut, checkPay);
                cart.setId(cartId);
            }
        } catch (SQLException e) {
            status = "Error when cart load by user id " + e.getMessage();
        }
        return cart;
    }

    public void updateByPrice(float price, Long id) {
        try {
            String sql = "UPDATE CartHE151368 SET  totalPriceOfProduct= ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, price);
            ps.setLong(2, id);

            ps.execute();
        } catch (SQLException e) {
            status = "Error when update price cart" + e.getMessage();
        }
    }

    public void updateByState(String state, Long cartId,String toOrder) {
        try {
            String sql = "UPDATE CartHE151368 SET  state= ?,toOrder=? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, state);
            ps.setDate(2, java.sql.Date.valueOf(toOrder));
            ps.setLong(3, cartId);

            ps.execute();
        } catch (SQLException e) {
            status = "Error when update state cart" + e.getMessage();
        }
    }

    public void checkOutCart(Long cartId, String address, String note,String date) {
        try {
            String sql = "UPDATE CartHE151368 SET  checkPay= ?,address =? ,note=?,fromOrder =? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, true);
            ps.setString(2, address);
            ps.setString(3, note);
            ps.setDate(4, java.sql.Date.valueOf(date));
            ps.setLong(5, cartId);

            ps.execute();
        } catch (SQLException e) {
            status = "Error when update checkout cart" + e.getMessage();
        }
    }

    public Cart loadCartById(Long cartId) {
        Cart cart = null;
        try {
            String sql = "select * from CartHE151368 where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, cartId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Long cartId1 = rs.getLong(1);
                Long userId = rs.getLong(2);
                float totalPriceOfPrdocut = rs.getFloat(3);
                boolean checkPay = rs.getBoolean(4);
                String address = rs.getString(5);
                String note = rs.getString(6);
                String state = rs.getString(7);
                Date fromdate = rs.getDate(8);
                Date to = rs.getDate(9);
             
                cart = new Cart(cartId1, userId, totalPriceOfPrdocut, checkPay, address, note, state,fromdate,to);
                
            }
        } catch (SQLException e) {
            status = "Error when cart load by id " + e.getMessage();
            System.out.println(status);
        }
        return cart;
    }

    public List<Cart> loadCartsBy() {
        List<Cart> listCart = new ArrayList<>();
        try {
            String sql = "select * from CartHE151368;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Long cartId = rs.getLong(1);
                Long userId = rs.getLong(2);
                float totalPriceOfPrdocut = rs.getFloat(3);
                boolean checkPay = rs.getBoolean(4);
                String address = rs.getString(5);
                String note = rs.getString(6);
                String state = rs.getString(7);
                Date fromdate = rs.getDate(8);
                Date to = rs.getDate(9);
                Cart cart = new Cart(cartId, userId, totalPriceOfPrdocut, checkPay, address, note, state,fromdate,to);
                listCart.add(cart);
            }
        } catch (SQLException e) {
            status = "Error when cart load  " + e.getMessage();
        }
        return listCart;
    }

    public List<Cart> loadCartsByUSerId(Long userIdI) {
        List<Cart> listCart = new ArrayList<Cart>();
        try {
            String sql = "select * from CartHE151368 where user_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, userIdI);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Long cartId = rs.getLong(1);
                Long userId = rs.getLong(2);
                float totalPriceOfPrdocut = rs.getFloat(3);
                boolean checkPay = rs.getBoolean(4);
                String address = rs.getString(5);
                String note = rs.getString(6);
                String state = rs.getString(7);
                Date fromOrder = rs.getDate(8);
                Date toOrder = rs.getDate(9);
                Cart cart = new Cart(cartId, userId, totalPriceOfPrdocut, checkPay, address, note, state,fromOrder,toOrder);
                listCart.add(cart);
            }
        } catch (SQLException e) {
            status = "Error when cart load  by userid" + e.getMessage();
        }
        return listCart;
    }
}
