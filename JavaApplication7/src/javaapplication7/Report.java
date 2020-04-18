package javaapplication7;

/**
 *
 * @author KW
 */
public class Report {
    private Person human;
    private double BMI;
    public Report(Person P, double B){
        human = P;
        BMI = B;
    }
    
    public String generateReport(){
        String message = "Report for " + human.firstName + " " + human.lastName + "\n Age = " + human.Age + "\n Height = " + human.height + "\n Weight = " + human.weight + "\n BMI = " + BMI;
        return message;
        /*
        System.out.println("Generating report for" + human.firstName + " " + human.lastname);
        System.out.println("Age = " + human.Age);
        System.out.println("Height = "+ human.height);
        System.out.pritnln("Weight = " + human.weight);
        System.out.println("BMI = " + BMI);
        */
    }
}
