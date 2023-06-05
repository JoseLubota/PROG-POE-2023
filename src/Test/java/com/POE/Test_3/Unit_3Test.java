package com.POE.Test_3;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit_3Test {
    
    Unit_3 test3 = new Unit_3();
    
    @Test
    public void testGetValue() {
        test3.main(null); 
        String devname = test3.getDevName();
        String tname = test3.getTaskName();
        
        System.out.println(devname +", "+ tname);

    }
}

//--------------------END OF FILE-----------------------------------------------------------------------------//