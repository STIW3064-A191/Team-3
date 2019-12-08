package com.baktajivan;

public class Vowel {
    static void vowels(String str)
    {
        char ch;
        int i=0;
        for(int j=0;j<str.length();j++)
        {
            ch=str.charAt(j);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                i=1;
                System.out.print(ch);
            }
        }
        if(i==0)
            System.out.println("There are no vowels in a entered string");

    }
}
