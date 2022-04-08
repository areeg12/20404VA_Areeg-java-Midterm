package string_problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program, `isAnagram`, to check if any two strings are anagrams

    An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
    original letters exactly once.

        Ex: "CAT" & "ACT",
            "ARMY" & "MARY",
            "FART" & "RAFT"
    */

    //Implement Here

    public static void main(String[] args) {

       Anagram anagram = new Anagram();

                String str1 = "CAT";
                String str2 = "ACT";
        // converting to lower case
        str1 = str1.toLowerCase(); //cat
        str2 = str2.toLowerCase(); //act
        if (str1.length() != str2.length()) {
            System.out.println(" not anagram");
        } else {
            char[] String1 = str1.toCharArray();
            char[] String2 = str2.toCharArray(); // converting to char array
            // sort the array
            Arrays.sort(String1); //a c t
            Arrays.sort(String2); // a c t
            if (Arrays.equals(String1, String2) == true) {
                System.out.println(" are anagram");
            } else {
                System.out.println("not anagram");
            }
        }
    }
    }

