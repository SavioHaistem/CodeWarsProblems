package Kyu6;

import java.util.function.IntPredicate;
import java.util.Arrays;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        // KATA COMPLETE
        IntPredicate returnDiference = numA -> Arrays.stream(b).noneMatch(numB -> numB == numA);
        return Arrays.stream(a).filter(returnDiference).toArray();
    }
}
