public class Zadacha9 {
    public static void main(String[] args) {
        System.out.println("Задача 9"); // Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей под 12%.
        int accumulation1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + (total1 / 100);
            total1 = total1 + accumulation1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1 + " рублей");
        }
    }
}