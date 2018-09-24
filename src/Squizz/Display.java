/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Squizz;



import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

/**
 *
 * @author user
 */
public class Display extends GraphicsProgram
        {

                private final double Height;
                private final double Width;

                GLabel Topic = null;
                GLabel Login = null;
                GLabel Subject1 = null;
                GLabel Subject2 = null;
                GLabel Subject3 = null;
                Glabel Subject4 = null; 
                GRect Main = null;


        
  
    public Display() {
        this.Height = 1000;
        this.Width = 1900;
  }

   @Override
    public void run(){
    
     addMouseListeners();
        
        setSize((int)(Width*screen_width_fraction) ,(int)(Height*screen_height_fraction));
        setLocation((int)(350.0*screen_width_fraction) , (int)(screen_height_fraction*50.0));
        

        Main = new GRect(600*screen_width_fraction,500*screen_height_fraction);
    
        Topic = new Glabel("Quizer");

}