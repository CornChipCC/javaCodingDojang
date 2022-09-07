import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 어느 숫자가 중간값을 가지는 숫자일까? */
public class practice24 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());

        Collections.sort(list);

        System.out.println(list.get(1));
    }
}
