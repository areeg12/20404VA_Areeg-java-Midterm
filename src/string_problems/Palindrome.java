package string_problems;

public class Palindrome {

    /*
      A palindrome is a word that can be reversed, and still remain the same.
      Example: MOM, DAD, MADAM, RACECAR

      Create a method to check if any given String is a palindrome or not.
     */

    // Implement here


    static String sentence = "RACECAR";

    public static void main(String[] args) {




            char[] sentenceArray = sentence.toCharArray();
            int n = sentenceArray.length;

            for (int i = n - 1; i >= 0; i--) {
                System.out.print(sentenceArray[i]);
            }


        }


    }
