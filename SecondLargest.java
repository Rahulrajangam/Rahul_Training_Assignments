package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the element"+(i+1));
			arr[i] = scan.nextInt();
		}
		int max = -1, max1 = -1;
		for(int i = 0; i < n; i++)
		{
			if( arr[i] > max1)
			{
				max = max1;
				max1 = arr[i];
				
			}
			else if( arr[i] < max1 && arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Second largest element in array"+max);
	
	
	}
}
