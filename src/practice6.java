import java.util.ArrayList;
import java.util.Scanner;

/* 피보나치 수열 */

public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int input = sc.nextInt();

        Fibonacci(input);
    }

    public static int Fibonacci(int n) {

        int[] x = {0,1};
        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(0);
        y.add(1);
    

        if(n < 1){
            System.out.println(0);
        }
        else{
            System.out.println(0);
            System.out.println(1);
            for (int i = 2; i < 1000000; i++) {    
                y.add(y.get(i-2) + y.get(i-1));
        
                if(y.get(i).intValue()>n){
                    break;
                }
                System.out.println(y.get(i));
            }
        }
        return 0;
        
    }
}
