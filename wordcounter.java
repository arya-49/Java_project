import java.util.Scanner;

public class wordcounter {
    public static void main(String[] args) {
        System.out.println("Welcome to my java word counter.");
        System.out.println("Enter your String to count the words : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Total number of words in your string is: " + count);
        sc.close();

    }

}
