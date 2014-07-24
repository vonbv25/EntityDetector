package MyExperimentToBedeleted;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by OJT4 on 7/9/2014.
 */
public class Test2 {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE,-1);
        String prev_date = new SimpleDateFormat("MMMM d, yyyy").format(cal.getTime());
        System.out.println(prev_date); // Sat Jan 02 00:00:00 BOT 2010
    }
}
