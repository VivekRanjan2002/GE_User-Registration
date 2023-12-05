package org.example;

public class EmailSample {
    private static String[] email= new String[]{
                "abc@yahoo.com",  // valid
                "abc.100@yahoo.com",  //valid
                "abc111@abc.com",     //valid
                "abc-100@abc.net",    //valid
                "abc-100@yahoo.com",   //valid
                "abc.100@abc.com.au",  //valid
                "abc@1.com",           //valid
                "abc@gmail.com.com",   //valid
                "abc+100@gmail.com",   //valid
                "abc",                 //invalid
                "abc@.com.my",         //invalid
                "abc123@gmail.a",      //invalid
                "abc123@.com",         //invalid
                "abc123@.com.com",      //invalid
                ".abc@abc.com",         //invalid
                "abc()*@gmail.com",      //invalid
                "abc@%*.com",             //invalid
                "abc..2002@gmail.com",     //invalid
                "abc.@gmail.com",          //invalid
                "abc@abc@gmail.com",       //invalid
                "abc@gmail.com.1a",        //invalid
                "abc@gmail.com.aa.au",      //valid
                "@gmail"                    //invalid
        };

    public static  String[] getEmailSample(){
        return email;
    }

}
