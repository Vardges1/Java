package Pr23;

import java.util.Objects;
//описание блюд
public final class Dish implements Item {
    // Поля класса Dish, описывающие блюдо
    private final String name, description;
    private final int cost;

    // Конструктор класса Dish, инициализирующий поля блюда
    public Dish(String name, String description, int cost) throws IllegalArgumentException {
        // Проверка на некорректные параметры и выбрасывание исключения
        if (cost == 0 || Objects.equals(name, "") || Objects.equals(description, ""))
            throw new IllegalArgumentException();
        else {
            this.name = name;
            this.description = description;
            this.cost = cost;
        }
    }

    // Переопределение метода getName() интерфейса Item, возвращающего имя блюда
    @Override
    public String getName() {
        return name;
    }

    // Переопределение метода getCost() интерфейса Item, возвращающего стоимость блюда
    @Override
    public int getCost() {
        return cost;
    }

    // Переопределение метода getDescription() интерфейса Item, возвращающего описание блюда
    @Override
    public String getDescription() {
        return description;
    }
}
