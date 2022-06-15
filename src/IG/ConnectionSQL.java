/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IG;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.microsoft.sqlserver.jdbc.SQLServerDriver;
/*
 * @author aylin
 */
public class ConnectionSQL {
    public static Connection getConnectionSQL() {
       String url ="jdbc:sqlserver://LAPTOP-1JKDT40R:1433;"
                +"database=Biblioteca;"
                +"user=sa;"
                +"password=password;"
                +"loginTimeout=30;";
        try{
            Connection con=DriverManager.getConnection(url);
            return con;
        }catch(SQLException e){
            System.out.println(e);
            return null;
        }
  }
}

