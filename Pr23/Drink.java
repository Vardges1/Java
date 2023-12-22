package Pr23;

import java.util.Objects;
//описание напитков
public final class Drink implements Item {
    // Поля класса Drink, описывающие напиток
    private final int cost;
    private final String name, description;

    // Конструктор класса Drink, инициализирующий поля напитка
    public Drink(String name, String description, int cost) throws IllegalArgumentException {
        // Проверка на некорректные параметры и выбрасывание исключения
        if (cost == 0 || Objects.equals(name, "") || Objects.equals(description, ""))
            throw new IllegalArgumentException();
        else {
            this.name = name;
            this.description = description;
            this.cost = cost;
        }
    }

    // Метод getCost() возвращает стоимость напитка
    public int getCost() {
        return cost;
    }

    // Метод getDescription() возвращает описание напитка
    public String getDescription() {
        return description;
    }

    // Метод getName() возвращает имя напитка
    public String getName() {
        return name;
    }
}
