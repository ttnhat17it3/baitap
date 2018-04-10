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
public class Array4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int sum = 0;
        s = sc.nextLine();
        String[] arr = s.split(", ");
        int[] Arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            Arr[i] = Integer.parseInt(arr[i]);
            sum += Arr[i];
        }
        System.out.print(sum);
    }
}
