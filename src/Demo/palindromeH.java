package Demo;

import java.util.Scanner;
public class palindromeH {
static boolean palindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a string: ");
        Scanner word = new Scanner(System.in);
        String str = word.nextLine();
        if (palindrome(str))
            System.out.print("The string is palindrome");
        else
            System.out.print("The string is not palindrome");
    }
}
