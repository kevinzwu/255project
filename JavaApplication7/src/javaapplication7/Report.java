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
        generateReport(P, BMI);
    }
    
    public void generateReport(){
        System.out.println("Generating report for" + human.firstName + " " + human.lastname);
        System.out.println("Age = " + human.Age);
        System.out.println("Height = "+ human.height);
        System.out.pritnln("Weight = " + human.weight);
        System.out.println("BMI = " + BMI);
    }
}
