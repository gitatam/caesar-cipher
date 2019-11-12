package models;

public class Encode {

    private String rawText;
    private int shiftKey;


    public Encode(String rawText, int shiftKey) {
        this.rawText = rawText;
        this.shiftKey = shiftKey;
    }

    public static String cipherText(Encode encode) {
        StringBuilder sb = new StringBuilder();
        int length = encode.getRawText().length();
        for (int i = 0; i < length; i++) {
            char character = encode.getRawText().charAt(i);
            if (Character.isLetter(character)) {
                if (Character.isLowerCase(character)) {
                    char encodedCharacter = (char) (character + encode.getShiftKey());
                    if (encodedCharacter > 'z') {
                        sb.append((char) (character - (26 - encode.getShiftKey())));
                    } else {
                        sb.append(encodedCharacter);
                    }
                } else if (Character.isUpperCase(character)) {
                    char encodedCharacter = (char) (character + encode.getShiftKey());
                    if (encodedCharacter > 'Z') {
                        sb.append((char) (character - (26 - encode.getShiftKey())));
                    } else {
                        sb.append(encodedCharacter);
                    }
                }
            } else {
                sb.append(character);
            }
        }
        return sb.toString();
    }

    public String getRawText() {
        return this.rawText;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }

}
