package Operations;

import main.*;

public class SelectAll implements OperationStrategy{
    Notepad notepad;
    public SelectAll(Notepad notepad){
        this.notepad = notepad;
    }

    @Override
    public void makeOperation() {
        notepad.textArea.selectAll();  
    }
    
    
}
