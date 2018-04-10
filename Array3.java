/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayandstring;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Array3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        String[] arr1 = s1.split(", ");
        String[] arr2 = s2.split(", ");
        int[] Arr1 = new int[arr1.length];
        int[] Arr2 = new int[arr2.length];
        boolean[] check = new boolean[10000];
        Arrays.fill(check, false);
        for (int i = 0; i < arr1.length; i++)
        {
            Arr1[i] = Integer.parseInt(arr1[i]);
            check[Arr1[i]] = true;
        }
        for (int i = 0; i < arr2.length; i++)
        {
            Arr2[i] = Integer.parseInt(arr2[i]);
            if (check[Arr2[i]] == true)
            {
                System.out.print(Arr2[i]+" ");
            }
        }
    }
}
