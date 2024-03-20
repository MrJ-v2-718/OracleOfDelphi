import java.time.LocalDateTime;

public class Clock {
    public static void main(String[] args) {
        LocalDateTime now;
        int nowSecond;
        int prevSecond = 0;
        for (; ; ) {
            now = LocalDateTime.now();
            nowSecond = now.getSecond();
            if (nowSecond != prevSecond) {
                System.out.println(now.getHour() + " : " +
                        now.getMinute() + " : " + nowSecond);
                prevSecond = nowSecond;
            }
        }
    }
}
