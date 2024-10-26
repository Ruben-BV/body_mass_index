package org.factoriaf5.body_mass_index;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        double resultBMI;
        String indexDefinition;
        
        System.out.println("Please enter your weight. [kg]");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Please enter your heigth. [m]");
        double height = scanner.nextDouble();
        scanner.nextLine();


        resultBMI = bodyMassIndex(weight, height);
        indexDefinition = bodyMassIndexDefinition(resultBMI);

        System.out.println("Your BMI is: " + resultBMI +" (" + indexDefinition + ").");

        scanner.close();
    }
    
    public static double bodyMassIndex(double weight, double height ){
        double bmi = weight/(Math.pow(height, 2));
        return bmi;
    }

    public static String bodyMassIndexDefinition(double bmi) {
        if(bmi<16) {
            return "Severe thinness";
        }
        else if(16<= bmi && bmi<17) {
            return "Moderate thinness";
        }
        else if(17 <= bmi && bmi< 18.5) {
            return "Mild thinness";
        }
        else if(18.5 <= bmi && bmi< 25) {
            return "Normal weight";
        }
        else if(25 <= bmi && bmi< 30) {
            return "Overweight";
        }
        else if(30 <= bmi && bmi< 35) {
            return "Class 1 obesity (Mild obesity)";
        }
        else if(35<= bmi && bmi <40) {
            return "Class 2 obesity (Moderate obesity)";
        }
        else {
            return "Class 3 obesity (Severe or Morbid obesity)";
        }
    }
}
