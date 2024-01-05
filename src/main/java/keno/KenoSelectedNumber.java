package keno;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class KenoSelectedNumber {

    public static List<Integer> getRandomSelectedPlayLine() {
        List<Integer> randomList = new ArrayList<>();
        SecureRandom random = new SecureRandom();
        long seed = System.currentTimeMillis();
        random.setSeed(seed);
        for (int i = 1; i <= 20; i++) {
            int number = random.nextInt(80) + 1;
            if (!randomList.contains(number)) {
                randomList.add(number);
            } else
                i--;
            if (i % 3 == 2) {
                reseedSecureRandom(random);
            }
        }
        return randomList;
    }

    private static void reseedSecureRandom(SecureRandom random) {
        long newSeed = System.currentTimeMillis();
        random.setSeed(newSeed);
    }
}
