package Pr24;

import java.util.Objects;

// Класс Drink описывает напиток, реализует интерфейс Item
public final class Drink implements Item {
    private final int cost;
    private final String name, description;

    // Конструктор класса Drink, инициализирующий поля напитка
    public Drink(String name, String description, int cost) throws IllegalArgumentException {
        // Проверка на некорректные параметры и выбрасывание исключения, если они не соответствуют требованиям
        if (cost == 0 || Objects.equals(name, "") || Objects.equals(description, ""))
            throw new IllegalArgumentException();
        else {
            this.name = name;
            this.description = description;
            this.cost = cost;
        }
    }

    // Методы интерфейса Item

    // Метод возвращает стоимость напитка
    public int getCost() {
        return cost;
    }

    // Метод возвращает описание напитка
    public String getDescription() {
        return description;
    }

    // Метод возвращает имя напитка
    public String getName() {
        return name;
    }
}
