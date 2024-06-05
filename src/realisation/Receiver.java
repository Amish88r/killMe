package realisation;

import dragon.Dragon;

import java.util.ArrayList;

public class Receiver {

    private ArrayList<Dragon> dragons = new ArrayList<>(); // Используем ArrayList<Dino> вместо ArrayList<Dragon>

    public String addDragon(Dragon dragon) { // Используем addDino вместо addDragon
        if (dragon == null) {
            return "Вы че мне тут ввели за динозавра лол??"; // FIXME OMG
        }
        if (dragons.add(dragon)) {
            return "Динозавр добавлен";
        } else {
            return "Динозавра добавить не удалось";
        }
    }

    public String showDragons() { // Используем showDinos вместо showDragons
        String dinosStr = "";

        for (int i = 0; i < dragons.size(); i++) {
            dinosStr += dragons.get(i) + "\n";
        }

        return dinosStr;
    }

    public String collectionSize() {
        return String.valueOf(dragons.size());
    }

    public String clear() {
        dragons.clear();
        return "Все удалено =(";
    }

    public String info() {
        return "продолжение следует";
    }
}