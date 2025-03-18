package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfEven 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: " + Arrays.toString(arr));

        int[] even = new int[n];
        int evenSum = 0;
        int evenCount = 0;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] % 2 == 0)
            {
                even[evenCount++] = arr[i];
                evenSum += arr[i];
            }
        }

        if(evenCount > 0)
        {
            System.out.print("Even numbers:");
            for(int i = 0; i < evenCount; i++)
            {
                System.out.print(even[i]+ " ");
            }
            System.out.println();
            System.out.println("Sum of even numbers: " + evenSum);
        }
    }   
}
