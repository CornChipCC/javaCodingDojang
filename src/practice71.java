import java.math.BigInteger;
/* 2^1000의 각 자릿수의 합은? */
public class practice71 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("2").pow(1000);
        BigInteger i = BigInteger.TEN;
        BigInteger sum = BigInteger.ZERO;
        while(true){
            sum = sum.add(num.remainder(BigInteger.TEN));
            num = num.divide(BigInteger.TEN);
            if(num.compareTo(BigInteger.ZERO) == 0){
                break;
            }
        }
        System.out.println(sum);
    }
}
