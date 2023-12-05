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

}