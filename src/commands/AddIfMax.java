package commands;
import realisation.Receiver;

import java.util.List;

/**
 * Add an element to the collection if it's greater than the maximum
 */
public class AddIfMax implements Command {
    private Receiver receiver;

    public AddIfMax(Receiver receiver) {
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