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
public class quizer {
    
            //          Control Variables
    
    public static Sql_query_executer sqe = new Sql_query_executer("root","Gen123@","jdbc:mysql://localhost:3306/squiz");
    public static Boolean is_logged = false;
    public static Person gamer = new Person();
    
    public static void main(String[] args) {
        new MainWindow().start();
    }
    
}
