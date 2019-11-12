import models.Encode;
import models.Decode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("WELCOME TO CLASSICAL ENCRYPTION\n*******CAESAR CIPHER*******\n--encoding and decoding--\n");
            System.out.println("Input your message: ");
            String userInput = br.readLine();

            System.out.println("Input shift key: ");
            int userShift = Integer.parseInt(br.readLine());

            System.out.println("Input String: " + userInput);

            Encode newCaesar = new Encode(userInput, userShift);
            String encrypted = Encode.cipherText(newCaesar);
            System.out.println("Encrypted String: " + encrypted);

            Decode caesar = new Decode(encrypted, userShift);
            String decrypted = Decode.decrypt(caesar);
            System.out.println("Decrypted String:  " + decrypted);

            System.out.println("\n");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
