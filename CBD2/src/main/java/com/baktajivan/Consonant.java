package com.baktajivan;

public class Consonant {
    static void consonant(String str)
    {
        char cn;
        int i=0;
        for(int j=0;j<str.length();j++)
        {
            cn=str.charAt(j);
            if(cn=='b'||cn=='c'||cn=='d'||cn=='f'||cn=='g'||cn=='h'||cn=='j'||cn=='k'||cn=='l'||cn=='m'
                    ||cn=='n'||cn=='p'||cn=='q'||cn=='r'||cn=='s'||cn=='t'||cn=='v'||cn=='w'||cn=='x'
                    ||cn=='y'||cn=='z'||cn=='F'||cn=='G'||cn=='H'||cn=='J'||cn=='K'||cn=='L'||cn=='M'
                    ||cn=='N'||cn=='P'||cn=='Q'||cn=='R'||cn=='S'||cn=='T'||cn=='V'||cn=='W'||cn=='X'
                    ||cn=='Y'||cn=='Z')
            {
                i=1;
                System.out.print(cn);
            }
        }
        if(i==0)
            System.out.println("There are no consonant in a entered string");

    }
}
