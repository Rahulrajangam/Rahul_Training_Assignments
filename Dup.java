
import java.util.Scanner;

public class Dup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        System.out.println("After removing duplicate characters in the given string:");
        for (int i = 0; i < charArray.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(charArray[i]);
            }
        }
    }
}
