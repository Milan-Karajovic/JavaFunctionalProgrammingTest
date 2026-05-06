package rs.milan.karajovic._27_H;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// _27) Find first repeated character in a string?

public class Java8Code
{
    public static void main(String[] args)
    {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        Map<String, Long> charCountMap =
                Arrays.stream(inputString.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String firstRepeatedChar = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

        System.out.println(firstRepeatedChar);
    }
}
