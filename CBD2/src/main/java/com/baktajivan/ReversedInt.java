package com.baktajivan;

class ReversedInt {
    void isPalindrome(int num) {
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;

        // reversed integer is stored in variable
        while( num != 0 ) //stop looping if the remainder equal to 0
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger ) {
            System.out.println("Output: "+originalInteger+ " is a palindrome.");
        }
        else {
            System.out.println("Output: "+originalInteger + " is not a palindrome.");
        }
    }
}