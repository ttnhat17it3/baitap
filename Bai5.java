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
public class Bai5 extends Applet 
{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int n;
    int a[][], b[][], c[][];
    Graphics g;
    public void init() 
    {
        int n;
        String inp = JOptionPane.showInputDialog("Nhập N:");
        n = Integer.parseInt(inp);
        /*a = new int[n][n];       
        b = new int[n][n];
        c = new int[n][n];*/
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                inp = JOptionPane.showInputDialog("Nhập phần tử cho mảng A["+i+"]["+j+"]:");
                a[i][j] = Integer.parseInt(inp);
            }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                inp = JOptionPane.showInputDialog("Nhập phần tử cho mảng B["+i+"]["+j+"]:");
                b[i][j] = Integer.parseInt(inp);
            }
    }
    
    void plus()
    {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
    }
    
    void minus()
    {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                c[i][j] = a[i][j] - b[i][j];
            }
    }
    
    void multi()
    {
        int s;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                s = 0;
                for (int k = 0; k < n; k++) s += a[i][k] + b[k][j];
                c[i][j] = s;
            }
    }
    
    void transpose()
    {
        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
    }
    
    
    public void paint(Graphics g)
    {
        plus();
        int width = 10, height = 15;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                g.drawString(String.valueOf(c[i][j]), width, height);
                width += 10;
            }
            height += 10;
            width = 10;
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}
