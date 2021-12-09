package CommandDesignPattern;


// LogInCommand that helps to log in
public class LogInCommand implements Command {
    private final Receiver receiver;

    public LogInCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.switchOn();
    }

}
