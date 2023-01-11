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

        int sum = 0;
        int month = 0;

        while (sum < 2459000) {
            sum += 15000;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println();

        for (; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int population = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 0;

        while (year < 10) {
            year++;
            population += population / 1000 * (birthRate - deathRate);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        double sum = 15000;
        int month = 0;

        while (sum < 12000000) {
            sum += sum * 0.07;
            month++;
            System.out.printf("Месяц " + month + ", сумма накоплений равна " + "%.2f" + " рублей. \n", sum);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        double sum = 15000;
        int month = 0;

        while (sum < 12000000) {
            sum += sum * 0.07;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + ", сумма накоплений равна " + "%.2f" + " рублей. \n", sum);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        double sum = 15000;
        int month = 0;
        int numberOfMonth9Years = 9 * 12;

        while (month < numberOfMonth9Years) {
            sum += sum * 0.07;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + ", сумма накоплений равна " + "%.2f" + " рублей. \n", sum);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int friday = 5;

        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int startYear = 1823;
        int endYear = 2123;

        for (int i = 0; i < endYear; i += 79) {
            if (i > startYear) {
                System.out.println(i);
            }
        }
    }
}