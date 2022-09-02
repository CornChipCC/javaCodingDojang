import java.util.ArrayList;
import java.util.Arrays;

/* 사이냅소프트 면접문제 */
/* 문자열 관련 */
public class practice4 {
    public static void main(String[] args) {
        String str = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
        String[] test = str.split(",");
        ArrayList<String> name_list = new ArrayList<String>();

        int quesCount1 = 0;
        int quesCount2 = 0;
        // int quesCount1 = 0;
        // int quesCount1 = 0;

        for (int i = 0; i < test.length; i++) {
            char temp = test[i].charAt(0);

            // 문제 1
            if(temp == '김' || temp == '이'){
                quesCount1++;
            }

            // 문제 2
            if(test[i].equals("이재영")){
                quesCount2++;
            }
            //문제 3
            if(!name_list.contains(test[i]))
                name_list.add(test[i]);
        }

       


        System.out.println("문제 1 : " + quesCount1);
        System.out.println("문제 2 : " + quesCount2);
         //문제 3
         String[] name_arr = name_list.toArray(new String[name_list.size()]);
         System.out.println("문제 3 : ");
         for(int i = 0; i < name_arr.length; i++){
             System.out.print(name_arr[i] + ((name_arr.length == i + 1)?"\n":", "));
         }
 
         //문제 4
         Arrays.sort(name_arr);
         System.out.println("문제 4 : ");
         for(int i = 0; i < name_arr.length; i++)
             System.out.print(name_arr[i] + ((name_arr.length == i + 1)?"\n":", "));
    }
}
