package rs.milan.karajovic._14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// _14) Find second largest number in an integer array?

public class Java8Code
{
    public static void main(String[] args)
    {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer secondLargestNumber = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(secondLargestNumber);
    }
}
