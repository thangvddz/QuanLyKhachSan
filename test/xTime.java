/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Utils.*;

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
}
