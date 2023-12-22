package Pr24;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты блюд и напитков
        Dish dish1 = new Dish("Паста", "Макароны с фрикадельками", 400);
        Drink drink1 = new Drink("Кола", "Газированный напиток", 50);
        Dish dish2 = new Dish("Салат", "Овощной салат", 300);
        Drink drink2 = new Drink("Чай", "Зеленый чай", 100);

        // Создаем заказы и добавляем позиции
        RestaurantOrder order1 = new RestaurantOrder();
        order1.addPosition(dish1);
        order1.addPosition(drink1);

        RestaurantOrder order2 = new RestaurantOrder();
        order2.addPosition(dish2);
        order2.addPosition(drink2);

        // Интернет заказ
        InternetOrder io = new InternetOrder();

        // Добавление блюд в интернет-заказ
        try {
            io.addFoodToOrder("address1", dish1);
            io.addFoodToOrder("address1", dish1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Создаем менеджера заказов для столов
        OrderManager orderManager = new OrderManager();

        // Добавляем заказы для столов
        try {
            orderManager.add(order1, 1);
            orderManager.add(order2, 2);
            orderManager.add(order2, 1);
        } catch (OrderAlreadyException e) {
            System.out.println("Стол уже занят! " + e.getMessage());
        }

// Получаем и выводим заказы для столов
        System.out.println("Заказ для стола 1:");
        System.out.println(orderManager.getOrder(1));

        System.out.println("Заказ для стола 2:");
        System.out.println(orderManager.getOrder(2));

        // Получаем и выводим интернет-заказ по адресу
        System.out.println("Интернет-заказ для адреса 'address1':");
        System.out.println(io.getOrder("address1"));



    }
}
