//import enums.Color;
//import dragon.Person;
//import exceptions.WrongAttributeException;
//
//import java.util.Scanner;
//
//public class InputSmth {
//
//    Scanner scanner = new Scanner(System.in);
//
//    public Person typePerson() {
//        String name; //Поле не может быть null, Строка не может быть пустой
//        double height; //Значение поля должно быть больше 0
//        Color eyeColor; //Поле не может быть null
//        Color hairColor; //Поле не может быть null
//        Person tmpPerson = new Person();
//        while (true) {
//            System.out.println("Введите имя!");
//            name = scanner.nextLine();
//            try {
//                tmpPerson.setName(name);
//            } catch (WrongAttributeException ex) {
//                System.out.println("Неверный формат имени!!!");
//                continue;
//            }
//            break;
//        }
//
//        while (true) {
//            System.out.println("Введите цвет глаз!");
//            for (int i = 0; i < Color.values().length; i++) {
//                System.out.println(i + ") " + Color.values()[i]);
//            }
//            String inputtedEyeColor = scanner.nextLine();
//
//            try {
//                Color color = Color.valueOf(inputtedEyeColor);
//                tmpPerson.setEyeColor(color);
//            } catch (IllegalArgumentException ex) {
//                System.out.println("Такого цвета нету!");
//                continue;
//            }
//            break;
//        }
//    }
//
//}
