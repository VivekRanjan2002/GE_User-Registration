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


    }
}
