import java.util.ArrayList;
import java.util.Scanner;

/* 메모리공간을 동적으로 사용하여 데이터 관리하기 */
public class practice8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 정수의 개수를 입력하세요 : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print("정수를 입력하세요 : ");
            list.add(sc.nextInt());
        }

        int sum=0;

        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }

        System.out.println("총합은 : " + sum);
        System.out.printf("평균은 : %.2f" , (float)sum/num);
        list.clear();
    }
}
