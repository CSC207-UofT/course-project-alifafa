package main.CommandControl;

import main.Controllers.Controller;

/**
 * This is an abstract class, which is the parent to all valid commands.
 * It can execute the command by using the corresponding controller. Each command must have a controller.
 */
public abstract class Command {
    public abstract void run(String[] userInput);
}
