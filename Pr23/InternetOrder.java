package Pr23;
//заказы сделанные через интернет
//Хранит список блюд и напитков, обеспечивает
// функции для управления заказом, такие
// как добавление, удаление, подсчет стоимости и получение информации о позициях заказа.
import java.util.ArrayList;
import java.util.List;

public class InternetOrder implements Order {
    // Создание списка для хранения позиций заказа
    List<Item> list = new ArrayList<>();

    // Метод для добавления позиции в заказ
    public void addPosition(Item item) {
        list.add(item);
    }

    // Метод для подсчета количества позиций в заказе
    public int count() {
        return list.size();
    }

    // Удаление позиции из заказа по названию блюда или напитка
    @Override
    public boolean remove(String food) {
        // Возвращает true, если удаление произошло успешно
        return list.removeIf(item -> item.getName().equals(food));
    }

    // Удаление всех позиций с заданным именем (блюда или напитка)
    @Override
    public void deleteAll(String name) {
        list.removeIf(item -> item.getName().equals(name));
    }

    // Получение информации о блюдах и напитках в заказе
    @Override
    public String[] getDishes() {
        String[] str = new String[list.size()];
        for (int i = 0; i < list.size(); i++)
            str[i] = list.get(i).getName() + " " + list.get(i).getDescription() + " " + list.get(i).getCost();
        return str;
    }

    // Подсчет общей стоимости всех позиций в заказе
    @Override
    public int costAll() {
        int sum = 0;
        for (Item item : list) sum += item.getCost();
        return sum;
    }

    // Подсчет количества позиций с заданным именем (блюда или напитка)
    @Override
    public int orderName(String p) {
        int k = 0;
        for (Item item : list) {
            if (item.getName().equals(p)) {
                k++;
            }
        }
        return k;
    }
}
