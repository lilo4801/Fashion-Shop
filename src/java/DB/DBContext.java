/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;

/**
 *
 * @author window
 */
public class DBContext {
    
    private final String serverName ="localhost";
    private final String portName ="1143";
    private final String dbName = "PRJ301_SP22";
    private final String user = "sa";
    private final String password = "1";

    public Connection getConnection() throws Exception{
        String url = "jdbc:sqlserver://"+serverName+":"+portName+"; databaseName = "
                +dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url,user,password);
    }
//    public static void main(String[] args) {
//          DBContext db = new DBContext();
//          try {
//            db.getConnection();
//            System.out.print("work!");
//        } catch (Exception e) {
//             System.out.print("not work!");
//        }
//            
//    }
}
