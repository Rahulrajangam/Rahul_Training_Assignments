
import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character or substring to be replaced: ");
        String toReplace = sc.nextLine();
        System.out.print("Enter the replacement string: ");
        String replacement = sc.nextLine();
        System.out.println("Modified string:");
        String modifiedString = str.replace(toReplace, replacement);
        System.out.println(modifiedString);
    }
}
