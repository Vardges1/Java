package Pr23;
import java.util.HashMap;
// Класс TablesOrderManager управляет заказами для столов
//Предоставляет структуру для управления заказами для различных столов в ресторане,
// позволяет хранить и управлять заказами, сделанными для конкретных столов.
public class TablesOrderManager {
    //хэш карта для хранения закзаов по номерам столов
    HashMap<Integer, Object> orderHashMap = new HashMap<>();
    //метод для получения заказов для определенногоо стола
    public Object getOrder(int table){
        return orderHashMap.get(table);
    }
    //метод для удаления заказа для опред стола
    public void removeOrder(int table) {
        orderHashMap.remove(table);
    }
    //метод для получения хэша заказов
    public HashMap orders(){
        return orderHashMap;
    }

}
