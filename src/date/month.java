package date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class month {

    private final Calendar cal = new GregorianCalendar();
    private final int mo = cal.get(Calendar.MONTH) + 1;// mo = month

    public void sys_if() {
        switch (mo) {
            case 1:
                System.out.print(",January " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            case 2:
                System.out.print(",February " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            case 3:
                System.out.print(",March " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            case 4:
                System.out.print(",April " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            case 5:
                System.out.print(",May " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            case 6:
                System.out.print(",June " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            case 7:
                System.out.print(",July " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            case 8:
                System.out.print(",August " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            case 9:
                System.out.print(",September " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            case 10:
                System.out.print(",October " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            case 11:
                System.out.print(",November " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            case 12:
                System.out.print(",December " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
                case 13:
                System.out.print(",January " + cal.get(Calendar.DAY_OF_MONTH) + "," + cal.get(Calendar.YEAR));
                break;
            default:
                break;
        }
    }

}
