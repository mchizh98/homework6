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
        task9();
        task10();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        for (int i = 0; i < 17 ; i+=2) {
            System.out.println(i);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным.");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task7 () {
        System.out.println("Задача7");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void task8 () {
        System.out.println("Задача8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task9 () {
        System.out.println("Задача9");
        int salary = 29000;
        double totalWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            totalWithPercent = (totalWithPercent + salary) * (1 + percent);
            System.out.println("Месяц " + i + " , сумма накоплений равна " + totalWithPercent + " рублей");
        }
    }
    public static void task10 () {
        System.out.println("Задача10");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(" 2* " + i + " = " + 2*i);
        }
    }
}

