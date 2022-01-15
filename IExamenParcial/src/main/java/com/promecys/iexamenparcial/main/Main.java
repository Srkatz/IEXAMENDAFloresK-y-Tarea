
package com.promecys.iexamenparcial.main;

import com.promecys.iexamenparcial.views.MainForm;


public class Main {
    
    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

}
