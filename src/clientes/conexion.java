/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class conexion{
    Connection con = null;
    public Connection conectar(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/gimnasio","root","");
    }catch (Exception e) {
        System.out.print(e.getMessage());
        }
    return con;
}
}

