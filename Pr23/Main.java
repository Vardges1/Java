package Pr23;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты блюд и напитков
        Dish dish1 = new Dish("Паста", "Макароны с фрикадельками", 400);
        Dish dish2 = new Dish("Салат", "Овощной салат", 300);
        Drink drink1 = new Drink("Кола", "Газированный напиток", 50);
        Drink drink2 = new Drink("Чай", "Зеленый чай", 100);

        // Создаем заказы и добавляем позиции
        InternetOrder order1 = new InternetOrder();
        order1.addPosition(dish1);
        order1.addPosition(drink1);

        InternetOrder order2 = new InternetOrder();
        order2.addPosition(dish2);
        order2.addPosition(drink2);

        // Выводим информацию о заказах
        System.out.println("Заказ 1:");
        printOrder(order1);
        System.out.println("Общая стоимость заказа 1: " + order1.costAll());

        System.out.println("Заказ 2:");
        printOrder(order2);
        System.out.println("Общая стоимость заказа 2: " + order2.costAll());

        // Создаем менеджера заказов для столов
        TablesOrderManager orderManager = new TablesOrderManager();

        // Добавляем заказы для столов
        orderManager.orders().put(1, order1);
        orderManager.orders().put(2, order2);

        // Получаем и выводим заказы для столов
        System.out.println("Заказ для стола 1:");
        printOrder((InternetOrder) orderManager.getOrder(1));
        System.out.println("Заказ для стола 2:");
        printOrder((InternetOrder) orderManager.getOrder(2));
    }

    // Метод для вывода информации о заказе
    private static void printOrder(InternetOrder order) {
        String[] dishes = order.getDishes();
        for (String dish : dishes) {
            System.out.println(dish);
        }
    }
}
