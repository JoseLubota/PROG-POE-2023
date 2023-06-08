package Java.Class.My_UniTest_3;
import Java.Class.My_UniTest_3.Unit_4;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit_4Test {
    
    Unit_4 test4 = new Unit_4();
    
    @Test
    public void testGetValue() {
         
        test4.setDevName("Samantha Paulson");
        test4.main(null);
        String tname = test4.getTaskName();
       
        System.out.println(tname);

    }
}

//--------------------END OF FILE-----------------------------------------------------------------------------//