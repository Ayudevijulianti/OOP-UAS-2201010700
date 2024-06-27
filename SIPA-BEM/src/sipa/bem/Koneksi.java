package sipa.bem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 2201010700_Ayudevi
 * tgl: 2024-06-19
 */
public class Koneksi {
    public static Connection buatkoneksi(){
        Connection cnn = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/sipa-bemm","root","");
            
        }catch(ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi ke DBMS MySQL gagal");
        }
        return cnn ;
    }
}
