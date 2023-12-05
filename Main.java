package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to User Management Interface ");
        User user= new User();

      // UC1 first Name checker
        user.FirstNameMatcher("Viv"); // matches with pattern      true
        user.FirstNameMatcher("vIVek"); // don't match with pattern   false
        user.FirstNameMatcher("Vi12"); // don't match with pattern    false

        // UC2 Last Name checker
        user.LastNameMatcher("Ranjan"); // matches with pattern   true
        user.LastNameMatcher("rANJAN"); // don't match with pattern   false
        user.LastNameMatcher("Rn1"); // don't match with pattern       false
        user.LastNameMatcher("Ra"); // don't match with pattern         false

        //UC3 Email Checker
         user.EmailMatcher("abc.100@yahoo.com");       // true
         user.EmailMatcher("abc@1.com");              // true
         user.EmailMatcher("abc+100@gmail.com");      // true
         user.EmailMatcher("abc..123@gmail.com");     // false

       // UC4 Phone No. Checker
        user.PhoneMatcher("99 1111111111");  // true two digit ph no+ space+ 10 digit ph no
        user.PhoneMatcher("90 0111111111");  // false first digit of phone no can't be 0
        user.PhoneMatcher("900 1111111111"); // false  three digit country code
        user.PhoneMatcher("90 99999999999"); // false 11 digit phone no.

        //UC4 Password Checker
        System.out.println(user.PasswordMatcher("viv")); // false as password length<8
        System.out.println(user.PasswordMatcher("VivekRanjan")); // false as no numeric digit
        System.out.println(user.PasswordMatcher("vivekranjan")); // false as no upper case char
        System.out.println(user.PasswordMatcher("Viv12Ranjan")); //false as len>=8, no special char
        System.out.println(user.PasswordMatcher("Viv12@Ranjan")); //true as len>=8,special char,upper case,numeric digit


    }
}
