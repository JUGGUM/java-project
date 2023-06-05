package practice;

import java.util.Arrays;
import java.util.Comparator;

class TriangleDemo {
    public int solution() {
        int[] sides = {1, 2, 3};
        Arrays.sort(sides);

        if (sides[2] <= sides[0] + sides[1]) {
            return 1;
        } else {
            return 2;
        }

    }
}