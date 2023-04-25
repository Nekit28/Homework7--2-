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

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i = i + 1;
            total = total + salary;
            System.out.println("месяц" + i + "сумма накоплений равна" + total);
        }
        System.out.println(total);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(" " + a + " ");
        }
        System.out.println();
        int b = 11;
        for (; b > 1; ) {
            b = b - 1;
            System.out.print(" " + b + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int dif = birthRate - mortality;
        for (int i = 1; i <= 10; i = i + 1) {
            population += population * dif / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println(population);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            month = month + 1;
            total = total + salary / 7;
            System.out.println("месяц " + month + " сумма накоплений равна " + total);
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            month = month + 1;
            total = total + salary / 7;
            if (month % 6 == 0) {
                System.out.println("месяц " + month + " сумма накоплений равна " + total);
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int salary = 15000;
        int total = 0;
        for (int i = 0; i <= 108; i = i + 1) {
            total = total + total / 93;
            total = total + salary;
            if (i % 6 ==0) {
                System.out.println("месяц " + i + " сумма накоплений равна " + total);
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 5;
        while (friday < 31) {
            friday = friday + 1;
            if (friday % 7 == 0) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int year = 2023;
        int oldYear = year - 200;
        int futureYear = year + 100;
        int cometYear = 0;
        while (cometYear <= futureYear) {
            cometYear = 79 * ((cometYear / 79) + 1);
            if (cometYear >= oldYear && cometYear <=futureYear) {
                System.out.println(cometYear);
            }
        }
    }
}







