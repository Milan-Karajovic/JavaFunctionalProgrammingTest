package rs.milan.karajovic._18_H;

import java.util.Arrays;
import java.util.stream.Collectors;

// _18) Reverse each word of a string using Java 8 streams?

public class Java8Code
{
    public static void main(String[] args)
    {
        String str = "Java Concept Of The Day";

        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversedStr);
    }
}
