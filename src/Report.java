

/**
 *
 * @author KW
 */
public class Report implements reportGenerator{
    public String gender;
    public String firstname;
    public String lastname;
    public int age;
    public double height;
    public double weight;
    public double BMI;
    public String condition;
    
    public Report(){
    }
    
    /*
    public Report(Child C, double B){
        child = C;
        BMI = B;
    }
    */
    
    @Override
    public String generateReport(String condition){
        if(condition.equals("Adult")){
        String message = "Report for " + firstname + " " + lastname + "\n Age = " + age + "\n Height = " + height + "\n Weight = " + weight + "\n BMI = " + BMI;
        return message;
        }
        else{
        String message = "Report for " + firstname + " " + lastname + "\n Age = " + age + "\n Height = " + height + "\n Weight = " + weight + "\n Gender = " + gender + "\n BMI = " + BMI;
        return message;
        }
        /*
        System.out.println("Generating report for" + human.firstName + " " + human.lastname);
        System.out.println("Age = " + human.Age);
        System.out.println("Height = "+ human.height);
        System.out.pritnln("Weight = " + human.weight);
        System.out.println("BMI = " + BMI);
        */
    }
    
    //setters and getters here
    public String getGender() {
        return gender; 
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getFirstName() {
        return firstname;
    }
 
    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
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
    
    public double getBMI(){
        return BMI;
    }
    
    public void setBMI(double BMI) {
        this.BMI = BMI;
    }
}
