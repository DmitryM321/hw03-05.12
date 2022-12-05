public class Zadacha12 {
    public static void main(String[] args) {
        System.out.println("Задача 12"); /* Выведите в одну строку через пробел числа от 1 до 10 с помощью одного цикла while.
        и наоборот*/
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println("");
        int a = 10;
        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
    }
}