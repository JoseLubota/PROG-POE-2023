/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Java.Class.My_UniTest_2;

import Java.Class.My_UniTest_2.Unit2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexi
 */
public class Unit2Test {
    
    public Unit2Test() {
    }
    
    Unit2 test = new Unit2();

   

    @Test
    public void testMain() {
        test.main(null);
        String value = test.GetActual();
        for(int i =0; i<=10;i++){
             System.out.println(value);
        }
       
        
    }
    
}
