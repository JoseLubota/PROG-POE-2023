package Java.Class.My_UniTest_1;
import Java.Class.My_UniTest_1.Test8;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test8Test {
    
    Test8 t = new Test8();
    
    @Test
    public void testGetValue() {
        t.main(null);
        Boolean actual = t.GetValue();
  
        assertTrue("Password meets complexity requirements",actual);
    }
}