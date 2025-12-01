package Array;

import java.util.*;

public class RemoveDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the element"+(i+1));
			arr[i] = scan.nextInt();
		}
		
		Set<Integer> set = new HashSet<>();
		for(int i : arr)
		{
			set.add(i);
		}
		System.out.println(set);
	}
}
