package rs.milan.karajovic._04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// _04) How do you find frequency of each element in an array or a list?

public class Java8Code
{
    public static void main(String[] args)
    {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> frequency =stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequency);
    }
}
