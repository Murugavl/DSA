package Array;
import java.util.*;
public class Largest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" array elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: "+ Arrays.toString(arr));
        int max = arr[0];
        for(int i = 0; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum Element is " + max);
    }
}
