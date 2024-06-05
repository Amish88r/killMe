package commands;

import java.util.List;

/**
 * Интерфейс, который реализуeт все команды
 */
public interface Command {

    /**
     * Выполнить команду
     * @return Строка-результат выполнения команды
     */
    String execute(List<String> args);

    /**
     * Получить справку по команде
     * @return Строка-справка по команде
     */
    String getHelp();

}
