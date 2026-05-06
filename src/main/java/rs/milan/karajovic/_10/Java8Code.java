package rs.milan.karajovic._10;

import java.util.Arrays;
import java.util.stream.IntStream;

// _10) How do you merge two unsorted arrays into single sorted array without duplicates?

public class Java8Code
{
    public static void main(String[] args)
    {
        int[] a = new int[] {4, 2, 5, 1};
        int[] b = new int[] {8, 1, 9, 5};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().toArray();

        System.out.println(Arrays.toString(c));
    }
}
