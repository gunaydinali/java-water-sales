/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author LENOVO
 */
public class DB {
    
    final private String driver="com.mysql.jdbc.Driver";
    final private String url="jdbc:mysql://localhost/";
    final private String dbName="water";
    final private String user="root";
    final private String pass="";
    
    Connection conn = null; // connection ctrl+space java.sql 'i seç yukarıya eklensin
    PreparedStatement prep =null; // prepte de java.sql seç
    
    public PreparedStatement pre(String query){
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url+dbName,user,pass);
            prep=conn.prepareStatement(query);
            System.out.println("Bağlantı Başarılı.");
        } catch (Exception e) {
            System.err.println("Bağlantı Hatası: " + e);
        }
            
        
        return prep;
        
        
    }
    
    
    
}
