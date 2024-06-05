package realisation;

import commands.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс для чего-то, хз я пока не решил....
 */
public class Invoker {

    private Map<String, Command> commandMap = new HashMap<>();

    public Invoker() {
        Receiver receiver = new Receiver();

        AddElement add = new AddElement(receiver);
        commandMap.put("add", add);

        Show show = new Show(receiver);
        commandMap.put("show", show);

        Clear clear = new Clear(receiver);
        commandMap.put("clear", clear);

        Info info = new Info(receiver);
        commandMap.put("info", info);



        ////////

        List<String> description = new ArrayList<>();

        for (Command cmd : commandMap.values()) {
            description.add(cmd.getHelp());
        }

        Help help = new Help(receiver);
        Help help1 = new Help(receiver, description);
        commandMap.put("help", help);
    }

    public String executeCommand(String[] commandLine) {
        Command command = commandMap.get(commandLine[0]);
        if (command == null) {
            return "Такой команды нет!";
        }
        List<String> arguments = new ArrayList<>();
        for (int i = 0; i < commandLine.length; i++) {
            if (i == 0) {
                continue;
            }
            arguments.add(commandLine[i]);
        }
        return command.execute(arguments);
    }
}