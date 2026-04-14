package za.ac.cput.Util;

import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;

public class Helper {
    public static boolean isNullOrEmpty(String str){
        if (str == null || str.isEmpty()){
            return true;
        }
        return false;
    }
    public static boolean isValidEmail(String email){
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(email);
    }


    public static LocalDate getDateOfBirth(String id){
    int year = Integer.parseInt(id.substring(0,2));
    int month = Integer.parseInt(id.substring(2,4));
    int day = Integer.parseInt(id.substring(4,6));
    LocalDate date = LocalDate.of(year, month, day);
    return date;

    }
    }

