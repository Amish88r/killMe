package commands;
import realisation.*;

import java.util.List;

public class Show implements Command {

    private Receiver receiver;

    public Show(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute(List<String> args) {
        return receiver.showDragons();
    }

    @Override
    public String getHelp() {
        return "Commands.Show: вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}
