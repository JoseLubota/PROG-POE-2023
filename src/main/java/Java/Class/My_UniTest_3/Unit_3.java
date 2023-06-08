package Java.Class.My_UniTest_3;
import Java.Class.TaskClass;

/**
 * @author Jose Lubota
 */
public class Unit_3 {
    
    static  String value ;
    static String[] set;
    static String[] name;
    static String dev;
   //--------------------------SETTETS---------------------------------------------
   //-----------
    public static void setTaskName(String[] newValue) {
            set = newValue;
        }
    
     //-----------
    public static void setDevName(String[] newValue) {
            name = newValue;
        }
    //--------------------...GETTRS...------------------------------------------
    //-----------    
    public  String  getTaskName(){
        for (int i=0; i< 4; i++){
            if(set[i].equals("Create Login")){
                value = set[i];
                dev = name[i];
            }
        }
       return value;
    }  
    //----------- 
   public String getDevName(){
       return dev;
   }
    
    //---------...-----------...Main...------------------------------------------
    //-----------     
   public static void main(String[] args){
    
        Core_Test3 core = new Core_Test3();
        core.main(null);
        
        core.createTask();
        TaskClass task = core.unitT3;
        
        
        String[] value = task.t_name;
        String[] value2 = task.dev; 
        setTaskName(value);
        setDevName(value2);

    }  
}
//-------------------------------------------------END OF FILE-------------------------------------------------//