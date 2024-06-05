package realisation;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        System.out.println(System.getenv("PORT"));
//        System.out.println(args[0]);
        System.out.println("Привет, можешь вводить команды");
        String commandLine;
        Scanner scanner = new Scanner(System.in);
        Invoker invoker = new Invoker();

        while (true) {
            commandLine = scanner.nextLine();
            String[] commandArgs = commandLine.split(" ");
            String result = invoker.executeCommand(commandArgs);
            System.out.println("Результат выполнения:");
            System.out.println(result);
        }

    }

}
