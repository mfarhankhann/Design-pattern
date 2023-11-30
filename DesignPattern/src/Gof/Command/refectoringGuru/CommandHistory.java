/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Command.refectoringGuru;

/**
 *
 * @author OSL
 */
import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();
    private Stack<Command> redoHistory = new Stack<>();

    public void push(Command c) {
        history.push(c);
        redoHistory.clear(); // Clear redo history when a new command is pushed
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public boolean canRedo() {
        return !redoHistory.isEmpty();
    }

    public Command redo() {
        if (canRedo()) {
            Command command = redoHistory.pop();
            if (command != null) {
                history.push(command);
                return command;
            }
        }
        return null;
    }

    public void pushForRedo(Command c) {
        redoHistory.push(c);
    }
}
