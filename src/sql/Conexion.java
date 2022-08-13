/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

/**
 *
 * @author USER
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion{
    Connection on;
    
    public Connection conexion() 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
                    
            on = DriverManager.getConnection("jdbc:mysql://localhost/ventas", "root", "");
            System.out.println("Conexion Exitosa");
            JOptionPane.showMessageDialog(null, "Conexion Realizada");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error "+ e.getMessage());
        }
        return on;
    }
    
    Statement createStatement()
    {
        throw new UnsupportedOperationException("No soportado");
    }
    
}