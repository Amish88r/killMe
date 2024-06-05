package commands;

import realisation.*;

import java.util.List;

public class Clear implements Command {

    private Receiver receiver;

    public Clear(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute(List<String> arguments) {
        if (!arguments.isEmpty()) {
            return "Clear requires no arguments!";
        }
        return receiver.clear();
    }

    @Override
    public String getHelp() {
        return "clear : очистить коллекцию";
    }
}
