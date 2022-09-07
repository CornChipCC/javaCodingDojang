import java.util.ArrayList;
/* Even Fibonacci numbers */
public class practice16 {
    public static void main(String[] args) {
        Fibonacci();
    }    


    public static void Fibonacci() {

        ArrayList<Integer> y = new ArrayList<Integer>();
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        y.add(1);
        y.add(2);
    
        for (int i = 2; i < 1000000; i++) {
            if(y.get(i-2) + y.get(i-1) < 4000000){    
                y.add(y.get(i-2) + y.get(i-1));
            }
            else{
                break;
            }
            if(y.get(i).intValue() % 2 == 0){
                answerList.add(y.get(i));
            }
        }
        int sum = 0;

        for (Integer integer : answerList) {
            sum += integer;
        }
        System.out.println(sum+2);
    }
}
