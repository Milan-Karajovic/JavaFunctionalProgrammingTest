package rs.milan.karajovic._23_H;

import java.util.stream.IntStream;

// _23) Palindrome program using Java 8 streams

public class Java8Code
{
    public static void main(String[] args)
    {
        String str = "ROTATOR";

        boolean isItPalindrome = IntStream.range(0, str.length()/2).
                noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i -1));

        if (isItPalindrome)
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }
    }
}
