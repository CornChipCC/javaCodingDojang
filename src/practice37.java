import java.util.Scanner;

/* 아마존 면접문제(그 시간 사무실에 몇명이 있었나?) */
public class practice37 {
    String[] times={"09:12:23 11:14:35","10:34:01 13:23:40","10:34:31 11:20:10"};
    int cntMem=0;

    public int count(String time){
        cntMem=0;
        for(String t : times){
            int s=replaceTime(t.split(" ")[0]);
            int e=replaceTime(t.split(" ")[1]);
            int ti=replaceTime(time);
            if(s<=ti && e>=ti){
                cntMem++;
            }
        }
        return cntMem;

    }

    public int replaceTime(String time){
        return Integer.parseInt(time.replaceAll(":",""));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("시간을 입력하세요.(hh:mm:ss)");

        String inputTime = sc.nextLine();
        System.out.println("count Member is ..."+new practice37().count(inputTime));
    }
}
