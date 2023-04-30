package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        PasswordValidator passValidator = new PasswordValidator();

        System.out.println("Enter your password!:");
        String pass = reader.nextLine();
        boolean result = passValidator.checkPassword(pass);

        if (!result)
            System.out.println("Password entered does not mactch specifications");
            System.out.println("password should have : characters between 8 and 12\n"+
            "at least ONE INTEGER\n"+
            "AT LEAST ONE LOWER CASE CARACTER\n"+
            "AT LEAST ONE CAPITAL LETTER CARACTER\n"+
            "AT LEAST ONE SPECIAL CARACTER\n");

    }
}
