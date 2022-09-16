import java.util.Scanner;

/* 주식 투자 */
public class practice55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int day = sc.nextInt();

        int[] percent = new int[day];
        for (int i = 0; i < percent.length; i++) {
            percent[i] = sc.nextInt();
        }

        Double temp = money + 0.0;
        for (int i = 0; i < day; i++) {
            temp *= (100-percent[i]) / 100.0;
        }
        
        System.out.println(Math.round(temp - money));
        if(Math.round(temp - money) > 0){
            System.out.println("good");
        }
        else if(Math.round(temp - money) < 0 ){
            System.out.println("bad");
        }
        else{
            System.out.println("same");
        }
    }
}
