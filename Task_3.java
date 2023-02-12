
//Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / 
//Введите число 2 2 + 2 = 4
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) 
    {
        // Получение данных от пользователя
        System.out.printf("Введите первое число: ");
        Scanner scx = new Scanner(System.in);
        int x = scx.nextInt();

        System.out.printf("Введите операцию +, -, *, /: ");
        Scanner sc = new Scanner(System.in, "cp866");
        String sign = sc.nextLine();
        
        System.out.printf("Введите второе число: ");
        Scanner scy = new Scanner(System.in);
        int y = scx.nextInt();

        scy.close();
        scx.close();
        sc.close();

        int result = 0;
        double res, xd, yd = 0.01;

        if ((sign.equals("/"))) {
            res = (double) result;
            xd = (double) x;
            yd = (double) y;
            res = xd / yd;
            System.out.printf("%s %s %s = %s", xd, sign, yd, res);
        } 
        else {
            switch (sign) {
                case "+":
                result = x + y;
                System.out.printf("%s %s %s = %s", x, sign, y, result);
                    break;
                case "-":
                result = x - y;
                System.out.printf("%s %s %s = %s", x, sign, y, result);
                    break;
                case "*":
                result = x * y;
                System.out.printf("%s %s %s = %s", x, sign, y, result);
                    break;
            }
        }
    }
}
