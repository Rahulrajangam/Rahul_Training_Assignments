import java.util.Scanner;

public class Words{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = (s.length()>0)? 1 : 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') count++;
        }
        System.out.println("The given string contains " + count + " word/s");
        sc.close();
    }
}