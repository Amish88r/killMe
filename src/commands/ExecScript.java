package commands;

import realisation.Receiver;

import java.util.List;

public class ExecScript implements Command {

    private Receiver receiver;

    public ExecScript(Receiver receiver) {
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