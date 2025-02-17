public class Main {
    public static void main(String[] args) {

        System.out.println("Task # 1");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task # 2");

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task # 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task # 4");

        for (int i = -10; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task # 5");

        for (int leapYear = 1904; leapYear <= 2096; leapYear += 4) {
            System.out.println(leapYear + " год является високосным");
        }

        System.out.println("Task # 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task # 7");

        for (int i = 1; i <= 512; i *=  2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task # 8");

        int savings = 29000;
        int piggyBank = 0;
        for (int i = 1; i <= 12; i++) {
            piggyBank += savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + piggyBank + " рублей");
        }
        System.out.println("Сумма годовых накоплений составит " + piggyBank + " рублей");

        System.out.println("Task # 9");

        piggyBank = 0;
        double investment = 1D / 100;
        for (int month = 1; month <= 12; month++) {
            piggyBank += savings;
            piggyBank = (int) (piggyBank * (1 + investment));
            System.out.println("Месяц " + month + " сумма накоплений равна " + piggyBank + " рублей");
        }

        System.out.println("Task # 10");

        int multiplicand = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplicand + "*" + i + "=" + multiplicand * i);
        }
    }
}

