import java.util.Scanner;

/* 3n+1 Problem */
public class practice36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 2개를 입력하세요.");

        int i = sc.nextInt();
        int j = sc.nextInt();

        int answer = cycle(i, j);

        System.out.println(i + " " + j + " " + answer);
    }

    public static int cycle(int i, int j) {
        int maxCycle = 0;
        for(int k = i; k <= j; k++){
            int count = 0;
            int temp = k;
            while(true){
                if(temp == 1) break;
                if(temp % 2 ==0){
                    temp /= 2;
                    count++;
                }
                else{
                    temp = 3 * temp +1;
                    count++;
                }
            }
            if(count > maxCycle) {
                maxCycle = count;
            }
        }

        return maxCycle+1;
    }
}
