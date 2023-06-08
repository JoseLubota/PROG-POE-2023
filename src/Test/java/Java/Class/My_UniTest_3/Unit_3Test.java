package Java.Class.My_UniTest_3;
import Java.Class.My_UniTest_3.Unit_3;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit_3Test {
    
    Unit_3 test3 = new Unit_3();
    
    @Test
    public void testGetValue() {
        test3.main(null); 
        String tname = test3.getTaskName();
        String devname = test3.getDevName();
        
        System.out.println(devname +", "+ tname);

    }
}

//--------------------END OF FILE-----------------------------------------------------------------------------//