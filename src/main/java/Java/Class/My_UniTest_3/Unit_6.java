package Java.Class.My_UniTest_3;
import Java.Class.TaskClass;
import Java.Class.Core;

/**
 * @author Jose Lubota
 */
public class Unit_6 {
    
    
    //---------...-----------...Main...------------------------------------------
    //-----------     
   public static void main(String[] args){
    
        Core_Test3 core = new Core_Test3();
        core.main(null);
        
        core.createTask();
        TaskClass task = core.unitT3;
        
        task.returnDetails();
    }  
}
//-------------------------------------------------END OF FILE-------------------------------------------------//