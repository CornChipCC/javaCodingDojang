import java.util.ArrayList;
import java.util.Scanner;
/* Happy Number */
public class practice60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int rule = sc.nextInt();

        for (int i = 0; i < rule; i++) {
            list.add(sc.nextInt());
        }

        for (Integer input : list) {
            
            int sum = input;
            while(true){
                if(sum >= 100){
                    sum = (int) (Math.pow(sum/100, 2) + Math.pow(sum/10%10, 2) + Math.pow(sum%10, 2));
                }
                else if(sum >=10){
                    sum = (int) (Math.pow(sum/10, 2) + Math.pow(sum%10, 2));
                }
                else{
                    sum = (int) Math.pow(sum, 2);
                }
                if(sum == input){
                    System.out.println(input + " is an Unhappy number");
                    break;
                }
                if(sum == 1){
                    System.out.println(input + " is a Happy number");
                    break;
                }
            }
        }


    }
}
