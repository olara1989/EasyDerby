/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyderby;

import easyderby.view.Principal;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Omar
 */
public class EasyDerby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "NO SE PUEDE CARGAR LA INTERFAZ" + e.getMessage(), "S.Te.Ve.", JOptionPane.ERROR_MESSAGE);
                }

                try {
                   Principal p = new Principal();
                   p.setVisible(true);
        
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "NO SE PUEDE CARGAR LA INTERFAZ" + e.getMessage(), "S.Te.Ve.", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
}
