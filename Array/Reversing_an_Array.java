package Array;

import java.util.*;

public class Reversing_an_Array
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
        int left = 0;
        int right = n - 1;
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println("Reversed Array is:" + Arrays.toString(arr));
    }    
}
