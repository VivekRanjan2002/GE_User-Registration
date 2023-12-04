package org.example;
import java.util.regex.Pattern;
import  java.util.regex.Matcher;
public class User{
    /*
    @desc: Matches firstName input with given pattern where first name
         is capital and have minimum 3 characters and print the statement accordingly
     */
    public void FirstNameMatcher(String firstName) {
        String regexFirstName = "^[A-Z]([A-Za-z]){2,}";
        Pattern pattern = Pattern.compile(regexFirstName);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.find()) {
            System.out.println(firstName+" matches with the Pattern");
        } else {
            System.out.println(firstName+" don't match with Pattern");
        }
    }

    /*
    @desc: Matches lastName input with given pattern where last name
         is capital and have minimum 3 characters and print the statement accordingly
     */
    public void LastNameMatcher(String lastName) {
        String regexlastName = "^[A-Z]([A-Za-z]){2,}";
        Pattern pattern = Pattern.compile(regexlastName);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.find()) {
            System.out.println(lastName+" matches with the Pattern");
        } else {
            System.out.println(lastName+" don't match with Pattern");
        }
    }
}
