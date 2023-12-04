package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to User Management Interface ");
        User user= new User();

      // UC1 first Name checker
        user.FirstNameMatcher("Viv"); // matches with pattern
        user.FirstNameMatcher("vIVek"); // don't match with pattern
        user.FirstNameMatcher("Vi12"); // don't match with pattern


    }
}
