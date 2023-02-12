import java.util.ArrayList;
import java.util.List;

//Вывести все простые числа от 1 до 1000
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> listPrimeNum = new ArrayList<Integer>();
        int i = 2, count = 0;
        for (int n = 2; n <= 1000; n++) {
            count = 0;
            i = 2;
            while (i < n) {
                if (n % i == 0) count++;
                i++;
            }
            if (count == 0) listPrimeNum.add(n);
                    }
// печть списка
        for (Integer j : listPrimeNum)
            System.out.printf("%s ", j);        
    }
}