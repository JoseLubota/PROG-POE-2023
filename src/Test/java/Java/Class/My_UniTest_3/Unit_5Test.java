package Java.Class.My_UniTest_3;
import Java.Class.My_UniTest_3.Unit_5;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit_5Test {
    
    Unit_5 test5 = new Unit_5();
    
    @Test
    public void testGetValue() {
        test5.main(null);
        test5.delTask("Create Reports");
        
        String value = test5.checkDel();
        System.out.println(value);
        
       
        
       
        

    }
}

//--------------------END OF FILE-----------------------------------------------------------------------------//