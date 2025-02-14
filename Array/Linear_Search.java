package Array;

import java.util.*;

public class Linear_Search 
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");    
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array Elements: " + Arrays.toString(arr));
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        
        boolean found = false;
        
        for(int i = 0; i < n; i++)
        {
            if (arr[i] == search)
            {
                System.out.println("Element found at index: " + i);
                found = true;
            }
        }

        if (!found)
        {
            System.out.println(-1);
        }
    }
}
