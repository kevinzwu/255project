/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alice
 */
public abstract class Person {
    public int age; 
    public double height;
    public double weight;  
    public String firstName; 
    public String lastName; 

    public Person(String firstName, String lastName, int age, double weight, double height) {
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.age = age; 
        this.weight = weight;
        this.height = height;
    }
    
    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
}

