package commands;
import realisation.*;

import java.util.List;

public  class Save implements Command {

    private Receiver receiver;

    public Save(Receiver receiver) {
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
