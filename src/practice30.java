import java.util.Scanner;

/* 숫자를 입력 받으면 그에 맞는 자릿수 출력 */
public class practice30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 하세요 : ");
        int input = sc.nextInt();
        int i = 1;

        while(true){
            if ( input / i == 0){
                System.out.println(i/10 + "의 자릿수");
                break;
            }
            else{
                i*=10;
            }
        }
    }
}
