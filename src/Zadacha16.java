public class Zadacha16 {
    public static void main(String[] args) {
        System.out.println("Задача 6"); // Василий решил, что будет копить деньги ближайшие 9 лет.
        int accumulation5 = 15000;
        int total5 = 0;
        int year = 9;
        int month5 = 0;
        int allMonth = (month5 +1) * 12 * year;
        while(month5 <= allMonth) {
            month5 = month5 + 1;
            total5 = total5 + accumulation5 + (total5 * 7 / 100);
            if (month5 % 6 == 0) {
                System.out.println("Месяц " + month5 + " сумма накоплений равна " + total5 + " рублей");
            }
        }
    }
}