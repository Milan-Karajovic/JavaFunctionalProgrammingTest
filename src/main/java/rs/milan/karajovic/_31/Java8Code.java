package rs.milan.karajovic._31;

import java.util.Arrays;
import java.util.List;

// _31) How do you get last element of an array?

public class Java8Code
{
    public static void main(String[] args)
    {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        String lastElement = listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();

        System.out.println(lastElement);
    }
}
