package Exercise.Exercise7;

public class EvenNumber implements SomeSpecialNumber<Integer> {

    @Override
    public boolean match(Integer t) {
        return (t % 2 == 0);
    }
}