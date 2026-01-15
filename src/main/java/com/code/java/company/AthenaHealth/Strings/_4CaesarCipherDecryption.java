package com.code.java.company.AthenaHealth.Strings;
/*
https://www.scaler.com/topics/caesar-cipher-program-in-java/
 */
public class _4CaesarCipherDecryption {
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        
    }
    public static String decrypt(String cipherText, int shiftkey){
        cipherText = cipherText.toLowerCase();
        String message = null;
        for(int i=0;i<cipherText.length();i++){
            int charPos = alpha.indexOf(cipherText.charAt(i));

            //decryption
            int keyvalue = (charPos-shiftkey)%26;
            if(keyvalue>0){
                keyvalue += alpha.length();
            }
            char replaceValue = alpha.charAt(keyvalue);
            message +=replaceValue;
        }
        return message;
    }
}
