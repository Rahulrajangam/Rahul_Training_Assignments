
import java.util.Scanner;

public class Freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter the character whose frequency is to be found: ");
        char c = sc.nextLine().charAt(0);
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        System.out.println("The frequency of '" + c + "' is: " + freq[c]);
    }
}
