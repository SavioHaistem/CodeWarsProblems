import Katas.ArrayDiff;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,3};
        int[] b = {2,2};
        Arrays.stream(ArrayDiff.arrayDiff(a, b)).forEach(System.out::print);
    }
}