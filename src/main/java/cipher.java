// Henry Fong (yks8nq)
// Cipher Program

import java.io.File;
import java.util.Scanner;

public class cipher {
    // decipher method if user only inputs cipher string
    public static String decipher(String cipherString) throws Exception
    {
        File keyFile = new File("ciphers/key.txt"); // access txt file with key
        Scanner fileReader = new Scanner(keyFile);

        String uncipheredValues = "";
        String cipherKey = "";

        boolean validation;

        // iterates through the txt file
        if (fileReader.hasNext()){
            uncipheredValues = fileReader.nextLine(); // assign first line of text to uncipheredValues
        }
        if (fileReader.hasNext()){
            cipherKey = fileReader.nextLine(); // assign second line of text to cipherKey
        }

        validation = validate(cipherString, cipherKey, uncipheredValues); // calls validate method to check if the cipher string and data in txt file is valid

        // if validation is false then return failed validation
        if(!validation){
            return "failed validation";
        }

        return decipherString(cipherString, cipherKey, uncipheredValues); // if validation is true then will return deciphered string using decipherString method
    }

    // decipher method if the user inputs both cipher string and key
    public static String decipher(String cipherString, String key) throws Exception
    {
        String keyFilePath;

        // checks to see if user inputs key file with a .txt or not
        if(!key.toLowerCase().endsWith(".txt")){
            keyFilePath = "ciphers/"+key+".txt"; // if user does not end with .txt it will add .txt at the end to make it a valid file path
        }
        else{
            keyFilePath = "ciphers/"+key; // if user does end with .txt file it will add ciphers/ to make it a valid file path
        }

        File keyFile = new File(keyFilePath);

        // check to see if the txt file exist in the file path if it does not exist will return a not found statement
        if (!keyFile.exists()) {
            return ("File: " + key + " Not Found");
        }

        Scanner fileReader = new Scanner(keyFile);


        String uncipheredValues = "";
        String cipherKey = "";

        boolean validation;

        if (fileReader.hasNext()){
            uncipheredValues = fileReader.nextLine();
        }
        if (fileReader.hasNext()){
            cipherKey = fileReader.nextLine();
        }

        validation = validate(cipherString, cipherKey, uncipheredValues);

        if(!validation){
            return "failed validation";
        }

        return decipherString(cipherString, cipherKey, uncipheredValues);
    }


    public static boolean validate(String cipherString, String cipherKey, String uncipheredValues){ // validation checker
        // if cipherString or uncipheredValues are empty will fail validation
        if((cipherString.isEmpty()) || (uncipheredValues.isEmpty())){
            return false;
        }

        // if cipherKey and uncipheredValues length are not the same it will fail validation
        if(cipherKey.length() != uncipheredValues.length()){
            return false;
        }

        // check to see if all values in cipherString matches with a value in cipherKey
        for(int x = 0; x < cipherString.length(); x++){ // for loop to check each individual value in cipherString
            boolean check = false;
            for(int i = 0; i < cipherKey.length(); i++){ // iterates through each individual value in cipherKey
                if(cipherString.charAt(x) == cipherKey.charAt(i)) { // if the value of cipherString is equal to value of cipherKey break out of the for loop and change check to true
                    check = true;
                    break;
                }
            }

            // if check is false will return false
            if(!check){
                return false;
            }
        }

        // if fully iterates through the cipherString and all characters matched with a value in cipherKey return true
        return true;
    }

    // decipherString method
    public static String decipherString(String cipherString, String cipherKey, String uncipheredValues){
        String decipheredString = "";

        // for loop to match cipherString value with a cipherKey value
        for(int x = 0; x < cipherString.length(); x++){
            for(int i = 0; i < cipherKey.length(); i++){
                if(cipherString.charAt(x) == cipherKey.charAt(i)){ // if cipherKye and cipherString match add uncipheredValue into decipheredString to get the correct string
                    decipheredString += uncipheredValues.charAt(i);
                }
            }
        }
        return decipheredString;
    }
}
