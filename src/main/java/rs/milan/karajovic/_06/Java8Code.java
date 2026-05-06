package rs.milan.karajovic._06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// _06) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?

public class Java8Code
{
    public static void main(String[] args)
    {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));

        System.out.println(joinedString);
    }
}
