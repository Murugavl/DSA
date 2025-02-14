package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search 
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
        
        Arrays.sort(arr);
        System.out.println("Array Elements: " + Arrays.toString(arr));
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();    

        int left = 0, right = n -1;
        boolean found = false;
        while(left <= right)
        {
            int mid = left + (left + right) / 2;

            if(arr[mid] == search)
            {
                System.out.println("Element found at : " + mid);
                found  = true;
                break;
            }

            else if( arr[mid] < search)
            {
                left = mid + 1;
            }

            else
            {
                right = mid - 1;
            }
        }

        if(!found)
        {
            System.out.println("Element not found.");
        }
    }
}
