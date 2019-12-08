package com.baktajivan;

import java.io.Serializable;

//all the operation is done here
//remove all except alphabet include special characters
public class AlphabetOnly implements Serializable {

    public void Compute(String input){
        String output = input.replaceAll("[^a-zA-Z]","");//just keeps the alphabet only
        System.out.println("Output: "+output);//prints the output
    }
}

