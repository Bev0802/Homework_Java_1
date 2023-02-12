import java.util.ArrayList;
import java.util.List;

//Вывести все простые числа от 1 до 1000
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> listPrimeNum = new ArrayList<Integer>();
        int i= 2;
        int count = 0;
        for (int n = 2; n <= 50; n++) {
            count = 0;
            while (i<n){
                if (n%i==0){
                    count++;
                }
            }
            if (count==0){listPrimeNum.add(n);}
            }
    
        for (Integer j : listPrimeNum)
            System.out.printf("%s ", j);
    }
}
