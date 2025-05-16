/*
 * Class: CMSC201
 * Instructor: Amanullah Khalid
 * Description: JUnit test for String methods
 * Due: 05/12/2025
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Piushani Ellegala
 */


import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The PrimeNumberMethodTest class contains the method isPrime
 * and JUnit test cases to verify the method functionality.
 */
public class PrimeNumberMethodTest {

    /**
     * Determines if a number is prime.
     * @param number the number to test
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Test isPrime with a prime number.
     */
    @Test
    public void testPrimeNumber() {
        assertTrue(isPrime(7));
    }

    /**
     * Test isPrime with a non-prime number.
     */
    @Test
    public void testNonPrimeNumber() {
        assertFalse(isPrime(10));
    }

    /**
     * Test isPrime with a small prime number.
     */
    @Test
    public void testSmallPrime() {
        assertTrue(isPrime(2));
    }

    /**
     * Test isPrime with a negative number.
     */
    @Test
    public void testNegativeNumber() {
        assertFalse(isPrime(-5));
    }

    /**
     * Test isPrime with 1, which is not a prime.
     */
    @Test
    public void testOne() {
        assertFalse(isPrime(1));
    }
}
