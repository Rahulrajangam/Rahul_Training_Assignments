package Array;
import java.util.*;
public class Frequency {

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
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i : arr)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		System.out.println(map);
	}

}
