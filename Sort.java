import java.util.*;
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println("Sorted string:");
        System.out.println(new String(charArray));
    }
}
