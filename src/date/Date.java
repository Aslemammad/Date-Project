package date;

import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import sun.util.BuddhistCalendar;

public class Date {

    public static void main(String[] args) {

        DateTimeFormatter date = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        final Calendar cal = new GregorianCalendar();

        int d = cal.get(Calendar.DAY_OF_WEEK);//d = day

        if (d == 1) {
            System.out.print("Sunday");
        } else if (d == 2) {
            System.out.print("Monday");
        } else if (d == 3) {
            System.out.print("Tuesday");
        } else if (d == 4) {
            System.out.print("Wednesday");
        } else if (d == 5) {
            System.out.print("Thursday");
        } else if (d == 6) {
            System.out.print("Friday");
        } else if (d == 7) {
            System.out.print("Saturday");
        }
        month month = new month();
        month.sys_if();
        System.out.println(" ,clock: " + date.format(now));

    }

}
