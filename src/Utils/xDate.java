/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author you have to better
 */
public class xDate {

    static SimpleDateFormat formater = new SimpleDateFormat();

    // String s = "1-9-1970";
    // Date date = XDate.toDate(s, "dd-mm-yyyy");
    public static Date toDate(String date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    //Date now = new date();
    //String s = XDate.toString(now, "dd-MM-yyyy");
    public static String toString(Date date, String parttern) {
        DateFormat dateFormat = new SimpleDateFormat(parttern);
        return dateFormat.format(date);
    }

    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }

    /**
     * get time now
     *
     * @return string
     */
    public static String timeNow() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static boolean isDate(String date) {
        SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
        simple.setLenient(false);
        try {
            simple.parse(date.trim());
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static Time timeNow1() {
        Date now = new Date();
        System.out.println(now);

        // chuy???n Date sang Timestamp
        Time time = new Time(now.getTime());
        //System.out.println(time);
        return time;

    }
    static final SimpleDateFormat DATE_FORMATER = new SimpleDateFormat("dd/MM/yyyy");

//     l???y th???i gian hi???n t???i
    public static Date now() {
        return new Date();
    }
    
    public static String timeNow2() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

}
