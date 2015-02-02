public class Main {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    int iFib1 = 1;
    int iFib2 = 1;
    int iSum = 0;

    while( iFib1 <= 4000000 && iFib2 <= 4000000 ) {

      int iFib1_old = iFib1;

      iFib1 = iFib1 + iFib2;
      iFib2 = iFib1_old;

      if( iFib1 % 2 == 0 )
        iSum += iFib1;

      System.out.printf( "iFib1 = [%d]  iFib2 = [%d]  iSum = [%d]\n", iFib1, iFib2, iSum);
    }
    System.out.println( iSum );
  }
}
