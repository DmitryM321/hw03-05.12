public class Zadacha17 {
    public static void main(String[] args) {
        System.out.println("Задача 7"); // В компании пятница — отчетный день..
        int friday = 1;
        for (int mounth = 31; friday <= mounth; ) {
            for (; friday <= mounth; friday = friday + 7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            }
        }
    }
}