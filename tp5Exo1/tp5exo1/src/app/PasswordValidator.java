package app;
public class PasswordValidator {
    

    public boolean checkPassword(String pass){
        if(pass.length() < 8 || pass.length() > 12)
            return false;
        if (!pass.matches(".*\\d+.*")) 
            return false;
        if(!pass.matches(".*[a-z].*"))
            return false;
        if (!pass.matches(".*[A-Z].*"))
            return false;
            // si pass does not special char -> FALSE
        if (!pass.matches(".*[^a-zA-Z0-9].*"))
            return false;

        return true;
    }
}
