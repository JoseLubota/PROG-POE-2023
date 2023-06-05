package com.POE.Test_2;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit1_2Test2 {
    
    Unit1_2 test1 = new Unit1_2();
    
    @Test
    public void testGetValue() {
        test1.main(null);
        
        Boolean value = true ;
        String expected = test1.GetActual();
        String actual = "";
        
       value = test1.GetValue();
       if (value){
           actual = test1.GetActual();
           System.out.println("Task successfully captured");
       }else{
           System.out.println("Please enter a task description less than 50 characters");
       }
       
       assertEquals(expected,actual);
    } 
    
}

//--------------------END OF FILE-----------------------------------------------------------------------------//