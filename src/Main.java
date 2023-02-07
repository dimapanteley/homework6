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


    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 1; i--) {
            System.out.println(" Итерация  цикла " + i);
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }


    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        for (int years = 1904; years < 2096; years = years + 4) {
            System.out.println(years + " год является високосным ");
        }


    }


    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void task8() {
        System.out.println("Задача 8");
        int meseo = 29000;
        int s = 0;
        for (int i = 1; i <= 12; i++) {
            s += meseo;
            System.out.println("Месяц " + i + " сумма накоплений равна " + s + " рублей ");
        }


        System.out.println("Задача 9");
        double sumMes = 0;
        double procent =0.01;
        for (int i = 1; i <= 12; i++) {
            sumMes=(sumMes+meseo) * (1 + procent);
            System.out.println(" Месяц "+ i + " сумма накоплений равна "+ sumMes + " рублей ");
        }
    }






    public static void task9() {
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}



