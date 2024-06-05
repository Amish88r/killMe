package commands;
import dragon.*;
import realisation.*;

import java.util.List;

public class PrintUniqColor implements Command {

    private Receiver receiver;

    public PrintUniqColor(Receiver receiver) {
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
