package Exercise.Exercise7;

import java.util.List;

public class Algorithm {

    public <T> int count(List<T> list, SomeSpecialNumber<T> s) {
        int count = 0;
        for (T type : list) {
            if (s.match(type)) {
                ++count;
            }
        }
        return count;
    }

    public static <T extends Comparable> T maximalElement (List<T> list, int from, int to) {
        T max = list.get(from);
        for (int i = from + 1; i < to; i++) {
            T elem1 = list.get(i);
            if (elem1.compareTo(max) > 0) {
                max = elem1;
            }
        }
        return max;
    }


}