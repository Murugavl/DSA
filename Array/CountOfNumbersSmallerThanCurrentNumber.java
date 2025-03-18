package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfNumbersSmallerThanCurrentNumber 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
        {
            int count = 0;
            for(int j : arr)
            {
                if(arr[i] > j)
                {
                    count++;
                }
            }
            res[i] = count;
        }
        System.out.println(Arrays.toString(res));
    }   
}
