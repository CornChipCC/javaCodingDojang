import java.util.Scanner;

/* 리스트 회전 */
public class practice34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rule = sc.nextInt();
        String str = sc.nextLine();
        
        String[] strList = str.split(" ");
        String[] tempList = new String[strList.length-1];

        String[] answerList = new String[strList.length-1];
        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = strList[i+1];
        }

        if(rule >0){
            for (int i = 0; i < tempList.length; i++) {
                int realIndex = (tempList.length - rule + i) % tempList.length;
                System.out.print(tempList[realIndex] + " ");
            }
        }
        else{
            rule *= -1;
            for (int i = 0; i < tempList.length; i++) {
                int realIndex = (i + rule) % tempList.length;
                System.out.print(tempList[realIndex] + " ");
            }
        }
    }
}
