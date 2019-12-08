package com.baktajivan;
import  java.util.*;

public class Scan {
    public static void scanner (){
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("There is 3 different input required for 3 different operations, Please be aware of it."); //insert an integer number
        //Task A
        System.out.println("Task A, Palindrome and Reversed Number Input: "); //insert an integer number
        int a=scan.nextInt();
        ReversedInt reversedInt = new ReversedInt();
        reversedInt.isPalindrome(a);
        System.out.println("");

        //Task B
        Vowel v = new Vowel();
        Consonant c = new Consonant();
        System.out.println("Task B, Vowel and Consonant, Enter a string : ");//insert a string value
        String s=scan.nextLine();
        System.out.println("Vowels in a string '"+s+"' are :");
        v.vowels(s);
        System.out.println("");
        System.out.println("Conconant in a string '"+s+"' are :");
        c.consonant(s);
        System.out.println("");

        //Task C
        System.out.println("Task C, Enter Input for Alphabet Only Output : ");
        String input = scan.nextLine();  // Read user input

        AlphabetOnly comp = new AlphabetOnly();//create new constructor to send scanned input
        comp.Compute(input);//send the input to the method


    }
}