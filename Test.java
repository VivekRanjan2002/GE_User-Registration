package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;
class Test {

        User user= new User();
        @org.junit.jupiter.api.Test
        void firstNameMatcher () {

            // sad Test Cases
         // Assertions.assertTrue(user.FirstNameMatcher("Vi")==false)

                // Happy Test cases
          Assertions.assertEquals(false,user.FirstNameMatcher("Viv1"));
          Assertions.assertEquals(false,user.FirstNameMatcher("vivek"));
          Assertions.assertEquals(true,user.FirstNameMatcher("Vivek"));
        }

        @org.junit.jupiter.api.Test
        void lastNameMatcher () {
                // sad Test Cases
                // Assertions.assertTrue(user.FirstNameMatcher("Ra")==false)

                // Happy Test cases
                Assertions.assertEquals(false,user.FirstNameMatcher("Ran1"));
                Assertions.assertEquals(false,user.FirstNameMatcher("ranjan"));
                Assertions.assertEquals(true,user.FirstNameMatcher("Ranjan"));
        }

        @org.junit.jupiter.api.Test
        void emailMatcher () {
                // sad Test Cases
                // Assertions.assertTrue(user.EmailMatcher("abc.@gmail.co")==true);

                // Happy Test cases
                Assertions.assertTrue(user.EmailMatcher("abc.100@yahoo.com")==true);
                Assertions.assertTrue(user.EmailMatcher("abc()*@gmail.com")==false);
                Assertions.assertEquals(false, user.EmailMatcher("abc@abc@gmail.com"));
        }

        @org.junit.jupiter.api.Test
        void phoneMatcher () {
                // sad test cases
                // Assertions.assertTrue(user.PhoneMatcher("99 0999999999")==true);
               //  Assertions.assertEquals(true,user.PhoneMatcher("999 9999999999"));

                // Happy Test Cases
                Assertions.assertEquals(true,user.PhoneMatcher("99 9000000000"));
                Assertions.assertEquals(false,user.PhoneMatcher("999 0999999999"));

        }

        @org.junit.jupiter.api.Test
        void passwordMatcher () {
                // sad test cases
                // Assertions.assertEquals(true,"Vivek123");
                // Assertions.assertEquals(true,"viv@%#12");

                // Happy Test Cases
                Assertions.assertEquals(true,user.PasswordMatcher("viv@123Z"));
                Assertions.assertEquals(true,user.PasswordMatcher("Vivek#1233"));
        }

        @org.junit.jupiter.api.Test
        void emailsTest(){
                User user = new User();
                String[] validEmails = {"abc@yahoo.com",  //true
                        "abc-100@yahoo.com", // true
                        "abc.100@yahoo.com", //true
                        "abc111@abc.com", //true
                        "abc-100@abc.net", //true
                        "abc.100@abc.com.au",  //true
                        "abc@1.com", // true
                        "abc+100@gmail.com", // true
                };
                String[] invalidEmails = {"abc", // false
                        "abc@.com.my", //false
                        "abc123@gmail.a", //false
                        "abc123@.com", //false
                        "abc123@.com.com", //false
                        ".abc@abc.com", //false
                        "abc()*@gmail.com",//false
                        "abc@%*.com",//false
                        "abc..2002@gmail.com",//false
                        "abc.@gmail.com",//false
                        "abc@abc@gmail.com",//false
                        "abc@gmail.com.1a",//false
                        "abc@gmail.com.aa.au"};//false
                for(String email : validEmails){
                        Assertions.assertEquals(true,user.EmailMatcher(email));
                }
                for(String email : invalidEmails){
                        Assertions.assertEquals(false,user.EmailMatcher(email));
                }
        }

}