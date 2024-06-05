package commands;
//FIXME хз че тут сделать надо
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import dragon.Dragon;
import realisation.*;
import entity.*;


public class AddElement implements Command {

    private Receiver receiver;

    public AddElement(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute(List<String> arguments) {
        Dragon drug = new Dragon();
//        IdGenerator generator = IdGenerator.getInstance();
//        int dragonId = generator.getId();
        try {
            System.out.println("Введите имя дракона!");
            Scanner scanner = new Scanner(System.in);
            System.out.print("-> ");
            String dinoName = scanner.nextLine();
            System.out.println("Введите цвет дракоо");
            System.out.print("-> ");
            Integer dinoAge = scanner.nextInt();
            drug = new Dragon(DragonName, DragonAge);
        } catch (InputMismatchException ex) {
            drug = new Dragon(-1, "Имя по умлч", -1);
        }

        return receiver.addDragon(drug);

    }

    @Override
    public String getHelp() {
        return "add {element} : добавить новый элемент в коллекцию";
    }
}