/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author alice
 */
public class Adult extends Person{
    private Gender gender; 
   
    public enum Gender {
        MALE, FEMALE
    }
    
    public Adult(String firstName, String lastName, int age, Gender gender) {
        super(firstName, lastName, age);     
        this.gender = gender; 
        
    }

    public Gender getGender() {
        return gender; 
    }
    
    public void setGender() {
        this.gender = gender;
    }
    
    public static void main(String[] args) {
        
    }   
    
}