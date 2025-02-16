public class Main {
    public static void main(String[] args) {

        System.out.println("Task # 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task # 2");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Task # 3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Task # 4");

        for (int i = -10; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task # 5");

        for (int leapYear = 1904; leapYear <= 2096; leapYear = leapYear + 4) {
            System.out.println(leapYear + " год является високосным");
        }

        System.out.println("Task # 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Task # 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Task # 8");

        int savings = 29000;
        int piggyBank = 0;
        for (int i = 1; i <= 12; i++) {
            piggyBank = piggyBank + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + piggyBank + " рублей");
        }
        System.out.println("Сумма годовых накоплений составит " + piggyBank + " рублей");

        System.out.println("Task # 9");

        int investment = 0;
        for (int i = 1; i <= 12; i++) {
            investment = investment + investment / 100;
            investment = investment + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + investment + " рублей");
        }

        System.out.println("Task # 10");

        int multiplicand = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplicand + "*" + i + "=" + multiplicand * i);
        }
    }
}

