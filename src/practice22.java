import java.util.Scanner;
/* 이차방정식(근의 공식) */
public class practice22 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("\nb= ");
        int b = sc.nextInt();
        System.out.print("\nc= ");
        int c = sc.nextInt();

        if(b*b-4*a*c < 0)
        System.out.println("해가 없습니다.");
        else{

        int result1 = (int)(((-1)*b + Math.sqrt(b*b-4*a*c))/2/a);
        int result2 = (int)(((-1)*b - Math.sqrt(b*b-4*a*c))/2/a);

        if(result1 == 0 && result2 == 0)
            System.out.println("해는 " + result1 + "입니다.");
        else
            System.out.println("해는 " + result1 + "와" + result2 + "입니다.");
            }
    }
}
