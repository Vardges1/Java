package Pr24;

import java.util.Objects;

// Класс Dish описывает блюдо, реализует интерфейс Item
public final class Dish implements Item {
    private final String name, description;
    private final int cost;

    // Конструктор класса Dish, инициализирующий поля блюда
    public Dish(String name, String description, int cost) throws IllegalArgumentException {
        // Проверка на некорректные параметры и выбрасывание исключения, если они не соответствуют требованиям
        if (cost == 0 || Objects.equals(name, "") || Objects.equals(description, ""))
            throw new IllegalArgumentException();
        else {
            this.name = name;
            this.description = description;
            this.cost = cost;
        }
    }

    // Переопределенные методы интерфейса Item

    // Метод возвращает имя блюда
    @Override
    public String getName() {
        return name;
    }

    // Метод возвращает стоимость блюда
    @Override
    public int getCost() {
        return cost;
    }

    // Метод возвращает описание блюда
    @Override
    public String getDescription() {
        return description;
    }
}
