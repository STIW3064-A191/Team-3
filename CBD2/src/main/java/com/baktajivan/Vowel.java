package com.baktajivan;
//Task B part 2
//prints out the vowel from the input string method
public class Vowel {
    static void vowels(String str) {
        //initialized the value
        char ch;
        int i=0;
        //create for loop method
        for(int j=0;j<str.length();j++) {
            ch=str.charAt(j);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                i=1;
                System.out.print(ch);//print out the output
            }//if end
        }//for end
        //if there is no consonant in the string it will print this output
        if(i==0)
            System.out.println("There are no vowels in a entered string");
    }//method end
}//class end
