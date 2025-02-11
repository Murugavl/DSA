package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Left_Rotation 
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
        int temp = arr[0];
        for(int i = 1; i < n; i++)
        {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        System.out.println("After left rotation: " + Arrays.toString(arr));
    }
}