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
public class String9 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s, s1, s2;
        s = sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        String st = s.replaceAll(s1, s2);
        System.out.print(st);
    }
}
