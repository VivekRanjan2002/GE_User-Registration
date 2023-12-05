package org.example;
import java.util.regex.Pattern;
import  java.util.regex.Matcher;
public class User{
    /*
    @desc: Matches firstName input with given pattern where first name
         is capital and have minimum 3 characters
    @params: string firstname given by user
    @return: boolean if matches then 1 and 0 otherwise
     */
    public boolean FirstNameMatcher(String firstName) {
        String regexFirstName = "^[A-Z]([A-Za-z]){2,}";
        Pattern pattern = Pattern.compile(regexFirstName);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.find();
    }

    /*
    @desc: Matches lastName input with given pattern where last name
         is capital and have minimum 3 characters
     @params: string lastname given by user
     @return : boolean value true if matches and false if not matches
     */
    public boolean LastNameMatcher(String lastName) {
       return FirstNameMatcher(lastName);
    }

    /*
    @desc: matches with given email with pattern which have E.g. abc.xyz@bl.co.in has 3 mandatory parts (abc, bl
            & co) and 2 optional (xyz & in) with precise @ and . positions
    @params: string as email given by user
    @return: boolean value if matches then true otherwise false
     */

    public boolean EmailMatcher(String email){
        String regexEmail= "^[a-zA-z0-9]+([._%+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([._%+-][a-zA-Z]{2,})+$";
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher= pattern.matcher(email);
       return matcher.find();

    }
}
