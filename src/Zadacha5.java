public class Zadacha5 {
    public static void main(String[] args) {
        System.out.println("Задача 5"); // Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        for (int i = 1904; i <= 2096; i = i + 4) {
            if ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0))) ;
            System.out.println(i);
        }
    }
    }
