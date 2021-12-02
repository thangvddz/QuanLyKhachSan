/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import com.microsoft.sqlserver.jdbc.StringUtils;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author you have to better
 */
public class xMoney {

    public static String doubleToVNDong(double money) {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        currencyVN.setCurrency(Currency.getInstance(localeVN));
        String formatVN = currencyVN.format(money);
        return formatVN;
    }

    public static double VNDongToDouble(String moneyy) {
        try {
            double num = Double.parseDouble(moneyy);
            return num;
        } catch (NumberFormatException e) {
            Locale localeVN = new Locale("vi", "VN");
            Currency cur = Currency.getInstance(localeVN);
            moneyy = moneyy.replace(cur.getSymbol(), StringUtils.EMPTY);
            NumberFormat numberFormat = NumberFormat.getInstance(localeVN);
            try {
                Number result = numberFormat.parse(moneyy);
                double res = result.doubleValue();
                return res;
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
        return 0;
    }
}
