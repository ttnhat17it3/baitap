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
public class Bai3 extends Applet 
{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int a, b;
    public void init() 
    {
        String inpa, inpb;
        inpa = JOptionPane.showInputDialog("Nhập số thứ nhất:");
        inpb = JOptionPane.showInputDialog("Nhập số thứ hai:");
        a = Integer.parseInt(inpa);
        b = Integer.parseInt(inpb);
    }

    public void paint(Graphics g)
    {
        g.drawString(a + "+" + b +"="+a+b, 10, 10);
        g.drawString(a + "-" + b +"="+(a-b), 10, 30);
        g.drawString(a + "*" + b +"="+a*b, 10, 50);
        g.drawString(a + "/" + b +"="+a/b, 10, 70);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
