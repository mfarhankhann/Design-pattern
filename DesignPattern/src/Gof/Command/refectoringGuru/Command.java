/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Command.refectoringGuru;

/**
 *
 * @author OSL
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }
       private String undoBackup;
    private String redoBackup;

    void backupForUndo() {
        undoBackup = editor.textField.getText();
    }

    void backupForRedo() {
        redoBackup = editor.textField.getText();
    }

    public void redo() {
        editor.textField.setText(redoBackup);
    }

    public abstract boolean execute();
}
