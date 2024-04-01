import java.util.*;

public class reverce {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.println("Enter the Number ");
        int no = s.nextInt();
        int temp = no;
        int rev = 0;
        int rem;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.err.println(rev);

        if (no == rev) {
            System.err.println("this is the palindrome number");
        } else {
            System.err.println("this is not a palindrome number");
        }
    }

}
