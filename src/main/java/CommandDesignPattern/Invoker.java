package CommandDesignPattern;

import java.io.IOException;

// An invoker fo command
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }
    public void execute() throws IOException {
        this.command.execute();
    }
}
