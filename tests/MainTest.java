/**
 * Euler Two Project:  Test Sum of Even Fibonacci numbers.
 *
 * By considering the terms in the Fibonacci sequence, find the sum of the even-valued terms.
 *
 * @author Mark Nelson
 * @see https://projecteuler.net/problem=2
 * @since 5.0
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * JUnit entry point for testing this class.
 */
public class MainTest {

  /**
   * Test even Fibonacci numbers
   *
   * @throws Exception On invalid computation.
   */
  @Test
  public void testComputeEvenFibonacci() throws Exception {
    assertEquals("Even Fibonnacci numbers below 10", 10, Main.computeEvenFibonacci(10));
    assertEquals("Even Fibonnacci numbers below 100", 188, Main.computeEvenFibonacci(100));
  }
}