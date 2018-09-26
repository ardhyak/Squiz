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
public class _Subject {
    
      private int id;
      private String name;
      
      _Subject(int id,String name){
          
          
          this.id = id;
          this.name = name;

      }
      _Subject(){
          
      }
      
      public void setter(int id,String name){
          this.id = id;
          this.name = name;
      }
      public void set_id(int id){
          this.id = id;
          
      }
      
      public void set_name(String name){
          this.name = name;
      }
      
      
       public int get_id(int id){
       return(this.id);
      }
      public String get_name(String name){
      return(this.name);
      }
    
}
