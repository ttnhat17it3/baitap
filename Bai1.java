/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Bai1 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String result = "";
    public void init() 
    {
        int n;
        String inp;
        inp = JOptionPane.showInputDialog("Nhập N:");
        n = Integer.parseInt(inp);
        for (int i = 1; i <= n; i++) result += i + " ";
    }
    
    public void paint(Graphics g)
    {
        g.drawString(result, 10, 10);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
