import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        int x = 0;
        int n = 0;
        int res = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        if (sc.hasNextInt()) {
            x = sc.nextInt();
        } else {
            System.out.println("Ошибка, введите целое число");
        }

        System.out.println("Введите показатель: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n <= 15) {
            } else {
                System.out.println("Показатель не должен превышать 15: ");
            }
        } else {
            System.out.println("Это не число, введите число");
        }
        sc.close();

        while (n > 0) {
            res *= x;
            n -= 1;
        }
        System.out.println(res);
    }
}
