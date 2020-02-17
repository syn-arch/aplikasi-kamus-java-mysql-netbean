package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    
    Connection con = null;
    
    public static Connection adiyatnaDB() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kamus_id","root","");
            return con;
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
            return null;
        }
    }
    
}
