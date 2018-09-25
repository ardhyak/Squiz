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
public class Person {

    private int id;
    private String name;
    private String pass;
    private String email;
    private String phone;
    private String type;
    private String registration_number;
    private Boolean is_certified;
    
    Person(int id,String name,String pass,String email,String phone,String type,String registration_number, Boolean is_cert){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
        this.registration_number = registration_number;
        this.type = type;
        this.is_certified = is_certified;
    }

    Person() {
    }
    
    public void setter(int id,String name,String pass,String email,String phone,String type,String registration_number, Boolean is_cert) {
    
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
        this.registration_number = registration_number;
        this.type = type;
        this.is_certified = is_certified;
        
    }
    
    public void getter(int id,String name,String pass,String email,String phone,String type,String registration_number, Boolean is_cert) {
    
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
        this.registration_number = registration_number;
        this.type = type;
        this.is_certified = is_certified;
        
    }
    
}
