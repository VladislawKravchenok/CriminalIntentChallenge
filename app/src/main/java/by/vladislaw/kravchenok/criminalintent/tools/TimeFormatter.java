package by.vladislaw.kravchenok.criminalintent.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Vladislaw Kravchenok on 02.07.2019.
 */
public class TimeFormatter {
    private static final String TIME_FORMAT = "hh:mm aaa";
    public static String format(Date date){
        DateFormat dateFormat = new SimpleDateFormat(TIME_FORMAT);
        return dateFormat.format(date);
    }
}
