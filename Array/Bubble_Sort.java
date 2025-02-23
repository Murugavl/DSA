package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are: "+ Arrays.toString(arr));
        System.out.println("Performing bubble Sort... ");
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i -1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array is: "+Arrays.toString(arr));
    }    
}
