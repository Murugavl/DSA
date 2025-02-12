package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Left_Rotation_with_K_positions 
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

        System.out.println("Array Elements: " + Arrays.toString(arr));

        System.out.println("Enter the number of positions to left rotate: ");
        int k = sc.nextInt();
        k = k % n; 

        if (k == 0 || k == n) {
            System.out.println("No rotation needed: " + Arrays.toString(arr));
            return;
        }

        int[] temp = new int[k];        
        for(int i = 0; i < k; i++) 
        {
            temp[i] = arr[i];  
        }

        for(int i = k; i < n; i++) 
        {
            arr[i - k] = arr[i];  
        }

        for(int i = 0; i < k; i++) 
        {
            arr[n - k + i] = temp[i]; 
        }        

        System.out.println("After Left Rotation: " + Arrays.toString(arr));
    }    
}
