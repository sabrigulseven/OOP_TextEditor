/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author asus
 */
public class Commands {
    
     Command komut;
    
    public void setCommand(Command command){
        komut=command;
    }
    
    public void runCommand(){
      komut.execute();
    }
    
}
