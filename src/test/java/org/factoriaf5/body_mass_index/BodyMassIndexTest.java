package org.factoriaf5.body_mass_index;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {
    
    private BodyMassIndex bodyMassIndex;

    @BeforeEach
    public void init() {
        this.bodyMassIndex = new BodyMassIndex();
    }

    @Test
    public void testBodyMassIndex() {
        
        double w = 100;
        double h = 2;

        double result =BodyMassIndex.bodyMassIndex(w, h);

        assertEquals(25, result);
    }

    @Test
    public void testNegativeWeiht() {
        double w = -1;
        double h = 2;
        assertThrows(IllegalArgumentException.class, () -> {
            BodyMassIndex.bodyMassIndex(w, h);
        });
    }

    @Test
    public void testNegativeHeight() {
        double w = 1;
        double h = -2;
        assertThrows(IllegalArgumentException.class, () -> {
            BodyMassIndex.bodyMassIndex(w, h);
        });
    }


    @Test
    public void testBodyMassIndexDefinitionCaseA() {
        
        double bmi = 15;

        String result =BodyMassIndex.bodyMassIndexDefinition(bmi);
        
        assertEquals("Severe thinness", result);
    }

    @Test
    public void testBodyMassIndexDefinitionCaseB() {
        
        double bmi = 16.5;

        String result =BodyMassIndex.bodyMassIndexDefinition(bmi);
        
        assertEquals("Moderate thinness", result);
    }

    @Test
    public void testBodyMassIndexDefinitionCaseC() {
        
        double bmi = 18;

        String result =BodyMassIndex.bodyMassIndexDefinition(bmi);
        
        assertEquals("Mild thinness", result);
    }

    @Test
    public void testBodyMassIndexDefinitionCaseD() {
        
        double bmi = 20;

        String result =BodyMassIndex.bodyMassIndexDefinition(bmi);
        
        assertEquals("Normal weight", result);
    }

    @Test
    public void testBodyMassIndexDefinitionCaseE() {
        
        double bmi = 27;

        String result =BodyMassIndex.bodyMassIndexDefinition(bmi);
        
        assertEquals("Overweight", result);
    }

    @Test
    public void testBodyMassIndexDefinitionCaseF() {
        
        double bmi = 32;

        String result =BodyMassIndex.bodyMassIndexDefinition(bmi);
        
        assertEquals("Class 1 obesity (Mild obesity)", result);
    }

    @Test
    public void testBodyMassIndexDefinitionCaseG() {
        
        double bmi = 36;

        String result =BodyMassIndex.bodyMassIndexDefinition(bmi);
        
        assertEquals("Class 2 obesity (Moderate obesity)", result);
    }

    @Test
    public void testBodyMassIndexDefinitionCaseH() {
        
        double bmi = 42;

        String result =BodyMassIndex.bodyMassIndexDefinition(bmi);
        
        assertEquals("Class 3 obesity (Severe or Morbid obesity)", result);
    }

}
