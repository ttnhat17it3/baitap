/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayandstring;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class String6 
{
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String st = s.replace("d", "f");
        System.out.print(st);
    }
}
