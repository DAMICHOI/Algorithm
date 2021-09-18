package dami.Boj.Type.T2_구현;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class B10699_오늘_날짜 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date day = new Date();
        format.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.println(format.format(day));
    }
}
