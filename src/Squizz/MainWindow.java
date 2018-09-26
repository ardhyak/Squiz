/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Squizz;
import static Squizz.quizer.is_logged;
import static Squizz.quizer.sqe;
import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */

public class MainWindow extends GraphicsProgram{
    
    private final int height = 1000;
    private final int width = 1800;
        
    private GLabel login = new GLabel("Login / Signup");        //  Login / Signup Button
    private GLabel user = new GLabel("");         //  if User has logged in
    private GLabel topic = new GLabel("Quizers");
    
     GRect back = null;
            
    private GLabel subject[] = new GLabel[20];
    private Subject _subject[] = new Subject[20];
            
    private int num_subs;
    private ResultSet rs;
    
    @Override
    public void init() {
    
         // to set background            
             back = new  GRect(1800,1000);
             back.setLocation(0,0);
             back.setColor(Color.MAGENTA);
             back.setFilled(true);
             
             
             
            setSize(width,height);
            setLocation(0, 0);
            addMouseListeners();
            
            rs = sqe.select("SELECT id , name FROM subject ");
            int i=0;
            
        try{
            while(rs.next()){
                    _subject[i] = new Subject(rs.getInt("id"), rs.getString("name"));
                    subject[i] = new GLabel(rs.getString("name"));
                    subject[i].setFont((new Font("Georgia", Font.BOLD, (int)(20))));
                    i++;
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        num_subs = i;
        
            //          change font
            topic.setFont((new Font("Georgia", Font.BOLD, (int)(50))));
            login.setFont((new Font("Georgia", Font.ITALIC, (int)(20))));
 
           
        
            //          Set position of all variables

            topic.setLocation(600,50);
            login.setLocation(1200,50);
            user.setLocation(1200, 50);
            for(int j=0;j<num_subs;j++){
                //subject[i].setFont("");
                subject[j].setColor(Color.YELLOW);
                subject[j].setLocation(250, 250);
                subject[j].move(0,(j/2)*100);
                if(j%2!=0){
                    subject[j].move(400,0);
                }
            }
            
            
            //          
            
        
    }
    
    @Override
    public void run() {
        
        
        
        add_all();

        
    }
    
    public void add_all(){
           add(back);
        add(topic);
        
        if(is_logged){
            add(user);
        }
        else{
            add(login);
        }
            
        for(int i=0;i<num_subs;i++){
           add(subject[i]); 
        }
        
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        
        if(login.contains(e.getX(), e.getY())){
            
            new LoginForm(this).setVisible(true);
        }
        
        for(int i=0;i<num_subs;i++){
            if(subject[i].contains(e.getX(),e.getY())){
                ;
            }
        }
            
        
    }
    
}
 