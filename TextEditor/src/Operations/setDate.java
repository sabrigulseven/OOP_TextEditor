package Operations;
import Singleton.DateSingleton;
import main.Notepad;

public class setDate implements OperationStrategy{
    Notepad notepad;
    DateSingleton d1=DateSingleton.getInstance();
    public setDate(Notepad notepad){
        this.notepad = notepad;       
    }  
    @Override
    public void makeOperation() {
        notepad.textArea.append(d1.getDate());
    }
    
}
