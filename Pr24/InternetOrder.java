//Казаев 12,20
package Pr24;

import java.util.HashMap;

public class InternetOrder {

    private HashMap<String, RestaurantOrder> orderHashMap1 = new HashMap<>();

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String address : orderHashMap1.keySet()) {
            result.append("Адрес: ").append(address).append("\n");
            result.append("Заказ: ").append(orderHashMap1.get(address)).append("\n");
        }
        return result.toString();
    }

    // Метод для добавления интернет-заказа
    public void addOrderInternet(String address, RestaurantOrder o) throws Exception {
        if (orderHashMap1.containsKey(address)) {
            throw new Exception("На этот адрес уже есть заказ!");
        }
        orderHashMap1.put(address, o); // Добавление интернет-заказа
    }

    // Метод для добавления блюда в интернет-заказ по адресу
    public void addFoodToOrder(String address, Item dishName) {
        if (orderHashMap1.containsKey(address)) {
            orderHashMap1.get(address).addPosition(dishName);
        } else {
            // If the address does not have an order yet, create a new order
            RestaurantOrder newOrder = new RestaurantOrder();
            newOrder.addPosition(dishName);
            orderHashMap1.put(address, newOrder);
        }
    }

    // Метод для получения интернет-заказа
    public RestaurantOrder getOrder(String address) {
        return orderHashMap1.get(address);
    }

    // Метод для удаления интернет-заказа
    public void removeOrderInternet(String address) {
        orderHashMap1.remove(address);
    }

    // Метод для получения всех интернет-заказов
    public HashMap<String, RestaurantOrder> getInternetOrder() {
        return orderHashMap1;
    }
}
