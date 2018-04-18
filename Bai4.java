/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Bai4 extends Applet 
{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int n, check, cout;
    Panel p = new Panel();
    Label lbcheck = new Label("Nhap mot so: ");
    TextField tfcheck = new TextField();
    Button ok = new Button("OK");
    
    public void init() 
    {
        Random r = new Random();
        n = r.nextInt(10);
        cout = 0;
        
        while (true)
        {
            String inp = JOptionPane.showInputDialog("Nhap mot so:");
            int check = Integer.parseInt(inp);
            
            if (check < n)
            {
                JOptionPane.showMessageDialog(this, "Bạn cần nhập số lớn hơn", "", JOptionPane.WARNING_MESSAGE);
                cout++;
            }
            else if (check > n)
            {
                JOptionPane.showInternalMessageDialog(this, "Bạn cần nhập số bé hơn", "", JOptionPane.WARNING_MESSAGE);
                cout++;
            }
                else
                {
                    JOptionPane.showMessageDialog(this, "Congratulation!", "", JOptionPane.DEFAULT_OPTION);
                    cout = 0;
                    break;
                }
            if (cout == 3)
            {
                JOptionPane.showMessageDialog(this, "You lost!", "Oops!", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }           
        this.destroy();
    }
    
    public void paint(Graphics g)
    {
          
    } 
    // TODO overwrite start(), stop() and destroy() methods
}
