package enums;

// FIXME убрать из пакета
public enum Color {
    GREEN("Зеленый"),
    RED("Красный"),
    BLACK("Черный"),
    BLUE("Синий"),
    WHITE("Белый");

    private final String title;

    Color(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
