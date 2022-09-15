import java.util.ArrayList;
import java.util.Scanner;

/* Josephus Problem */
public class practice46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peopleNum = sc.nextInt();
        int rule = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < peopleNum; i++) {
            list.add(i+1);
        }
        int ruleCount = 1;
        while(list.size() != 1){
            for (int i = 0; i < list.size(); i++) {
                
                if(ruleCount % rule == 0){
                    list.remove(i);
                    ruleCount++;
                }
                ruleCount++;
                if(i == list.size()) ruleCount--;
            }
        }

        for (Integer integer : list) {
            System.out.print(integer+ " ");
        }

    }
}
