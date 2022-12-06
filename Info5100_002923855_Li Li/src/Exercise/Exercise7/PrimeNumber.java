package Exercise.Exercise7;

public class PrimeNumber implements SomeSpecialNumber<Integer> {

    @Override
    public boolean match(Integer t) {
        for (int i = 2; i < t; ++i) {
            if (t % i == 0) {
                return false;
            }
        }
        return true;
    }
}