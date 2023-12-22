package Pr24;
// Интерфейс Order определяет методы для работы с заказом
public interface Order {
    // Метод для добавления позиции в заказ (блюда или напитка)
    void addPosition(Item item);

    // Метод для подсчета количества позиций в заказе
    int count();

    // Метод для удаления позиции из заказа по названию (блюда или напитка)
    boolean remove(String dishName);

    // Метод для удаления всех позиций с заданным именем (блюда или напитка)
    void deleteAll(String name);

    // Метод для подсчета общей стоимости всех позиций в заказе
    int costAll();

    // Метод для подсчета количества позиций с заданным именем (блюда или напитка)
    int orderName(String p);

    // Метод для получения информации о позициях заказа (блюдах и напитках)
    String[] getDishes();
}