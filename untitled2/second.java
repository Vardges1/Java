import java.util.Arrays;
import java.util.Random;

public class second {
    public static void main(String[] args) {
        // Вывод на экран сумму чисел массива с помощью циклов for, while, do while.
        int[] numbers = {1, 2, 3, 4, 5};
        int sumFor = 0;
        int sumWhile = 0;
        int sumDoWhile = 0;

        // Используем цикл for
        for (int i = 0; i < numbers.length; i++) {
            sumFor += numbers[i];
        }
        System.out.println("Сумма с использованием цикла for: " + sumFor);

        // Используем цикл while
        int j = 0;
        while (j < numbers.length) {
            sumWhile += numbers[j];
            j++;
        }
        System.out.println("Сумма с использованием цикла while: " + sumWhile);

        // Используем цикл do while
        int k = 0;
        do {
            sumDoWhile += numbers[k];
            k++;
        } while (k < numbers.length);
        System.out.println("Сумма с использованием цикла do while: " + sumDoWhile);

        // Вывод на экран аргументов командной строки в цикле for.
        System.out.println("Аргументы командной строки:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // Вывод на экран первые 10 чисел гармонического ряда.
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            double harmonic = 1.0 / i;
            System.out.println(harmonic);
        }

        // Сгенерированный массив целых чисел случайным образом, вывести его на экран, отсортировать его и снова вывести на экран.
        int[] randomNumbers = new int[10];
        Random random = new Random();

        // Заполнение массива случайными числами от 1 до 100
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100) + 1;
        }

        System.out.println("Исходный массив: " + Arrays.toString(randomNumbers));

        // Сортировка массива
        Arrays.sort(randomNumbers);

        System.out.println("Отсортированный массив: " + Arrays.toString(randomNumbers));

        //  метод, вычисляющий факториал числа с помощью цикла и проверить работу метода.
        int number = 5; // Здесь задайте число, для которого нужно вычислить факториал
        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}