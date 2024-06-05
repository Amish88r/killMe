package enums;

public enum DragonType {
    WATER("Водяной"),
    UNDERGROUND("Подземный"),
    AIR("Воздушный"),
    FIRE("Огненный");

    private String title;

    DragonType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
