/**
 * Euler Two Project:  Sum of Even Fibonacci numbers.
 *
 * By considering the terms in the Fibonacci sequence, find the sum of the even-valued terms.
 *
 * @author Mark Nelson
 * @see https://projecteuler.net/problem=2
 * @since 5.0
 */

public class Main {

  /**
   * Application entry point.
   *
   * @param args Unused.
   */
  public static void main(String[] args) {

    int iSum = computeEvenFibonacci(4000000);
    System.out.println(iSum);
  }

  /**
   * Compute even Fibonacci numbers.
   *
   * @param upperBound The largest number that could possibly be included in the summation.
   * @return The sum of all even Fibonacci numbers less than or equal to the upperBound.
   */
  public static int computeEvenFibonacci(int upperBound) {
    int iFib1 = 1;
    int iFib2 = 1;
    int iSum = 0;

    while (iFib1 <= upperBound && iFib2 <= upperBound) {

      int prevFib1 = iFib1;

      iFib1 = iFib1 + iFib2;
      iFib2 = prevFib1;

      if (iFib1 % 2 == 0) {
        iSum += iFib1;
      }

      /* System.out.printf( "iFib1 = [%d]  iFib2 = [%d]  iSum = [%d]\n", iFib1, iFib2, iSum); */  // Debugging
    }

    return iSum;
  }
}
