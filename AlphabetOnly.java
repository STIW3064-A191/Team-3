package com.baktajivan;
//Task C
//remove all except alphabet include special characters method
public class AlphabetOnly {
    //create the method
    public void Compute(String input){
        String output = input.replaceAll("[^a-zA-Z]","");//just keeps the alphabet only
        if(output.equals("")) {
            System.out.println("Output: There is no alphabet in the input string");//prints the output if no alphabet detected
        }
        else {
            System.out.println("Output: " + output);//prints the output
        }
    }//method end
}//class end

