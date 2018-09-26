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
public class Mcq {
    
    private int id;
    private int  quizID;
    private int question;
    private int option1;
    private int option2;
    private int option3;
    private int option4;
    private int answer;
    
    Mcq(int id,int quizID,int question,int option1,int option2,int option3,int option4,int answer){
    
       this.id = id;
       this.quizID = quizID;
       this.question = question;
       this.option1 = option1;
       this.option2 = option2;
       this.option3 = option3;
       this.option4 = option4;
       this.answer = answer;
       
     }
    
    Mcq(){
    
    }
    public void setter(int id,int quizID,int question,int option1,int option2,int option3,int option4,int answer){
    
       this.id = id;
       this.quizID = quizID;
       this.question = question;
       this.option1 = option1;
       this.option2 = option2;
       this.option3 = option3;
       this.option4 = option4;
       this.answer = answer;
       
     }
    public void set_id(int id){
          this.id = id;
        
    }
    public void set_quizID(int quizz){
          this.quizID = quizID;
        
    }
    public void set_question(int question){
        this.question = question;
    }
    public void set_option1(int option1){
        this.option1 = option1;
        
    }  
    public void set_option2(int option2){
        
        this.option2 = option2;
     }
    public void set_option3(int option3){
        this.option3 = option3;
        
    }
    public void set_option4(int option4){
        this.option4 = option4;
        
    }
    public void set_answer(int answer){
        this.answer = answer;
        
    }
    
            
            
            
    public int get_id(){
    
       return(this.id);
    }
     public int get_quizID(){
         
      return(this.quizID);
     }
     
     public int get_question(){
         
         return(this.question);
     }
      
    public int get_option1(){

    return(this.option1) ;
    }
     
    public int get_option2(){
  
       return(this.option1);
   }  
    public int get_option3(){
        
       return(this.option3);
    }
    public int get_option4(){
        
    return(this.option4);
    }
    public int get_answer(){
        
    return(this.answer);
       
     }
    
}
