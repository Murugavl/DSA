package Array;

import java.util.*;
public class Right_Rotation_with_K_postion
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");    
        int n = sc.nextInt();
        System.out.println("Enter the array elements ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.err.println("Array Elements are " + Arrays.toString(arr));
        System.err.println("Enter the number of position to right roatate: ");
        int k = sc.nextInt();
        k = k % n;
        if(k == 0)
        {
            System.err.println("No need for Rotation");
        }
        int[] temp = new int[k];        
        for(int i = 0; i < k; i++) 
        {
            temp[i] = arr[n - k + i];  
        }

        for(int i = n - 1; i >= k; i--) 
        {
            arr[i] = arr[i - k];  
        }

        for(int i = 0; i < k; i++) 
        {
            arr[i] = temp[i]; 
        }        
        System.err.println("After Right Rotation " + Arrays.toString(arr));
    }
}
