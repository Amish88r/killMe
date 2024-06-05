package dragon;

import enums.Color;
import enums.DragonType;
import environment.Coordinates;
import exceptions.WrongAttributeException;
import realisation.Receiver;

import java.time.ZonedDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TmpMain {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Scanner scanner = new Scanner(System.in);
        IdGenerator idGenerator = IdGenerator.getInstance();
        Dragon dragon = new Dragon();

        Long id = idGenerator.getId(); // null
        String name; // null
        Coordinates coordinates = new Coordinates(); // null
        ZonedDateTime time = ZonedDateTime.now(); // null
        Integer age; // null
        int weight; // 0
        Color color; // null
        DragonType dragonType; // null
        Person person = new Person(); // null

        try {
            if (Dragon.checkId(id)) {
                // ...
            }
            dragon.setId(id);
        } catch (WrongAttributeException e) {
            System.out.println("Ошибка работы генератора ID!!");
            throw new RuntimeException("Ошибка работы генератора ID!!: " + e.getMessage());
        }

        while (true) {
            System.out.println("Введите имя дракона");
            System.out.print("> ");
            name = scanner.nextLine();
            try {
                dragon.setName(name);
                break;
            } catch (WrongAttributeException e) {
                System.out.println("ОЙОЙОЙ: " + e.getMessage());
                System.out.println("Попробуйте снова!");
            }
        }

        while (true) {
            System.out.println("Введите возраст дракона");
            System.out.print("> ");
            try {
                age = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Не число!");
                System.out.println("Попробуйте снова!");
                scanner.next(); //  TODO ЗАЧЕМ делать scanner.next() после неправильного ввода????
                continue;
            }
            try {
                dragon.setAge(age);
                break;
            } catch (WrongAttributeException e) {
                System.out.println("ОЙОЙОЙ: " + e.getMessage());
                System.out.println("Попробуйте снова!");
            }
        }

        while (true) {
            System.out.println("Введите вес дракона");
            System.out.print("> ");
            try {
                weight = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Не число!");
                System.out.println("Попробуйте снова!");
                scanner.next();
                continue;
            }
            try {
                dragon.setWeight(age);
                break;
            } catch (WrongAttributeException e) {
                System.out.println("ОЙОЙОЙ: " + e.getMessage());
                System.out.println("Попробуйте снова!");
            }
        }

        while (true) {
            System.out.println("Выберите цвет глаз дракона");
            Color[] colors = Color.values();
            for (int i = 0; i < colors.length; i++) {
                System.out.println(i+1 + ") " + colors[i].toString());
            }
            int numFromUser = scanner.nextInt();
            if (numFromUser - 1 < 0 || numFromUser - 1 >= colors.length) {
                System.out.println("Число не то але!");
                System.out.println("Попробуйте снова!");
                continue;
            }
            color = colors[numFromUser - 1];
            try {
                dragon.setColor(color);
                break;
            } catch (WrongAttributeException e) {
                System.out.println("ОЙОЙОЙ: " + e.getMessage());
                System.out.println("Попробуйте снова!");
            }
        }

        while (true) {
            System.out.println("Выберите тип дракона");
            DragonType[] dragonTypes = DragonType.values();
            for (int i = 0; i < dragonTypes.length; i++) {
                System.out.println(i+1 + ") " + dragonTypes[i].toString());
            }
            int numFromUser = scanner.nextInt();
            if (numFromUser - 1 < 0 || numFromUser - 1 >= dragonTypes.length) {
                System.out.println("Число не то але!");
                System.out.println("Попробуйте снова!");
                continue;
            }
            dragonType = dragonTypes[numFromUser - 1];
            try {
                dragon.setType(dragonType);
                break;
            } catch (WrongAttributeException e) {
                System.out.println("ОЙОЙОЙ: " + e.getMessage());
                System.out.println("Попробуйте снова!");
            }
        }

        receiver.addDragon(dragon);
        System.out.println("SHOW_DRAGONS:");
        System.out.println(receiver.showDragons());

    }
}
