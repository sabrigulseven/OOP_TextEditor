/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import javax.swing.JTextArea;

/**
 *
 * @author asus
 */
public class undoCommand implements Command{

    public undoCommand(JTextArea textArea, String text) {
        this.textArea = textArea;
        this.text = text;
    }

    JTextArea textArea;
    String text;
              
    
    public void execute(){
  
        textArea.setText(text);
        
        
        
    }

  
    
    
    
    

  
    
    
    
}
