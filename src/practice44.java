import java.util.ArrayList;
import java.util.Scanner;

/* The Knights Of The Round Table */
public class practice44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> triangle = new ArrayList<>();

        triangle.add(sc.nextDouble());
        triangle.add(sc.nextDouble());
        triangle.add(sc.nextDouble());

        // 삼각형 각변의 합에서 2 나누기
        Double sumHalf = 0.0;
        for (int i = 0; i < triangle.size(); i++) {
            sumHalf += triangle.get(i);
        }
        sumHalf /= 2;

        // 삼각형 넓이 구하기
        Double triSize = sumHalf;
        for (int i = 0; i < triangle.size(); i++) {
            triSize *= sumHalf-triangle.get(i);
        }
        triSize = Math.sqrt(triSize);

        // 소숫점 3자리수까지 반올림
        System.out.println(Math.round((triSize/sumHalf) * 1000) / 1000.0);
    }
}
