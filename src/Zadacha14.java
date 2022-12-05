public class Zadacha14 {
    public static void main(String[] args) {
        System.out.println("Задача 4"); // Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%
        int accumulation4 = 15000;
        int total4 = 0;
        int month2 = 0;
        int percent;
        for( month2 = 0; total4 < 12_000_000; month2 = month2 + 1) {

            total4 = total4 + accumulation4 + (total4*7/100);
            System.out.println("Месяц " + month2 +  " сумма накоплений равна " + total4 + " рублей");
        }
    }
}