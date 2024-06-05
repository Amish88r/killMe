package entity;

import enums.Color;
import exceptions.WrongAttributeException;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private double height; //Значение поля должно быть больше 0
    private Color eyeColor; //Поле не может быть null
    private Color hairColor; //Поле не может быть null

    public Person(String name, double height, Color eyeColor, Color hairColor) {
        this.name = name;
        this.height = height;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws WrongAttributeException {
        if (name == null || name.isEmpty()) {
            throw new WrongAttributeException("Invalid name for Person");
        }
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws WrongAttributeException {
        if (height <= 0) {
            throw new WrongAttributeException("Wrong height for Person");
        }
        this.height = height;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }
}
