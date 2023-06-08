package Java.Class;
import javax.swing.JOptionPane;


public class Core {
    public static void main(String args[]){

        MyLoginClass user = new MyLoginClass();
        user.loginMenuPrompt();
    
           
            if(user.returnLoginStatus().equals("A successful login")){
                TaskClass task = new TaskClass();  
                task.TaskMenuPrompt();
                }     
            }
        }
    
 
        

