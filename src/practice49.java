/* Largest prime factor */
public class practice49 {
    public static void main(String[] args) {
        Long input = 600851475143L;
        int max = 0;
        for (int i = 1; i <= input; i++) {
            if(input % i ==0 && i> max ){
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if(i%j == 0) count++;
                }
                if(count ==2) {
                    max = i;
                    input /= max;
                }
                
                System.out.println(max);
            }
        }

        System.out.println(max);
    }
}
