package CommandDesignPattern;

public class LogInCommand implements Command {
    private final Receiver receiver;

    public LogInCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.switchOn();
    }

}
