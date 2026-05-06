package rs.milan.karajovic._26_H;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// _26) Print duplicate characters in a string?

public class Java8Code
{
    public static void main(String[] args)
    {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        Set<String> uniqueChars = new HashSet<>();

        Set<String> duplicateChars =
                Arrays.stream(inputString.split(""))
                        .filter(ch -> ! uniqueChars.add(ch))
                        .collect(Collectors.toSet());

        System.out.println(duplicateChars);
    }
}
