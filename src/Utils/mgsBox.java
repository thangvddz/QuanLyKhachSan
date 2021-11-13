/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author you have to better
 */
public class mgsBox {

    public static void alert(Component parents, String message) {
        JOptionPane.showMessageDialog(parents, message, "Hệ thống cầu tiêu thần kỳ", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(Component parents, String message) {
        int choose = JOptionPane.showConfirmDialog(parents, message, "Hệ thống cầu tiêu thần kỳ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return choose == JOptionPane.YES_OPTION;
    }

    public static String prompt(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message, "Hệ thống cầu tiêu thần kỳ", JOptionPane.INFORMATION_MESSAGE);
    }
}
