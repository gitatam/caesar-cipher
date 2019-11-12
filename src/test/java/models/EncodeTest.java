package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {
    private Encode testEncode;
    private final String expectedRawText = "THE QUICK";
    private final int expectedShiftKey = 23;

    @Test
    public void newEncoding_instantiatesCorrectly() {
        testEncode = new Encode(expectedRawText, expectedShiftKey);
        assertTrue(true);
    }

    @Test
    public void newEncode_getsRawText_expectedRawText() {
        testEncode = new Encode(expectedRawText, expectedShiftKey);
        String actualRawText = testEncode.getRawText();
        assertEquals(expectedRawText, actualRawText);
    }

    @Test
    public void newEncode_getsShiftKey_expectedShiftKey() {
        testEncode = new Encode(expectedRawText, expectedShiftKey);
        int actualShiftKey = testEncode.getShiftKey();
        assertEquals(expectedShiftKey, actualShiftKey);
    }

    @Test
    public void runEncode_ifEncodesInputText_expectedCipheredText() {
        testEncode = new Encode(expectedRawText, expectedShiftKey);
        String expectedCipheredText = "QEB NRFZH";
        assertEquals(expectedCipheredText, Encode.cipherText(testEncode));
    }

}
