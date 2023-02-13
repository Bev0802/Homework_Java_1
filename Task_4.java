//import java.io.PrintStream;

//import javax.naming.spi.DirStateFactory.Result;

//*+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
//Предложить хотя бы одно решение или сообщить, что его нет.
public class Task_4 {
    // private static PrintStream printf;

    public static void main(String[] args) {
        int a = 20, b = 5, x = 0, y = 0, sum = 69;

        for (int ax = 0; ax < 10; ax++) {
            for (int ay = 0; ay <= 90; ay = ay + 10) {
                if (((a + ax) + (ay + b)) == sum) {
                    x = a + ax;
                    y = ay + b;
                    System.out.format("%d + %d = %d\n", x, y, sum);
                }

            }

        }
    }
}
