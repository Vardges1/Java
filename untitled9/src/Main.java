public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Земля");
        System.out.println(earth.getName());

        Car bmw = new Car("Tesla");
        System.out.println(bmw.getName());

        Phone iphone = new Phone(1999.99);
        System.out.println(iphone.getPrice());

        Book Remark = new Book(19.99);
        System.out.println(Remark.getPrice());
    }
}