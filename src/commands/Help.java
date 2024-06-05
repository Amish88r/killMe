package commands;

import commands.Command;
import realisation.Receiver;

import java.util.ArrayList;
import java.util.List;

/**
 * Prints all available commands and their descriptions
 */
public class Help implements Command {

    private Receiver receiver;
    private List<String> commandsDescription;

    public Help(Receiver receiver) {
        this.receiver = receiver;
        this.commandsDescription = new ArrayList<>();
    }

    public Help(Receiver receiver, List<String> commands) {
        this(receiver);
        this.commandsDescription = commands;
    }

    @Override
    public String execute(List<String> args) {
        return null;
    }

    @Override
    public String getHelp() {
        return null;
    }
}