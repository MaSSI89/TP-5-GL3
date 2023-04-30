package tests;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import app.PasswordValidator;

public class PasswrodValidatorTests {
    private PasswordValidator passValidator = new PasswordValidator();
    @Test
    public void testLength(){
        String passWord = "aaaaaaaaaaaa";
        assertFalse("Password length should be between 8 and 12 caracters",passValidator.checkPassword(passWord));
        passWord = "short";
        assertFalse(" 8 < Password length <12", passValidator.checkPassword(passWord));
        passWord = "Long lLong pass";
        assertFalse(" 8 < Password length <12", passValidator.checkPassword(passWord));
    }

    @Test
    public void checkFOrINtegerINPassword(){
        String passWord = "isilA2022@";
        assertTrue("At least contaitns 1 caracter", passValidator.checkPassword(passWord));
        passWord = "noNumberIN";
        assertFalse("Au moins un Entier", passValidator.checkPassword(passWord));
    }

    @Test
    public void checkForLowerCase(){
        String password = "NOLOWERCA56";
        assertFalse("Au moins un car au miniscule", passValidator.checkPassword(password));
        password = "ONELOWERca";
        assertFalse(passValidator.checkPassword(password));
    }

    @Test
    public void checkForCapitalLetter(){
        String passWord = "nocapital";
        assertFalse("Au Moins un car Majuscule", passValidator.checkPassword(passWord));
        passWord = "ONEcapital";
        assertFalse(passValidator.checkPassword(passWord));
    }

    @Test
    public void checkForSpecial(){
        String passWord = "nospecial6";
        assertFalse("NO special car", passValidator.checkPassword(passWord));
        passWord = "oneSpec@l4";
        assertTrue(passValidator.checkPassword(passWord));
    }

}
