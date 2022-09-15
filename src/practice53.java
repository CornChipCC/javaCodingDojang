import java.math.BigInteger;
import java.util.Scanner;

/* 뒤쪽 0의 갯수 구하기 */
public class practice53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger input = sc.nextBigInteger();
        BigInteger fac = new BigInteger("1");
        int count = 0;
        for (BigInteger i = BigInteger.ONE; i.compareTo(input) <= 0; i= i.add(BigInteger.ONE)) {
            fac= fac.multiply(i);
            
        }

        while((fac.remainder(BigInteger.TEN)).compareTo(BigInteger.ZERO) == 0){
            count++;
            fac = fac.divide(BigInteger.TEN);
        }

        System.out.println(count);
    }
}
