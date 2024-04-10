package Kyu6;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        int[] goodAmountsCounter = Arrays.stream(goodAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] evilAmountsCounter = Arrays.stream(evilAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();
        int battle = 0;
        for (int count = 0; count < evilAmountsCounter.length; count++) {
            switch (count) {
                case 3:
                    battle += goodAmountsCounter[0] * 3;
                    battle -= evilAmountsCounter[0] * 2;
                    break;
                case 4:
                    battle += goodAmountsCounter[count] * 4;
                    battle -= evilAmountsCounter[count] * 3;
                    break;
                case 5:
                    battle += goodAmountsCounter[count] * 10;
                    battle -= evilAmountsCounter[count] * 5;
                case 6:
                    battle -= evilAmountsCounter[count] * 10;
                    break;
                default:
                    battle += goodAmountsCounter[count];
                    battle -= evilAmountsCounter[count];
            }

        if (battle > 0) {
            return "Battle Result: Good triumphs over Evil";
        } else if (battle < 0) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }
}
