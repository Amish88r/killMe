package commands;

import exceptions.BadComArg;
import realisation.Receiver;

import java.util.List;

/**
 * Exits the program
 */
public class Exit implements Command {

    private Receiver receiver;

    public Exit(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute(final List<String> arguments) {
        //  ExitException
        return null;
    }

    @Override
    public String getHelp() {
        return null;
    }
}