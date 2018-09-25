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
    
    
    public void getter(int id,int quizID,int question,int option1,int option2,int option3,int option4,int answer){
    
       this.id = id;
       this.quizID = quizID;
       this.question = question;
       this.option1 = option1;
       this.option2 = option2;
       this.option3 = option3;
       this.option4 = option4;
       this.answer = answer;
       
     }
    
}
