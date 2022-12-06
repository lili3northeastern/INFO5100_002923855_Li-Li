package Exercise.Exercise7;
/*
Write a generic method to count the number of elements in a collection that have a specific property
(for example, odd integers, prime numbers, palindromes).
Write a generic method to exchange the positions of two different elements in an array.
Write a generic method to find the maximal element in the range [begin, end) of a list.
 */
public interface SomeSpecialNumber<T> {
    public boolean match(T t);
}
