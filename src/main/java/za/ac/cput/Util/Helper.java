package za.ac.cput.Util;

import org.apache.commons.validator.routines.EmailValidator;

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

    }

