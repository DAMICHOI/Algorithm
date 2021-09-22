package dami.Boj.Type.T2_구현;

import java.io.*;
import java.util.StringTokenizer;

public class B1924_2007년 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        bw.write(getDayOfTheWeek(month, day));
        bw.flush();
        bw.close();
    }

    public static String getDayOfTheWeek(int month, int day) {
        String dayOfTheWeek = "";

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        for (int i=1; i<=12; i++) {
            if (i == month)
                break;
            count += days[i-1];
        }
        count += day;
        count %= 7;

        switch (count) {
            case 0 :
                dayOfTheWeek = "SUN";
                break;
            case 1 :
                dayOfTheWeek = "MON";
                break;
            case 2 :
                dayOfTheWeek = "TUE";
                break;
            case 3 :
                dayOfTheWeek = "WED";
                break;
            case 4 :
                dayOfTheWeek = "THU";
                break;
            case 5 :
                dayOfTheWeek = "FRI";
                break;
            case 6 :
                dayOfTheWeek = "SAT";
                break;
        }

        return dayOfTheWeek;
    }
}
