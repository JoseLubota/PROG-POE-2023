package Java.Class.My_UniTest_3;
import Java.Class.TaskClass;

/**
 * @author Jose Lubota
 */
public class Unit_4 {
    
    static String value ;
    static String[] taskN;
    static String devname;
    static String[] devN;
   //--------------------------SETTETS---------------------------------------------
   //-----------
    public static void setTaskName(String[] newValue) {
            taskN = newValue;
        }
    
     //-----------
    public void setDevName(String newValue) {
            devname = newValue;
        }
    public static void setDN(String[] dv){
        devN = dv;
    }
    //--------------------...GETTRS...------------------------------------------
    //-----------    
    public  String  getTaskName(){
        for (int i=0; i< 4; i++){
            if(devN[i].equals(devname)){
                value = taskN [i];
            }
        }
       return value;
    }
    //----------- 

    //---------...-----------...Main...------------------------------------------
    //-----------     
   public static void main(String[] args){
    
        Core_Test3 core = new Core_Test3();
        core.main(null);
        
        core.createTask();
        TaskClass task = core.unitT3;
        
   
        setTaskName(task.t_name);
        setDN(task.dev);

    }  
}
//-------------------------------------------------END OF FILE-------------------------------------------------//