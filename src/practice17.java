/* 100까지의 자연수의 합의 제곱과 제곱의 합의 차이 */
public class practice17 {   
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i < 101; i++) {
            sum1 += i;
            sum2 += i * i;
        }
        sum1 = sum1 * sum1;

        System.out.println(sum1 - sum2);
    }
}
