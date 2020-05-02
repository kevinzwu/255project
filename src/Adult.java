/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alice
 */
public class Adult extends Person{
    
    //Adults have a gender classification
    public String gender; 
    /*
    public enum Gender {
        MALE, FEMALE
    }
    */
    public Adult(String firstName, String lastName, int age,  double weight, double height, String gender) {
        super(firstName, lastName, age, weight, height);    
        this.gender = gender; 
        
    }

    public String getGender() {
        return gender; 
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
}