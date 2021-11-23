/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import com.toedter.calendar.JDateChooser;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.swing.JTextField;

/**
 *
 * @author you have to better
 */
public class xTime {

    public static Timestamp getTimeStamp(JDateChooser jdc, int hours, int minutes) {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.setTime(jdc.getDate());
        int year = cal.get(Calendar.YEAR);
        int moth = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("year " + year + ", month: " + moth + ", day: " + day);
        LocalDate currentDate = LocalDate.of(year, moth, day);
        LocalTime currentTime = LocalTime.of(hours, minutes);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");
        currentTime.format(formatterTime);
        LocalDateTime fromDateAndTime = LocalDateTime.of(currentDate, currentTime);
        fromDateAndTime.format(formatter);
        Timestamp timestamp = Timestamp.valueOf(fromDateAndTime);
        return timestamp;
    }

    public static void getTimeFromDatabase(Timestamp t, JTextField hours, JTextField minutes) {
        LocalDateTime localDateTime = t.toLocalDateTime();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        hours.setText(String.valueOf(hour));
        minutes.setText(String.valueOf(minute));
    }

    public static void setTimeNow(JTextField hours, JTextField minutes) {
        LocalTime now = LocalTime.now();
        hours.setText(String.valueOf(now.getHour()));
        minutes.setText(String.valueOf(now.getMinute()));
    }
}
