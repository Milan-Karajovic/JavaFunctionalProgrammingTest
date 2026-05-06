package rs.milan.karajovic._05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// _05) How do you sort the given list of decimals in reverse order?

public class Java8Code {

    public static void main(String[] args)
    {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

}
