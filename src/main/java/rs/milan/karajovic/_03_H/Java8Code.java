package rs.milan.karajovic._03_H;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// _03) How do you find frequency of each character in a string using Java 8 streams?

public class Java8Code
{
    public static void main(String[] args)
    {
        String inputString = "Java Concept Of The Day";

        Map<Character, Long> charCountMap =
                inputString.chars()
                        // Stream<Character>
                        .mapToObj(c -> (char) c)
                            // output of the groupingBy() is going to be a Map<K,V>
                            // groupingBy(Function.identity()) - groups the stream elements by themselves (so each unique character becomes a key).
                            // Collectors.counting()           - counts how many times each character appears.
                            // The result is a:                - Map<Character, Long> where each character maps to its frequency.
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCountMap);
    }
}
