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
public class Bai2 extends Applet 
{
    int n;
    String inp, result = "";
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() 
    {
        inp = JOptionPane.showInputDialog("Nhập N:");
        n = Integer.parseInt(inp);
    }
    
    public void paint(Graphics g)
    {
        int width = 10, height = 15;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                g.drawString("*", width, height);
                width += 10;
            }
            height += 10;
            width = 10;
        }    
            
    }

    // TODO overwrite start(), stop() and destroy() methods
}
