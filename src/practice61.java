/* 소수의 개수 구해보기 */
public class practice61 {
    public static void main(String[] args) {
        int answer = sosu(2, 1000);

        System.out.println(answer);
    }
    public static int sosu(int i, int j) {
        int total = 0;
        for (; i <= j; i++) {
            int count = 0;
            for (int k = 1; k <= i; k++) {
                if(i % k == 0)  count++;
            }
            if(count==2){
                total++;
            }
        }

        return total;
    }
}
