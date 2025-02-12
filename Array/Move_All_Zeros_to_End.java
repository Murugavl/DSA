package Array;

import java.util.Arrays;
import java.util.Scanner;
public class Move_All_Zeros_to_End
{
    public static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: " + Arrays.toString(arr));
        int count = 0;
        for(int i = 0; i < n; i++)   
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp; 
                count++;
            }

        }
        System.out.println("After Moving Zero "+Arrays.toString(arr));
    }
    
}
