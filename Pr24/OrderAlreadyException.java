package Pr24;
public class OrderAlreadyException extends Exception {
    public OrderAlreadyException(int ex) {
        // Вызов конструктора родительского класса с сообщением об ошибке
        super("Заказ уже добавлен на " + ex + " стол");
    }
}