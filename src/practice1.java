/* Multiples of 3 and 5 */

public class practice1 {
    public static void main(String[] args) {
        int answer = totalSum(1000);

        System.out.println(answer);
    }
    public static int totalSum(int num) {
        
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }

        return sum;
    }
}
