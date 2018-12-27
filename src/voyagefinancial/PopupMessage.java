/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyagefinancial;

import javax.swing.JOptionPane;

/**
 *
 * @author TannerLuke
 */
public class PopupMessage {
    public static void popupMessage(String title, String message) {
        
        String mes = "Make sure a number is typed in the '" + message + "' field";
        
        JOptionPane.showMessageDialog(null, mes, title, JOptionPane.INFORMATION_MESSAGE);
        
    }
}
