package Quizes;

import java.security.SecureRandom;

public class Customer2 {
    private String firstName;
    private String lastName;
    private String address;
    private String cardNumber;
    private int pin;
    private String username;
    private String password;

    public Customer2(String firstName, String lastName, String address, String cardNumber, int pin, String username, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
        if (isValidPassword(password)){
            this.password = password;
        }else {
            this.password="Default@Pass12";
        }
    }

    public Customer2(String firstName, String lastName, String address, String cardNumber, int pin, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
        this.password=generatePassword();

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isValidPassword(password)){
            this.password = password;
        }else {
            this.password="Password@201";
        }
    }

    public String  generatePassword(){
        String finalPassword = "";
        String specialChar= "@#$%";
        String numericChar= "1234567890";
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String combinedChar = specialChar+numericChar+capitalCaseLetters+lowerCaseLetters;

        SecureRandom rand = new SecureRandom();

        finalPassword+=capitalCaseLetters.charAt(rand.nextInt(capitalCaseLetters.length()));
        finalPassword+=lowerCaseLetters.charAt(rand.nextInt(lowerCaseLetters.length()));
        finalPassword+=specialChar.charAt(rand.nextInt(specialChar.length()));
        finalPassword+=numericChar.charAt(rand.nextInt(numericChar.length()));



        while (finalPassword.length()<12){
            finalPassword+=combinedChar.charAt(rand.nextInt(combinedChar.length()));
        }

        return finalPassword;
    }


    public String toString() {
        return "Customer[" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", pin=" + pin +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                "]";
    }

    public boolean isValidPassword(String password){
        if (password.length() != 12){
            return false;
        }
        int lower = 0;
        int upperCount = 0;
        int numCount = 0;
        int specialCount = 0;

        for (int i=0; i<password.length(); i++){
            char one = password.charAt(i);

            if (isDigit(one)){
                numCount++;
            }else if(isUpper(one)){
                upperCount++;
            }else if(Character.isLowerCase(one)){
                lower++;
            }else if (specialCharacter(one)){
                specialCount++;
            }

        }

        return !(upperCount == 0 || lower==0 || numCount == 0 || specialCount == 0);
    }

    public boolean specialCharacter(char A){
        String specialChar = "@#$%";
        for (int i=0; i < specialChar.length(); i++){
            char B = specialChar.charAt(i);
            if (A == B){
                return true;
            }
        }
        return false;
    }

    public static boolean isUpper(char a) {
        return a >= 'A' && a <= 'Z';
    }


    public static boolean isDigit(char a) {

        return a >= '0' && a <= '9';
    }


}