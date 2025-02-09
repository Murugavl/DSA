import java.util.*;
class solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		if(n < 2) {
			System.out.println("Second largest element does not exist");
		}
		int[] arr = new int[n];
		System.out.println("Enter "+ n +" elements: ");
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int max = Integer.MIN_VALUE;
		int s_max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++)
		{
			if (arr[i] > max)
			{
				s_max = max;
				max = arr[i];
			}
			else if(arr[i] > s_max && arr[i] != max)
			{
				s_max = arr[i];
			}
		}
		System.out.println("The Second Largest element is " + s_max);
	}

}
