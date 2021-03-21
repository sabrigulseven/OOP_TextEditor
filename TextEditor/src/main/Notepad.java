package main;
import Operations.*;

import command.Commands;
import command.undoCommand;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Notepad extends javax.swing.JFrame {
    OperationExecuter operationExecuter = new OperationExecuter();
    Commands command=new Commands();
    
    public FindPopUpWindow findWindow = new FindPopUpWindow(this);
         
    public Notepad() {
        initComponents();
        setTitle("Untitled - Notepad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        findWindow.setResizable(false);
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPopupMenu = new javax.swing.JPopupMenu();
        Undo = new javax.swing.JMenuItem();
        separator1 = new javax.swing.JPopupMenu.Separator();
        Cut = new javax.swing.JMenuItem();
        Copy = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        separator2 = new javax.swing.JPopupMenu.Separator();
        SelectAll = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        sep1 = new javax.swing.JPopupMenu.Separator();
        Close = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        undo = new javax.swing.JMenuItem();
        sep_1 = new javax.swing.JPopupMenu.Separator();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        sep_2 = new javax.swing.JPopupMenu.Separator();
        find = new javax.swing.JMenuItem();
        replace = new javax.swing.JMenuItem();
        sep_3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        getDate = new javax.swing.JMenuItem();

        Undo.setText("jMenuItem1");
        textPopupMenu.add(Undo);
        textPopupMenu.add(separator1);

        Cut.setText("jMenuItem2");
        textPopupMenu.add(Cut);

        Copy.setText("jMenuItem3");
        textPopupMenu.add(Copy);

        Paste.setText("jMenuItem4");
        textPopupMenu.add(Paste);
        textPopupMenu.add(separator2);

        SelectAll.setText("jMenuItem5");
        textPopupMenu.add(SelectAll);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textAreaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaKeyTyped(evt);
            }
        });
        scrollPane.setViewportView(textArea);

        fileMenu.setText("File");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Open...");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        fileMenu.add(Open);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        fileMenu.add(Save);
        fileMenu.add(sep1);

        Close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        fileMenu.add(Close);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undo.setText("Undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });
        editMenu.add(undo);
        editMenu.add(sep_1);

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        editMenu.add(cut);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        editMenu.add(copy);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        paste.setText("Paste");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        editMenu.add(paste);
        editMenu.add(sep_2);

        find.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        find.setText("Find...");
        find.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                findStateChanged(evt);
            }
        });
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        editMenu.add(find);

        replace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        replace.setText("Replace...");
        replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceActionPerformed(evt);
            }
        });
        editMenu.add(replace);
        editMenu.add(sep_3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Select all");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        jMenuItem2.setText("Fix Single Transposition");
        jMenuItem2.setName(""); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FixSingleTranspositionActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem2);

        getDate.setText("Get Date");
        getDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDateActionPerformed(evt);
            }
        });
        editMenu.add(getDate);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(708, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        operationExecuter.executeStrategy(new SaveFile(this));
    }//GEN-LAST:event_SaveActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        operationExecuter.executeStrategy(new CloseFile(this));
    }//GEN-LAST:event_CloseActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        operationExecuter.executeStrategy(new OpenFile(this));
        
    }//GEN-LAST:event_OpenActionPerformed

    private void textAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyPressed
        // TODO add your handling code here: 
    }//GEN-LAST:event_textAreaKeyPressed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
        String Text=textArea.getText();
        
    }//GEN-LAST:event_fileMenuActionPerformed

    private void textAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textAreaKeyTyped

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editMenuActionPerformed

    private void FixSingleTranspositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FixSingleTranspositionActionPerformed
        //girilen kelimelerin dosyadaki kelimelere göre doğru olup olmadığını karşılaştırır ve yanlış girilen kelimeyi düzeltir.
        String currentText = textArea.getText();
        String[] words = currentText.split("[.,; \n]");

        for(String word : words){
            try {
                File myObj = new File("kelimeler.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String vocabularyWord = myReader.nextLine();
                    if(vocabularyWord.length() == word.length()){
                        if(vocabularyWord.equals(word)){
                            break;
                        }

                        boolean hasSingleTransposition = HasSingleTransposition(word, vocabularyWord);
                        if(hasSingleTransposition){
                            currentText = currentText.replace(word, vocabularyWord);
                            break;
                        }
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred while reading txt.");
                e.printStackTrace();
            }
        }

        textArea.setText(currentText);
    }//GEN-LAST:event_FixSingleTranspositionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        operationExecuter.executeStrategy(new SelectAll(this));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void replaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceActionPerformed
        //yazılan kelime istenilen kelime ile değiştirilir.

        String değişen=JOptionPane.showInputDialog("değiştirmek istediğiniz kelimeyi giriniz:");
        String yeni=JOptionPane.showInputDialog("yerine  istediğiniz kelimeyi giriniz:");
        String yeniText= textArea.getText().replace(değişen, yeni);
        textArea.setText(yeniText);
    }//GEN-LAST:event_replaceActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        findWindow.setVisible(true);
    }//GEN-LAST:event_findActionPerformed

    private void findStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_findStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_findStateChanged

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasteActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        operationExecuter.executeStrategy(new Copy(this));
    }//GEN-LAST:event_copyActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cutActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        // yazılan kelimeyi harf harf geri alır.
        String currentText = textArea.getText();
        if(currentText.length() > 0){
            String undoAppliedText = currentText.substring(0, currentText.length() - 1);
            undoCommand undoCommand=new undoCommand(textArea,undoAppliedText);
            command.setCommand(undoCommand);
            command.runCommand();
        }
    }//GEN-LAST:event_undoActionPerformed

    private void getDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDateActionPerformed
        // TODO add your handling code here:
        operationExecuter.executeStrategy(new setDate(this));

    }//GEN-LAST:event_getDateActionPerformed
   
    private boolean HasSingleTransposition(String word, String vocabularyWord){
        //girilen kelimeyle dosyadaki doğru kelimeyi karşılaştırır.
        ArrayList<Integer> wrongCharIndexes = new ArrayList<>();
        
        for(int i = 0; i < word.length(); i++){
            char wordChar = word.charAt(i);
            char vocWordChar = vocabularyWord.charAt(i);
            
            if(wordChar != vocWordChar){
                //zaten iki ve fazla yanlış karakter varsa
                //single transposition yoktur.
                
                if(wrongCharIndexes.size()<2){
                    wrongCharIndexes.add(i);
                }
                else{
                    return false;
                }
            }  
            
        }
        //yanlış yazdığımız kelimenin harflerinin yerini değiştirip 
        //doğru olan sözlükteki kelime ile karşılaştırıyoruz. 
        if(wrongCharIndexes.size() == 2){        
            char wrongWordChar1 = word.charAt(wrongCharIndexes.get(0));
            char wrongWordChar2 = word.charAt(wrongCharIndexes.get(1));
            
            char wrongVocWordChar1 = vocabularyWord.charAt(wrongCharIndexes.get(0));
            char wrongVocWordChar2 = vocabularyWord.charAt(wrongCharIndexes.get(1));
            
            if(wrongWordChar1 == wrongVocWordChar2 && wrongWordChar2 == wrongVocWordChar1){
                return true;
            }
        }
        
        return false;
    }

    public static void main(String args[]) {
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
                
              
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Close;
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem SelectAll;
    private javax.swing.JMenuItem Undo;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem find;
    private javax.swing.JMenuItem getDate;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem replace;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPopupMenu.Separator sep1;
    private javax.swing.JPopupMenu.Separator sep_1;
    private javax.swing.JPopupMenu.Separator sep_2;
    private javax.swing.JPopupMenu.Separator sep_3;
    private javax.swing.JPopupMenu.Separator separator1;
    private javax.swing.JPopupMenu.Separator separator2;
    public javax.swing.JTextArea textArea;
    private javax.swing.JPopupMenu textPopupMenu;
    private javax.swing.JMenuItem undo;
    // End of variables declaration//GEN-END:variables
}
