package Java.Class.My_UniTest_2;
import Java.Class.My_UniTest_2.Unit1;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit1_1Test2 {
    
    Unit1 test1 = new Unit1();
    
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