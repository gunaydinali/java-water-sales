/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appPack;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 
 * @author LENOVO
 */
 
public class DbFunctions {
    DB db= new DB();
    /**
     * 
     * @param userName
     * @param userPass
     * @return 
     */
    public boolean adminLogin(String userName, String userPass){
        boolean statu=false;
        try {
            String query="SELECT * FROM `admin` WHERE `userName` = ? AND `userPass` = ?";
            PreparedStatement pre = db.pre(query);
            pre.setString(1, userName);
            pre.setString(2, userPass);
            ResultSet rs =pre.executeQuery();
            statu=rs.next();
            
        } catch (Exception e) {
            System.err.println("Admin Login Error");
            statu=false;
            
        }
        return statu;
    }
    
}
