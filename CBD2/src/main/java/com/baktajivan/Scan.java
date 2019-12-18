package com.baktajivan;
//import all package for future scalability
import  java.util.*;
//all scanner input and output operation happened here
public class Scan {
    public static void scanner (){
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        //Alert the user that there is 3 different input
        System.out.println("There is 3 different input required for 3 different operations, Please be aware of it.");

        //Task A Operation
        System.out.println("Task A, Palindrome and Reversed Number Input: "); //insert an integer number
        int a=scan.nextInt();//receive the input
        ReversedInt reversedInt = new ReversedInt();//create a constructor to send scanned input
        reversedInt.isPalindrome(a);//pass the value through the constructor
        System.out.println("");//to create a space in between lines

        //Task B Operation
        //create the constructor to send scanned input
        Vowel v = new Vowel();
        Consonant c = new Consonant();
        System.out.println("Task B, Vowel and Consonant, Enter a string : ");//insert a string value
        String s=scan.nextLine();//receive the input
        System.out.println("Vowels in a string '"+s+"' are :");
        v.vowels(s);//pass the value through the constructor
        System.out.println("");//to create a space in between lines
        System.out.println("Consonant in a string '"+s+"' are :");
        c.consonant(s);//pass the value through the constructor
        System.out.println("");//to create a space in between lines

        //Task C Operation
        System.out.println("Task C, Enter Input for Alphabet Only Output : ");//insert a string value
        String input = scan.nextLine();// Read user input
        AlphabetOnly comp = new AlphabetOnly();//create new constructor to send scanned input
        comp.Compute(input);//pass the value through the constructor
    }//method end
}//class end