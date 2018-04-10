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
public class Array1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int n;
        boolean check = false;
        s = sc.nextLine();
        n = sc.nextInt();
        String arr[] = s.split(", ");
        int[] Arr = new int[arr.length];
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = Integer.parseInt(arr[i]);
            if (Arr[i] == n)
            {
                check = true;
                break;
            }
        }
        if (check == true) System.out.print("TRUE");
        else System.out.print("FALSE");
    }
}
