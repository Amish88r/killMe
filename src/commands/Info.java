package commands;

import commands.Command;
import realisation.Receiver;

import java.util.List;

/**
 * Displays information about collection
 */
public class Info implements Command {
    private Receiver receiver;

    public Info(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute(List<String> arguments) {
        return null;
    }

    @Override
    public String getHelp() {
        return null;
    }
}