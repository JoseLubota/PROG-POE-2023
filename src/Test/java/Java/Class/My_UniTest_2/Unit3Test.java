package Java.Class.My_UniTest_2;
import Java.Class.My_UniTest_2.Unit3;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit3Test {
    
    Unit3 test3 = new Unit3();
    
    @Test
    public void testGetValue() {
        test3.main(null);
        
        int pastValue = test3.GetValue();
        int currentV = test3.GetValue2();
        
        System.out.println( pastValue +" on the last itertion of the loop");
        System.out.println(currentV + " for the additional data" );
                
    }  
}

//--------------------END OF FILE-----------------------------------------------------------------------------//