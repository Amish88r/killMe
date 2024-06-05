package dragon;

import enums.Color;
import enums.DragonType;
import environment.Coordinates;
import exceptions.WrongAttributeException;

import java.time.ZonedDateTime;

public class Dragon {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer age; //Значение поля должно быть больше 0, Поле может быть null
    private int weight; //Значение поля должно быть больше 0
    private Color color; //Поле не может быть null
    private DragonType type; //Поле может быть null
    private Person killer; //Поле может быть null

    public Dragon() {
    }

    public Dragon(
            Long id,
            String name,
            Coordinates coordinates,
            ZonedDateTime creationDate,
            Integer age,
            int weight,
            Color color,
            DragonType type,
            Person killer
    ) throws WrongAttributeException {
        setId(id);
        setName(name);
        setCoordinates(coordinates);
        setCreationDate(creationDate);
        setAge(age);
        setWeight(weight);
        setColor(color);
        setType(type);
        setKiller(killer);
    }

    public Long getId() {
        return id;
    }

    public static boolean checkId(Long id) {
        return id != null && id > 0;
    }

    public void setId(Long id) throws WrongAttributeException {
        if (id == null || id <= 0) {
            throw new WrongAttributeException("Поле id больше 0 и не null!");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws WrongAttributeException {
        if (name == null || name.isEmpty()) {
            throw new WrongAttributeException("Поле name не null и не пустое!");
        }
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) throws WrongAttributeException {
        if (coordinates == null) {
            throw new WrongAttributeException("Поле coordinates не null!");
        }
        this.coordinates = coordinates;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(ZonedDateTime creationDate) throws WrongAttributeException {
        if (creationDate == null) {
            throw new WrongAttributeException("Поле creationDate не null!");
        }
        this.creationDate = creationDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws WrongAttributeException {
        if (age != null) {
            if (age <= 0) {
                throw new WrongAttributeException("Поле age не больше нуля!");
            }
        }
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws WrongAttributeException {
        if (weight <= 0) {
            throw new WrongAttributeException("Поле weight не меньше нуля!");
        }
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) throws WrongAttributeException {
        if (color == null) {
            throw new WrongAttributeException("Поле color не null!");
        }
        this.color = color;
    }

    public DragonType getType() {
        return type;
    }

    public void setType(DragonType type) throws WrongAttributeException {
        if (type == null) {
            throw new WrongAttributeException("Поле type не null!");
        }
        this.type = type;
    }

    public Person getKiller() {
        return killer;
    }

    public void setKiller(Person killer) throws WrongAttributeException {
        if (killer == null) {
            throw new WrongAttributeException("Поле killer не null!");
        }
        this.killer = killer;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", age=" + age +
                ", weight=" + weight +
                ", color=" + color +
                ", type=" + type +
                ", killer=" + killer +
                '}';
    }
}
