public class Zadacha15 {
    public static void main(String[] args) {
        System.out.println("Задача 5"); // Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
        int accumulation4 = 15000;
        int total4 = 0;
        int month2 = 0;
        for( month2 = 0; total4 < 12_000_000; month2 = month2 + 1) {

            total4 = total4 + accumulation4 + (total4 * 7 / 100);
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма накоплений равна " + total4 + " рублей");
            }
        }
        }
}