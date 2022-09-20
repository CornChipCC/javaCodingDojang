/* 20세기에서 매월 1일이 일요일인 경우의 개수 */
public class practice72 {
    public static void main(String[] args) {
        int sunCount = 0;
        int index = 0;
        String[] week = {"월", "화", "수", "목", "금", "토", "일"};
        int[] month = {31, 28, 31, 30,31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1900; i < 2000; i++) {
            for (int j = 0; j < month.length; j++) {

                if(index % 7 == 6){
                    sunCount++;
                }
                index+=month[j];
                if(i % 4 == 0 && i % 100 != 0 && j == 1){
                    index++;
                }
                
            }
            
        }
        System.out.println(sunCount);
    }
}
