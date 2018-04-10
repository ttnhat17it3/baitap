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
public class String3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int a, b;
        s = sc.nextLine();
        a = sc.nextInt(); b = sc.nextInt();
        System.out.print(s.substring(a, b));
    }
}
