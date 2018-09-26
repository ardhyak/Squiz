/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Squizz;

/**
 *
 * @author user
 */
public class Quiz {
        
        private int id;
        private String name;
        private  int subjectID;  
    
        
      Quiz(int id,String name,int subjectID){
        
            this.id = id;
            this.name = name;
            this.subjectID = subjectID;
          
            }
       Quiz(){

       }   
    
        public void setter(int id,String name,int subjectID){
          this.id = id;
          this.name = name;
          this.subjectID = subjectID;
          
          
      }
        
        public void getter(int id,String name,int subjectID){
          this.id = id;
          this.name = name;
          this.subjectID = subjectID;
      }
}
