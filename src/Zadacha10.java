public class Zadacha10 {
    public static void main(String[] args) {
        System.out.println("Задача 10"); // Выведите на экран первые 11 членов последовательности Фибоначчи.
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 11; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}