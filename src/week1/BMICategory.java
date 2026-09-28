import java.util.Scanner;

public class BMICategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double w = sc.nextDouble();

        System.out.print("Enter height in meters: ");
        double h = sc.nextDouble();

        double bmi = w / (h * h);

        String cat;

        if (bmi < 18.5) {
            cat = "Underweight";
        } 
        else if (bmi < 25.0) {
            cat = "Normal";
        } 
        else if (bmi < 30.0) {
            cat = "Overweight";
        } 
        else {
            cat = "Obese";
        }

        System.out.println("BMI = " + bmi + " -> " + cat);

        sc.close();
    }
}