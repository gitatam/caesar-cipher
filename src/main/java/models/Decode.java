package models;

public class Decode {

    private String cipheredText;
    private int shiftKey;


    public Decode(String cipheredText, int shiftKey) {
        this.cipheredText = cipheredText;
        this.shiftKey = shiftKey;
    }

    public static String decrypt(Decode decode)
    {

        StringBuilder encryptedText = new StringBuilder();
        int length = decode.getCipheredText().length();
        for(int i = 0; i < length; i++){
            char myCharacter = decode.getCipheredText().charAt(i);
            if(Character.isLetter(myCharacter)){
                if(Character.isLowerCase(myCharacter)){
                    char newCharacter = (char)(myCharacter - decode.getShiftKey());
                    if(newCharacter < 'a'){
                        encryptedText.append((char) (myCharacter + (26 - decode.getShiftKey())));
                    }
                    else {
                        encryptedText.append(newCharacter);
                    }
                }
                else if(Character.isUpperCase(myCharacter)){
                    char newCharacter = (char)(myCharacter - decode.getShiftKey());
                    if(newCharacter < 'A'){
                        encryptedText.append((char) (myCharacter + (26 - decode.getShiftKey())));
                    }
                    else {
                        encryptedText.append(newCharacter);
                    }
                }
            }
            else {
                encryptedText.append(myCharacter);
            }
        }
        return encryptedText.toString();
    }

    public String getCipheredText() {
        return this.cipheredText;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }
}
