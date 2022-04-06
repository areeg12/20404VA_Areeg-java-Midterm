package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     * Write a method that will print or return at least 40 Fibonacci numbers
     *
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {

      int a = 0;
      int b = 1;
      int c;
      for (int i = 0 ; i<40 ; i++) {
          System.out.println(a + "");
          c = a + b;
          a = b;
          b = c;
      }


    }

}
