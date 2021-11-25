/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Utils.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author you have to better
 */
public class xTime {

    public static int[] hoursAndMinute(String time) {
        String[] arr = time.split(":");
        int[] hm = new int[2];
        for (int i = 0; i < 2; i++) {
            hm[i] = Integer.parseInt(arr[i]);
        }
        return hm;
    }
    
    public static Timestamp getTimeHol(Timestamp time, int hours, int minutes) {
        Date date = new Date(time.getTime());
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.setTime(date);
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
    
}
