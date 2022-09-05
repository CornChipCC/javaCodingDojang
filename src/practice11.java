import java.util.Scanner;

/* 버전 비교 */
public class practice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("버전 2가지를 입력하세요. (공백으로 구분)");
        String direct = ">";

        String input1 = sc.next();
        String input2 = sc.next();

        String[] input1Array = input1.split("\\.");
        String[] input2Array = input2.split("\\.");

        int min = input1Array.length;
        if(input2Array.length < input1Array.length){
            min = input2Array.length;
        }


        for (int i = 0; i < min; i++) {
            int input1Int = Integer.parseInt(input1Array[i]);
            int input2Int = Integer.parseInt(input2Array[i]);

            if(input1Int == input2Int){
                if(i == min-1){
                    if(input1Array.length > input2Array.length){
                        break;
                    }
                    else{
                        direct = "<";
                        break;
                    }
                }
                continue;
            }
            else{
                if(input1Int > input2Int){
                    break;
                }
                else{
                    direct = "<";
                    break;
                }
            }
        }

        System.out.println(input1 + " " + direct + " " + input2);
    }
}
