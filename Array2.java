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
public class Array2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        s = sc.nextLine();        
        String arr[] = s.split(", ");
        int[] Arr = new int[arr.length];
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = Integer.parseInt(arr[i]);
            if (max < Arr[i]) max = Arr[i];
            if (min > Arr[i]) min = Arr[i];
        }
        System.out.print(min+" "+max);
    }
}
