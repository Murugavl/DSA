package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Right_Rotation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");    
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are "+ Arrays.toString(arr));
        int temp = arr[n - 1];
        for(int i = n - 1; i > 0; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println("After left rotation: " + Arrays.toString(arr));
    }
}
