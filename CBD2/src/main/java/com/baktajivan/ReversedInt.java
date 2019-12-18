package com.baktajivan;
//Task A
//reverse the integer / palindrome in the input method
class ReversedInt {
    //create the method
    void isPalindrome(int num) {
        //initialized the value
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;

        //create while loop to calculate palindrome integer
        //stop looping if the remainder equal to 0
        while( num != 0 ) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }//while end

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger ) {
            //print output if true
            System.out.println("Output: "+originalInteger+ " is a palindrome.");
        }//if end
        else {
            //print output if false
            System.out.println("Output: "+originalInteger + " is not a palindrome.");
        }//else end
    }//method end
}//class end