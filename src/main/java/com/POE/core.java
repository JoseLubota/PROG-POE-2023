package com.POE;
import javax.swing.JOptionPane;


public class core {
    public static void main(String args[]){
         int opt;
         boolean controller = true;

        Login aLogin = new Login("kyl_1","Lubota","Jk_g","2J@4");
        System.out.println(aLogin.registerUser("Jk_g","2J@4"));
        System.out.println(aLogin.loginUser("Jk_g", "2J@4"));
    
           
            if(aLogin.returnLoginStatus() == "A successful login"){
                Task task = new Task();  
                JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");

                while(controller){
                    opt = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "\n*----------------Choose an option--------------------* \n[1]----------Add tasks \n[2]----------Show report  \n[3]----------Quit  \n---------- "));
                    
                    switch(opt){
                        case 1 :
                              task.enterValues();
                        case 2:
                              task.returnDetails();
                        case 3:
                               controller = false;
                               break;
                               
                               
                        default:
                                break;

                        }
                }
                       
                    

                }     
            }
        }
    
 
        

