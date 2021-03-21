/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Operations.CloseFile;
import Operations.OperationExecuter;
import Operations.SelectAll;
import command.Commands;
import main.Notepad;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ramazan
 */
public class NotepadTest {
    
         OperationExecuter operationExecuter = new OperationExecuter();
         Commands command=new Commands();
    
    public NotepadTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testConstructor() {//Checks Notepad object working correctly
        Notepad n1 = new Notepad();
        String s  = "edpdsa dsd sad sd asd sad dsad";
        n1.textArea.setText(s);
        assertEquals(s, n1.textArea.getText());
    }
    @Test
    public void testClose() {//Checks  that whether notepad object is  closed or not
        Notepad n3 = new Notepad();
         n3.textArea.setText("hey");
        operationExecuter.executeStrategy(new CloseFile(n3));
         assertFalse(n3.isActive());
    }
    @Test
    public void testSelectAll() {//Checks  that SelectAll is working correctly
        Notepad n4 = new Notepad();
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut maximus sodales pharetra";
         n4.textArea.setText(s);
        operationExecuter.executeStrategy(new SelectAll(n4));
        assertEquals(s, n4.textArea.getSelectedText());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
