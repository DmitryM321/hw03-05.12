public class Zadacha13 {
    public static void main(String[] args) {
        System.out.println("Задача 3"); // В стране Y население равно 12 миллионов человек.
        int allPeople = 12_000_000;
        int birthOnThousand = 17;
        int deadOnThousand = 8;
        int birthAllPeople = birthOnThousand * allPeople/1000;
        int deadAllPeople = deadOnThousand * allPeople/1000;
        int allPeopleNew = allPeople;
        int year = 0;

        while(year < 10){
            year = year + 1;
            allPeopleNew = allPeopleNew + birthAllPeople - deadAllPeople;
            System.out.println("Год " + year + ", численность населения составляет " + allPeopleNew);

        }




    }
}