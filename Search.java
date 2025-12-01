package Array;

import java.util.*;

public class Search {
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
	System.out.println("Enter the element to be searched:");
	int i;
	int eleToSearch = scan.nextInt();
	
	System.out.println("Linear Search \n ===========================");
	for(i = 0; i < arr.length; i++)
	{
		if( arr[i] ==  eleToSearch) 
		{
			System.out.println("Element "+arr[i]+" found at position "+(i+1));
			break;
		}
	}
	System.out.println("*******************************************");
	System.out.println("Binary Search \n ===========================");
	Arrays.sort(arr);
	int right = n,left = 0;
	while(left <= right)
	{
		int mid = left + (right - left)/2;
		if(arr[mid] == eleToSearch)
		{
			System.out.println("Element "+arr[mid]+" found at position "+(mid+1));
			return;
		}
		else if( arr[mid] > eleToSearch)
		{
			right = mid - 1;
		}
		else 
		{
			left = mid + 1;
		}
	}
	System.out.println("element not found");
	}
}
