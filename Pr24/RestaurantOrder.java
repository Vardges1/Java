package Pr24;
import java.util.ArrayList;
import java.util.List;

// Класс RestaurantOrder реализует интерфейс Order и представляет заказ в ресторане
public class RestaurantOrder implements Order {
    private int size;
    List<Item> dishList = new ArrayList<>();
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Item item : dishList) {
            result.append(item.getName())
                    .append(" ")
                    .append(item.getDescription())
                    .append(" ")
                    .append(item.getCost())
                    .append(",");
        }
        return result.toString();
    }

    // Методы интерфейса Order:

    // Метод для получения информации о блюдах в заказе
    public String[] getDishes() {
        String[] str = new String[dishList.size()];
        for (int i = 0; i < dishList.size(); i++)
            str[i] = dishList.get(i).getName() + " " + dishList.get(i).getDescription() + " " + dishList.get(i).getCost();
        return str;
    }

    // Метод для подсчета количества блюд в заказе
    @Override
    public int count() {
        return dishList.size();
    }

    // Метод для удаления блюда из заказа по его названию
    @Override
    public boolean remove(String dishName) {
        return dishList.remove(dishName);
    }

    // Метод для удаления всех блюд с определенным именем из заказа
    @Override
    public void deleteAll(String name) {
        dishList.clear();
    }

    // Дополнительные методы для управления заказом

    // Метод для получения названий блюд в заказе
    public String[] dishesName() {
        String[] str = new String[0];
        for (int i = 0; i < dishList.size(); i++)
            str[i] = dishList.get(i).getName();
        return str;
    }

    // Метод для добавления блюда в заказ
    @Override
    public void addPosition(Item dishName) {
        dishList.add(dishName);
    }

    // Метод для получения количества блюд в заказе
    public int DishQuantity() {
        return dishList.size();
    }

    // Метод для получения количества определенного блюда в заказе
    public int DishQuantity(String dishName) {
        int k = 0;
        while (dishList.contains(dishName)) k++;
        return k;
    }

    // Метод для подсчета общей стоимости всех блюд в заказе
    @Override
    public int costAll() {
        int sum = 0;
        for (Item item : dishList) sum += item.getCost();
        return sum;
    }

    // Метод для подсчета количества блюд с определенным именем в заказе
    @Override
    public int orderName(String p) {
        int k = 0;
        while (dishList.contains(p)) k++;
        return k;
    }
}
