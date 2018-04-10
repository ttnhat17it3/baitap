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
class QuickSort
{
    void Sort(int a[], int l, int r)
    {
        int i = l, j = r, key = a[(l+r)/2];
        int temp;
        while (i <= j)
        {
            while (a[i] < key) i++;
            while (a[j] > key) j--;
            if (i <= j)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }       
        if (l < j) Sort(a, l, j);
        if (i < r) Sort(a, i, r);
    }
}

public class Array5 
{
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String[] arr = s.split(", ");
        int[] Arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) Arr[i] = Integer.parseInt(arr[i]);
        QuickSort QS = new QuickSort();
        QS.Sort(Arr, 0, Arr.length-1);
        for (int i = 0; i < Arr.length; i++) System.out.print(Arr[i]+" ");
    }
}
