public class Main {
    public static void main(String[] args) {
        //Задача 1
        int numberPlauer = 196;
        byte numberOfSeats = 30;
        short lengthOfCable = 5156;
        long ceilingPeight = 3541;
        float weightDifference = 1.6f;
        double accelerationSection = 1325.3;
        System.out.println("Задача 1");
        System.out.println("Значение переменной с типом int равно " + numberPlauer);
        System.out.println("Значение переменной с типом byte равно " + numberOfSeats);
        System.out.println("Значение переменной с типом short равно " + lengthOfCable);
        System.out.println("Значение переменной с типом long равно " + ceilingPeight);
        System.out.println("Значение переменной с типом float равно " + weightDifference);
        System.out.println("Значение переменной с типом double равно " + accelerationSection);
        //Задача 2
        byte a = 67;
        int v = -159;
        int b = 569;
        short c = 27897;
        long d = 987678965549L;
        float e = 27.12f;
        double f = 2.786;
        System.out.println("Задача 2");
        System.out.println(a);
        System.out.println(v);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        // Задача 3
        byte classA = 23;
        byte classB = 27;
        byte classC = 30;
        short totalSheets = 480;
        int totalStudents = classA + classB + classC;
        int sheetsPerStudent = totalSheets / totalStudents;
        System.out.println("Задача 3");
        System.out.println("На каждого ученика расчитано " + sheetsPerStudent + " листов бумаги");
        // Задача 4
        byte productivityInTwoMinutes = 16;
        int productivityInOneMinute = productivityInTwoMinutes / 2;
        int inTwentyMinutes = productivityInOneMinute * 20;
        int perDay = productivityInOneMinute * 1440;
        int forThreeDays = productivityInOneMinute * 4320;
        int perMonth = productivityInOneMinute * 43800;
        System.out.println("Задача 4");
        System.out.println("За двадцать минут машина произвела " + inTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + perDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + forThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + perMonth + " штук бутылок");
        //Задача 5
        byte totalPaint = 120;
        byte whitePaintForClass = 2;
        byte brownPaintForClass = 4;
        int totalPaintForTheClass = whitePaintForClass + brownPaintForClass;
        int classesAtSchool = totalPaint / totalPaintForTheClass;
        int allWhitePaint = whitePaintForClass * classesAtSchool;
        int justBrownPaint = brownPaintForClass * classesAtSchool;
        System.out.println("Задача 5");
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + allWhitePaint + " банок белой краски и " + justBrownPaint + " банок коричневой краски");
        //Задача 6
        byte oneBanana = 80;
        byte oneHundredMillilitersOfMilk = 105;
        byte iceCream = 100;
        byte oneEgg = 70;
        float totalWeightInGrams = (oneBanana * 5) + (oneHundredMillilitersOfMilk * 2) + (iceCream * 2) + (oneEgg * 4);
        float totalWeightInKilograms = totalWeightInGrams / 1000;
        System.out.println("Задача 6");
        System.out.println("Завтрак сортсмена в граммах " + totalWeightInGrams + " г.");
        System.out.println("Завтрак спортсмена в килограммах " + totalWeightInKilograms + " кг.");
        //Задача 7
        byte needToReset = 7;
        float loseWeight250Grams = needToReset / 0.250f;
        double loseWeight500Grams = needToReset / 0.5;
        System.out.println("Задача 7");
        System.out.println("Если худеть на 250 грамм в день, то можно похудеть за " + loseWeight250Grams + " дней");
        System.out.println("Если худеть на 500 грамм в день, то можно похудеть за " + loseWeight500Grams + " дней");
        //Задача 8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int christinaSalary = 76230;
        double newMashaSalary = mashaSalary + (mashaSalary * 0.10);
        double newDenisSalary = denisSalary + (denisSalary * 0.10);
        double newChristinaSalary = christinaSalary + (christinaSalary * 0.10);
        double annualDifferenceMasha = (newMashaSalary * 12) - (mashaSalary * 12);
        double annualDifferenceDenis = (newDenisSalary * 12) - (denisSalary * 12);
        double annualDifferenceChristina = (newChristinaSalary * 12) - (christinaSalary * 12);
        System.out.println("Задача 8");
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + annualDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + annualDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newChristinaSalary + " рублей. Годовой доход вырос на " + annualDifferenceChristina + " рублей");




    }
}