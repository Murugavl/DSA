package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Insertion_Sort 
{
    public static void main(String[] args) 
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
        System.out.println("Array Elements are: "+Arrays.toString(arr));
        for(int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted Array elements are: "+Arrays.toString(arr));
    }
}
