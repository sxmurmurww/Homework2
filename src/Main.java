public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 127;
        short b = 1544;
        int c = 15449;
        long k = 36555994654L;
        float d = 3.856f;
        double e = 5.5899766;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной k с типом long равно " + k);
        System.out.println("Значение переменной d с типом float равно " + d);
        System.out.println("Значение переменной e с типом double равно " + e);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long c = 987678965549L;
        double d = 2.786;
        short v = 569;
        short w = -159;
        short r = 27897;
        byte y = 67;
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int firstTeacher = 23;
        int secondTeacher = 27;
        int thirdTeacher = 30;
        int amountOfPaper = 480;

        int paperForStudents = amountOfPaper / (firstTeacher + secondTeacher + thirdTeacher);

        System.out.println("На каждого ученика рассчитано " + paperForStudents + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int bottlesPerMinute = bottles / minutes;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        int bottlesPerHours = bottlesPer20Minutes * 3;
        int bottlesPerDay = bottlesPerHours * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPer3Days * 10;

        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int numberOfCansOfPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int numberOfClasses = numberOfCansOfPaint / (whitePaint + brownPaint);
        int numberOfWhitePaint = whitePaint * numberOfClasses;
        int numberOfBrownPaint = brownPaint * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfWhitePaint + " банок белой краски и " + numberOfBrownPaint + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int bananasCount = 5;
        int milkCount = 2;
        int iceCreamCount = 2;
        int eggsCount = 4;
        int weightBanana = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;

        int totalWeightInGrams = bananasCount * weightBanana + milkCount * weightMilk + iceCreamCount * weightIceCream + eggsCount * weightEgg;
        double totalWeightInKg = totalWeightInGrams / 1000;

        System.out.println("Общий вес в граммах " + totalWeightInGrams + ", в кг" + totalWeightInKg);
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int weightForLossInGrams = 7000;
        int lossWeightPerDayM = 250;
        int lossWeightPerDayX = 500;

        double maxDaysCount = (double) weightForLossInGrams / lossWeightPerDayM;
        double minDaysCount = (double) weightForLossInGrams / lossWeightPerDayX;
        double lossWeightPerDayMX = lossWeightPerDayX + lossWeightPerDayM;
        double averageDaysCount = weightForLossInGrams / lossWeightPerDayMX;
        System.out.println("Минимальное кол-во дней для похудения " + minDaysCount);
        System.out.println("Максимальное кол-во дней для похудения " + maxDaysCount);
        System.out.println("Среднее кол-во дней для похудения " + averageDaysCount);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        double indexPercent = 1.1;

        double newMashaSalary = mashaSalary * indexPercent;
        double newDenisSalary = denisSalary * indexPercent;
        double newKristinaSalary = kristinaSalary * indexPercent;

        double annualMashaSalary = 12 * mashaSalary;
        double newAnnualMashaSalary = 12 * newMashaSalary;

        double annualDenisSalary = 12 * denisSalary;
        double newAnnualDenisSalary = 12 * newDenisSalary;

        double annualKristinaSalary = 12 * kristinaSalary;
        double newAnnualKristinaSalary = 12 * newKristinaSalary;

        System.out.print("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + (newAnnualMashaSalary - annualMashaSalary) + " рублей");
        System.out.print("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + (newAnnualDenisSalary - annualDenisSalary) + " рублей");
        System.out.print("Кристинатеперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + (newAnnualKristinaSalary - annualKristinaSalary) + " рублей");
    }
};