package rs.milan.karajovic._01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import static java.lang.System.*;

//  _01) Given a list of integers, separate odd and even numbers?

public class Java8Code
{
    public static void main(String[] args)
    {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87, 18);

        Map<Boolean, List<Integer>> oddEvenNumbers = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));

        Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbers.entrySet();

        for(Entry<Boolean, List<Integer>> entry : entrySet) {
            out.println("-----------------------------------------------");
            if(entry.getKey()) {
                out.println("Even Numbers");
            } else {
                out.println("Odd Numbers");
            }
            out.println("-----------------------------------------------");

            List<Integer> list = entry.getValue();
            list.forEach(System.out::println);
        }

    }
}
