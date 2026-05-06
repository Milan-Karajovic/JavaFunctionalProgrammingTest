package rs.milan.karajovic._21;

import java.util.stream.IntStream;

// _21) Print first 10 even numbers

public class Java8Code
{
    public static void main(String[] args)
    {
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
    }
}