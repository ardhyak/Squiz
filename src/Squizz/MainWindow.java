/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Squizz;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author user
 */

public class MainWindow extends GraphicsProgram{
    
    private int height = 1000;
    private int width = 1800;
    
    @Override
    public void init() {
        setSize(width,height);
        setLocation(0, 0);
        
        GLabel login = new GLabel("Login / Signup");        //  Login / Signup Button
        GLabel user = new GLabel("");         //  if User has logged in
        
        GLabel Subject[] = null;
        
        
         `
    }
    
    @Override
    public void run() {
        
    }
    
}
