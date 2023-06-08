package Java.Class.My_UniTest_3;
import Java.Class.My_UniTest_3.Unit_2;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit_2Test {
    
    Unit_2 test2 = new Unit_2();
    
    @Test
    public void testGetValue() {
        test2.main(null); 
        int dur = test2.getTaskDur();
        String name = test2.getDevName();
        
        System.out.println(name +", " +dur);
    
    }
}

//--------------------END OF FILE-----------------------------------------------------------------------------//