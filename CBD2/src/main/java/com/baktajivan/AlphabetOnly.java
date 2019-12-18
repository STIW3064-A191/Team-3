package com.baktajivan;
//Task C
//remove all except alphabet include special characters method
public class AlphabetOnly {
    //create the method
    public void Compute(String input){
        String output = input.replaceAll("[^a-zA-Z]","");//just keeps the alphabet only
        System.out.println("Output: "+output);//prints the output
    }//method end
}//class end

