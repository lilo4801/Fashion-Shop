/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Model.Product;

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
public class DBProduct {

    Connection conn;
    public String status = "";
    public List<Product> productList = new ArrayList<Product>();

    public DBProduct() {
        try {
            conn = new DBContext().getConnection();
            status = "connection!";
        } catch (Exception e) {
            status = "Not connection: " + e.getMessage();
        }
    }

    public List<Product> loadProductsByCategory(Long categoryId) {
        productList = new ArrayList<Product>();
        try {
            String sql = "select top 9 * from ProductHE151368 where category_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, categoryId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Long id = rs.getLong(1);
                String name = rs.getString(2);
                String des = rs.getString(3);
                String color = rs.getString(4);
                String size = rs.getString(5);
                int unitInStock = rs.getInt(6);
                int unitPrice = rs.getInt(7);
                String image = rs.getString(8);
                Long userId = rs.getLong(9);
                Long categoryIdp = rs.getLong(10);
                int rating = rs.getInt(11);
                int status = rs.getInt(12);

                productList.add(new Product(id, name, des, color, size, unitInStock, unitPrice, image, userId, categoryIdp, rating, status));
            }

        } catch (SQLException e) {
            status = "Error when loading product " + e.getMessage();
        }
        return productList;
    }

    public List<Product> loadProductsByCategoryNoLimit(Long categoryId) {
        productList = new ArrayList<Product>();
        try {
            String sql = "select * from ProductHE151368 where category_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, categoryId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Long id = rs.getLong(1);
                String name = rs.getString(2);
                String des = rs.getString(3);
                String color = rs.getString(4);
                String size = rs.getString(5);
                int unitInStock = rs.getInt(6);
                int unitPrice = rs.getInt(7);
                String image = rs.getString(8);
                Long userId = rs.getLong(9);
                Long categoryIdp = rs.getLong(10);
                int rating = rs.getInt(11);
                int status = rs.getInt(12);

                productList.add(new Product(id, name, des, color, size, unitInStock, unitPrice, image, userId, categoryIdp, rating, status));
            }

        } catch (SQLException e) {
            status = "Error when loading product " + e.getMessage();
        }
        return productList;
    }

    public List<Product> loadProducts() {
        productList = new ArrayList<>();
        try {
            String sql = "select * from ProductHE151368";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Long id = rs.getLong(1);
                String name = rs.getString(2);
                String des = rs.getString(3);
                String color = rs.getString(4);
                String size = rs.getString(5);
                int unitInStock = rs.getInt(6);
                int unitPrice = rs.getInt(7);
                String image = rs.getString(8);
                Long userId = rs.getLong(9);
                Long categoryId = rs.getLong(10);
                int rating = rs.getInt(11);
                int status = rs.getInt(12);
                productList.add(new Product(id, name, des, color, size, unitInStock, unitPrice, image, userId, categoryId, rating, status));
            }

        } catch (SQLException e) {
            status = "Error when loading product " + e.getMessage();
        }
        return productList;
    }

    public Product loadProductsByID(Long idP) {
        Product product = null;
        try {
            String sql = "select * from ProductHE151368 where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, idP);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Long id = rs.getLong(1);
                String name = rs.getString(2);
                String des = rs.getString(3);
                String color = rs.getString(4);
                String size = rs.getString(5);
                int unitInStock = rs.getInt(6);
                int unitPrice = rs.getInt(7);
                String image = rs.getString(8);
                Long userId = rs.getLong(9);
                Long categoryId = rs.getLong(10);
                int rating = rs.getInt(11);
                int status = rs.getInt(12);
                product = new Product(id, name, des, color, size, unitInStock, unitPrice, image, userId, categoryId, rating, status);
            }

        } catch (SQLException e) {
            status = "Error when loading product " + e.getMessage();
        }
        return product;
    }

    public Long insertProduct(Product product) {
        Long id = null;
        try {
            String sql = "insert into ProductHE151368(name,description,color,size,unitInStock,unitPrice,image,user_id,category_id) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setString(3, product.getColor());
            ps.setString(4, product.getSize());
            ps.setInt(5, product.getUnitInStock());
            ps.setInt(6, product.getUnitPrice());
            ps.setString(7, product.getImage());
            ps.setLong(8, product.getUserId());
            ps.setLong(9, product.getCategoryId());

            ps.executeUpdate();
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    id = generatedKeys.getLong(1);
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
        } catch (SQLException e) {
            status = "Error when register " + e.getMessage();
        }
        return id;
    }

    public void update(Product product) {
        try {
            String sql = "  UPDATE ProductHE151368 SET name = ?,description = ?,color = ?,size = ?,unitInStock = ?,unitPrice = ?,image = ?,user_id = ?,category_id = ?,status = ? where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setString(3, product.getColor());

            ps.setString(4, product.getSize());
            ps.setInt(5, product.getUnitInStock());
            ps.setInt(6, product.getUnitPrice());

            ps.setString(7, product.getImage());
            ps.setLong(9, product.getCategoryId());
            ps.setLong(8, product.getUserId());
            ps.setInt(10, product.getStatus());
            ps.setLong(11, product.getId());

            ps.execute();
        } catch (SQLException e) {
            status = "Error when update product" + e.getMessage();
        }
    }

    public void updateByRating(Product product) {
        try {
            String sql = "  UPDATE ProductHE151368 SET rating = ? where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, product.getRating());
            ps.setLong(2, product.getId());

            ps.execute();
        } catch (SQLException e) {
            status = "Error when update user" + e.getMessage();
        }
    }

    public void updateByUnitQuantity(int quantityOrder, Long id) {
        try {
            String sql = "  UPDATE ProductHE151368 SET unitInStock = ? where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, quantityOrder);
            ps.setLong(2, id);

            ps.execute();
        } catch (SQLException e) {
            status = "Error when update quantity" + e.getMessage();
        }
    }

    public int getProductSold(Long idProduct) {
        int num = 0;
        try {
            String sql = "  select sum(OrdersHE151368.quantity) from ProductHE151368\n"
                    + "  inner join OrdersHE151368\n"
                    + "  on ProductHE151368.id = OrdersHE151368.product_id\n"
                    + "  inner join CartHE151368\n"
                    + "  on OrdersHE151368.cart_id = CartHE151368.id\n"
                    + "  where CartHE151368.checkPay = 1 and  CartHE151368.state = 'accept'\n"
                    + "   and OrdersHE151368.status = 1 and ProductHE151368.id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, idProduct);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                num = rs.getInt(1);
            }
        } catch (SQLException e) {
            status = "Error when get product sold" + e.getMessage();
        }
        return num;
    }

    public List<Product> getSoldProduct() {
        productList = new ArrayList<>();
        try {
            String sql = "  select ProductHE151368.id,sum(OrdersHE151368.quantity) as quanity\n"
                    + "  from ProductHE151368\n"
                    + "  inner join OrdersHE151368\n"
                    + "  on ProductHE151368.id = OrdersHE151368.product_id\n"
                    + "  inner join CartHE151368\n"
                    + "  on OrdersHE151368.cart_id = CartHE151368.id\n"
                    + "  where CartHE151368.checkPay = 1 and  CartHE151368.state = 'accept'\n"
                    + "   and OrdersHE151368.status = 1 \n"
                    + " group by ProductHE151368.id,ProductHE151368.name,ProductHE151368.size,ProductHE151368.color\n"
                    + "  order by quanity desc";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Long id = rs.getLong(1);
                int quantity = rs.getInt(2);
                Product p = new Product();
                p.setId(id);
                p.setUnitInStock(quantity);
                productList.add(p);
            }

        } catch (SQLException e) {
            status = "Error when loading sold product " + e.getMessage();
        }
        return productList;
    }
}
