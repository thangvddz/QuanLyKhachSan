/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author you have to better
 */
public class checkText {

    public static boolean issEmpty(String str) {
        if (str.trim().equals("")) {
            return true;
        }
        return false;
    }

    public static boolean CheckNumChar(String str, int limit) {
        if (!str.trim().equals("")) {
            if (str.length() > limit) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean issNum(String str) {
        if (!str.trim().equals("")) {
            try {
                double num = Double.parseDouble(str);
                int num2 = Integer.parseInt(str);
                return true;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean isHour(String str) {
        if (!str.trim().equals("")) {
            try {
                int num2 = Integer.parseInt(str);
                if (num2 > 23 || num2 < 0) {
                    return false;
                }
                return true;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean isMinute(String str) {
        if (!str.trim().equals("")) {
            try {
                int num2 = Integer.parseInt(str);
                if (num2 > 59 || num2 < 0) {
                    return false;
                }
                return true;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

    public static boolean isPhoneNumber(String phone) {
        String regexStr = "^[0-9]{10,15}$";
        if (phone.matches(regexStr)) {
            return true;
        } else {
            return false;
        }
    }
}
