//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
//(произведение чисел от 1 до n)

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) 
    {
        //получение данных
        System.out.printf("Введите n: ");
        Scanner sc = new Scanner(System.in, "cp866");
        String x = sc.nextLine();
        int n = Integer.parseInt(x);
        sc.close();

        //сумма треугольного числа
        int summa = n*(n+1)/2;
        System.out.printf("Cумма треугольного числа: %s\n", summa);

        //поизведение чисел(факториал)
        int factorial = 1;
        for (int i = 2; i <= n; i++) {factorial*=i;}
        System.out.printf("Факториал числа %s равен: %s\n", n, factorial);
    }
}
