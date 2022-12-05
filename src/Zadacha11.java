public class Zadacha11 {
    public static void main(String[] args) {
        System.out.println("Задача 1"); // сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при
        int accumulation2 = 15000;
        int total2 = 0;
        int month = 0;
        while  (total2 <= 2459000) {
            month = month + 1;
            total2 = total2 + accumulation2;
            System.out.println("Месяц " + month +  " сумма накоплений равна " + total2 + " рублей");
        }
    }
}