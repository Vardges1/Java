package Pr24;
import java.util.HashMap;
//Назначение: Этот класс управляет заказами для столов и через интернет, используя две хэш-карты для хранения информации о заказах (для столов и для интернета) и методы для добавления, удаления и получения заказов по номеру стола или адресу в случае заказа через интернет.
//Функциональность: Он содержит методы для добавления заказа, получения заказа по номеру стола или адресу, удаления заказа, получения всех заказов для столов или интернет-заказов.
public class OrderManager {

    // Хэш-карта для хранения заказов для столов
    HashMap<Integer, Object> orderHashMap = new HashMap<>();
    // Хэш-карта для хранения интернет-заказов
    HashMap<String, Object> orderHashMap1 = new HashMap<>();

    // Метод для добавления заказа для стола
    public void add(Order o, int table) throws OrderAlreadyException {
        // Преобразование списка заказанных блюд в строку для проверки наличия заказа на столе
        String str = String.join(",", o.getDishes());
        // Проверка наличия заказа на столе
        if (orderHashMap.containsKey(table))
            throw new OrderAlreadyException(table); // Выброс исключения, если заказ уже существует
        else orderHashMap.put(table, str); // Добавление заказа на стол
    }

    // Метод для получения заказа для стола
    public Object getOrder(int table){
        return orderHashMap.get(table);
    }

    // Метод для добавления блюда к заказу для стола
    public void add(Dish dish, int table) throws OrderAlreadyException {
        if (orderHashMap.containsKey(table))
            throw new OrderAlreadyException(table); // Выброс исключения, если заказ уже существует
        else orderHashMap.put(table, dish); // Добавление блюда к заказу для стола
    }

    // Метод для удаления заказа для стола
    public void removeOrder(int table) {
        orderHashMap.remove(table);
    }

    // Метод для получения всех заказов для столов
    public HashMap orders(){
        return orderHashMap;
    }

    // Метод для добавления интернет-заказа
    public void add(Order o, String address) {
        // Преобразование списка заказанных блюд в строку для хранения в хэш-карте
        String str = String.join(",", o.getDishes());
        orderHashMap1.put(address, str); // Добавление интернет-заказа
    }

    // Метод для получения интернет-заказа
    public Object getOrder(String address){
        return orderHashMap1.get(address);
    }

    // Метод для удаления интернет-заказа
    public void removeOrderInternet(String address){
        orderHashMap1.remove(address);
    }

    // Метод для получения всех интернет-заказов
    public HashMap getInternetOrder(){
        return orderHashMap1;
    }
}