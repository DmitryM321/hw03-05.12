public class Zadacha8 {
    public static void main(String[] args) {
        System.out.println("Задача 8"); // Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        int accumulation = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

    }
}