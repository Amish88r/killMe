package commands;
import realisation.*;

import java.util.List;

public class Reorder implements Command {

    private Receiver receiver;

    public Reorder(Receiver receiver) {
        this.receiver = receiver;
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
