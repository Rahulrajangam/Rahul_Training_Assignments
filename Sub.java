import java.util.*;

public class Sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the substring: ");
        String subString = sc.nextLine();
        int count = 0;
        while(str.contains(subString)) {
            str = str.replaceFirst(subString, "");
            count++;
        }
        System.out.println("Number of occurrences of substring: " + count);
        sc.close();
    }
}
