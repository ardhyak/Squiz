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
        public void set_id(int id){
            
            this.id = id;
        }
        public void set_name(String name){
            this.name = name;
            
        }
        public void set_subjectID(int subjectID){
            this.subjectID = subjectID;
        }
        
        public int get_id(){
          return(this.id = id);
        }
        
        public String get_name(){
            return(this.name);
        }
        public int get_subjectID(){
            return(this.subjectID);
        }
        
  }

