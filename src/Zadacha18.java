public class Zadacha18 {
    public static void main(String[] args) {
        System.out.println("Задача 8"); // Нам нужно написать астрономическое приложение
        int now = 2022;
        int before = now - 200;
        int after = now + 100;
        int firstFligth = 0;
        int frequency = 79 + firstFligth;
        for (; frequency >= 0; frequency = frequency + 79){
            if (before <= frequency && frequency <= after) {
                System.out.println(frequency);
            }
                }
            }
    }
