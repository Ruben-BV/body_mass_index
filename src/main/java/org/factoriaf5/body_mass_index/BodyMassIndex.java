package org.factoriaf5.body_mass_index;

public class BodyMassIndex {
    
    public static double bodyMassIndex(double weight, double height){
        
        if (weight < 0) {
            throw new IllegalArgumentException("The weight cannot be negative");
        }

        if (height < 0) {
            throw new IllegalArgumentException("The height cannot be negative");
        }
        
        double bmi = weight/(Math.pow(height, 2));
        return bmi;
    }

    public static String bodyMassIndexDefinition(double bmi) {
        
        if(bmi<16) {
            return "Severe thinness";
        }
        else if(bmi<17) {
            return "Moderate thinness";
        }
        else if(bmi< 18.5) {
            return "Mild thinness";
        }
        else if(bmi< 25) {
            return "Normal weight";
        }
        else if(bmi< 30) {
            return "Overweight";
        }
        else if(bmi< 35) {
            return "Class 1 obesity (Mild obesity)";
        }
        else if(bmi <40) {
            return "Class 2 obesity (Moderate obesity)";
        }
        else {
            return "Class 3 obesity (Severe or Morbid obesity)";
        }
    }

}
