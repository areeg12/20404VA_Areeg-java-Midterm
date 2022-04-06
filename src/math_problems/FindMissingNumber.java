package math_problems;

public class FindMissingNumber {

    /**
     * INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int a[] = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        // sum1 = 1+2+3+4+5+6+7+8+10
        // sum2 = 1+2+3+4+5+6+7+8+9+10
        // sum2-sum1 = 55-46 = 9 (the missing number)
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
        }
        System.out.println(+ sum1);

        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {

            sum2 = sum2 + i;
        }
        System.out.println(+ sum2);
        System.out.println( "Missing Number is" + (sum2 - sum1));
    }
}