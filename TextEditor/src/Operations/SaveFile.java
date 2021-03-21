package Operations;
import java.awt.FileDialog;

import java.io.FileWriter;

import main.*;

public class SaveFile implements OperationStrategy{
    Notepad notepad;
    public SaveFile(Notepad notepad){
        this.notepad = notepad;
    }
    
    @Override
    public void makeOperation(){
           String fileName = null;
            FileDialog fd = new FileDialog(notepad, "Save File", FileDialog.SAVE);
            fd.setVisible(true);
            if(fd.getFile() != null){
               fileName=fd.getDirectory()+fd.getFile();
               notepad.setTitle(fileName);
            }
               try{
                   
               
               FileWriter fw=new FileWriter(fileName);
               fw.write(notepad.textArea.getText());
               notepad.setTitle(fileName);
               fw.close();
        }catch (Exception e){
            
        }
}


                
            
        }
        
    
    
    

