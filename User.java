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
    public boolean FirstNameMatcher(String firstName) throws InvalidUserException {
        if (firstName == null || firstName.isEmpty()) throw new InvalidUserException("FirstName can't be empty or null");
        String regexFirstName = "^[A-Z]([A-Za-z]){2,}$";
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
    public boolean LastNameMatcher(String lastName) throws InvalidUserException {
        if (lastName == null || lastName.isEmpty()) throw new InvalidUserException("LastName can't be empty or null");
       return FirstNameMatcher(lastName);
    }

    /*
    @desc: matches with given email with pattern which have E.g. abc.xyz@bl.co.in has 3 mandatory parts (abc, bl
            & co) and 2 optional (xyz & in) with precise @ and . positions
    @params: string as email given by user
    @return: boolean value if matches then true otherwise false
     */

    public boolean EmailMatcher(String email) throws InvalidUserException{
        if(email==null || email.isEmpty()) throw new InvalidUserException("Email can't be empty or null");
        String regexEmail= "^[a-zA-z0-9]+([._%+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([._%+-][a-zA-Z]{2,})+$";
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher= pattern.matcher(email);
       return matcher.find();

    }
    /*
    @desc: matches with given phoneNo with pattern having country code of 2 digit followed by space and then
           10 digit phone no. with 0 can't be at first digit
    @params: String phone no. given by user
    @return: boolean value true if matches false otherwise
     */
    public boolean PhoneMatcher(String phoneNo) throws  InvalidUserException{
        if(phoneNo==null || phoneNo.isEmpty()) throw new InvalidUserException("Phone No. can't be empty or null");
        String regexPhone= "^[0-9]{2,2}(\\s[1-9][0-9]{9,9})$";
        Pattern pattern = Pattern.compile(regexPhone);
        Matcher matcher= pattern.matcher(phoneNo);
        return matcher.find();
    }
    /*
    @desc: matches with password with pattern which have minimum 8 length characters
            and have at least one Upper case char and have at least one numeric digit
    @params: String password given by user
    @return : boolean  true if matches else false
     */
    public boolean PasswordMatcher(String password) throws InvalidUserException{
        if(password==null || password.isEmpty()) throw new Error("Password can't be empty or null");
        String regexPasswd="^(?=.*[A-Z])(?=.*\\d)(?=\\S*\\W\\S*$).{8,}$";
        Pattern pattern= Pattern.compile(regexPasswd);
        Matcher matcher= pattern.matcher(password);
        return matcher.find();
    }
}
