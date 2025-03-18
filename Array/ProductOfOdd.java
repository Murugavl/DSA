package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfOdd 
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

        int[] odd = new int[n];
        int oddProduct = 1;
        int oddCount = 0;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] % 2 != 0)
            {
                odd[oddCount++] = arr[i];
                oddProduct *= arr[i];
            }
        }


        if(oddCount > 0)
        {
            System.out.print("Odd numbers:");
            for(int i = 0; i < oddCount; i++)
            {
                System.out.print(odd[i]+ " ");
            }
            System.out.println();
            System.out.println("Product of odd numbers: " + oddProduct);
        }
    }    
}
