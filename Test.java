package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;
class Test {

        User user= new User();
        @org.junit.jupiter.api.Test
        void firstNameMatcher_Valid () throws InvalidUserException {

            // sad Test Cases
            Assertions.assertDoesNotThrow(()->user.FirstNameMatcher("Vi"));
         //Assertions.assertTrue(user.FirstNameMatcher("Vi")==false)

                // Happy Test cases
            Assertions.assertDoesNotThrow(()->user.FirstNameMatcher("Viv1"));
            Assertions.assertDoesNotThrow(()->user.FirstNameMatcher("vivek"));
            Assertions.assertDoesNotThrow(()->user.FirstNameMatcher("Vivek"));
          Assertions.assertEquals(false,user.FirstNameMatcher("Viv1"));
          Assertions.assertEquals(false,user.FirstNameMatcher("vivek"));
          Assertions.assertEquals(true,user.FirstNameMatcher("Vivek"));
        }
  @org.junit.jupiter.api.Test
        void firstNameMatcher_Invalid() throws InvalidUserException{
            Assertions.assertThrows(InvalidUserException.class,()->user.FirstNameMatcher(""));
      Assertions.assertThrows(InvalidUserException.class,()->user.FirstNameMatcher(null));
        }
        @org.junit.jupiter.api.Test
        void lastNameMatcher_Valid () throws InvalidUserException{
                // sad Test Cases
            Assertions.assertDoesNotThrow(()->user.LastNameMatcher("Ra"));
                // Assertions.assertTrue(user.FirstNameMatcher("Ra")==false)

                // Happy Test cases
            Assertions.assertDoesNotThrow(()->user.LastNameMatcher("Ran1"));
            Assertions.assertDoesNotThrow(()->user.LastNameMatcher("ranjan"));
            Assertions.assertDoesNotThrow(()->user.LastNameMatcher("Ranjan"));
                Assertions.assertEquals(false,user.LastNameMatcher("Ran1"));
                Assertions.assertEquals(false,user.LastNameMatcher("ranjan"));
                Assertions.assertEquals(true,user.LastNameMatcher("Ranjan"));
        }
    @org.junit.jupiter.api.Test
    void LastNameMatcher_Invalid() throws InvalidUserException{
        Assertions.assertThrows(InvalidUserException.class,()->user.LastNameMatcher(""));
        Assertions.assertThrows(InvalidUserException.class,()->user.LastNameMatcher(null));
    }
        @org.junit.jupiter.api.Test
        void emailMatcher_Valid  () throws InvalidUserException{
                // sad Test Cases
            Assertions.assertDoesNotThrow(()->user.EmailMatcher("abc.@gmail.co"));
                // Assertions.assertTrue(user.EmailMatcher("abc.@gmail.co")==true);

                // Happy Test cases
            Assertions.assertDoesNotThrow(()->user.EmailMatcher("abc.100@yahoo.com"));
            Assertions.assertDoesNotThrow(()->user.EmailMatcher("abc()*@gmail.com"));
            Assertions.assertDoesNotThrow(()->user.EmailMatcher("abc@abc@gmail.com"));
                Assertions.assertTrue(user.EmailMatcher("abc.100@yahoo.com")==true);
                Assertions.assertTrue(user.EmailMatcher("abc()*@gmail.com")==false);
                Assertions.assertEquals(false, user.EmailMatcher("abc@abc@gmail.com"));
        }
    @org.junit.jupiter.api.Test
    void EmailMatcher_Invalid() throws InvalidUserException{
        Assertions.assertThrows(InvalidUserException.class,()->user.EmailMatcher(""));
        Assertions.assertThrows(InvalidUserException.class,()->user.EmailMatcher(null));
    }

        @org.junit.jupiter.api.Test
        void phoneMatcher_Valid () throws InvalidUserException {
                // sad test cases
            Assertions.assertDoesNotThrow(()->user.PhoneMatcher("99 0999999999"));
                // Assertions.assertTrue(user.PhoneMatcher("99 0999999999")==true);
               //  Assertions.assertEquals(true,user.PhoneMatcher("999 9999999999"));

                // Happy Test Cases
            Assertions.assertDoesNotThrow(()->user.PhoneMatcher("999 0999999999"));
            Assertions.assertDoesNotThrow(()->user.PhoneMatcher("99 9000000000"));
                Assertions.assertEquals(true,user.PhoneMatcher("99 9000000000"));
                Assertions.assertEquals(false,user.PhoneMatcher("999 0999999999"));

        }
    @org.junit.jupiter.api.Test
    void PhoneMatcher_Invalid() throws InvalidUserException{
        Assertions.assertThrows(InvalidUserException.class,()->user.PhoneMatcher(""));
        Assertions.assertThrows(InvalidUserException.class,()->user.PhoneMatcher(null));
    }
        @org.junit.jupiter.api.Test
        void passwordMatcher_Valid () throws InvalidUserException {
                // sad test cases
                 Assertions.assertDoesNotThrow(()->user.PasswordMatcher("Vivek123"));
                // Assertions.assertEquals(true,"Vivek123");
                // Assertions.assertEquals(true,"viv@%#12");

                // Happy Test Cases
            Assertions.assertDoesNotThrow(()->user.PasswordMatcher("viv@123Z"));
            Assertions.assertDoesNotThrow(()->user.PasswordMatcher("Vivek#1233"));
                Assertions.assertEquals(true,user.PasswordMatcher("viv@123Z"));
                Assertions.assertEquals(true,user.PasswordMatcher("Vivek#1233"));
        }
    @org.junit.jupiter.api.Test
    void PasswordMatcher_Invalid() throws InvalidUserException{
        Assertions.assertThrows(InvalidUserException.class,()->user.PasswordMatcher(""));
        Assertions.assertThrows(InvalidUserException.class,()->user.PasswordMatcher(null));
    }
        @org.junit.jupiter.api.Test
        void emailsTest_Valid() throws InvalidUserException{
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
                    Assertions.assertDoesNotThrow(()->user.EmailMatcher(email));
                        Assertions.assertEquals(true,user.EmailMatcher(email));
                }
                for(String email : invalidEmails){
                    Assertions.assertDoesNotThrow(()->user.EmailMatcher(email));
                        Assertions.assertEquals(false,user.EmailMatcher(email));
                }
        }

}