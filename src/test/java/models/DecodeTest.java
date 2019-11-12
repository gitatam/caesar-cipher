package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {
    private Decode testDecode;
    private final String expectedCipheredText = "QEB NRFZH";
    private final int expectedShiftKey = 23;

    @Test
    public void newDecoding_instantiatesCorrectly() {
        testDecode = new Decode(expectedCipheredText, expectedShiftKey);
        assertTrue(true);
    }

    @Test
    public void newDecode_getsCipheredText_expectedCipheredText() {
        testDecode = new Decode(expectedCipheredText, expectedShiftKey);
        String actualCipheredText = testDecode.getCipheredText();
        assertEquals(expectedCipheredText, actualCipheredText);
    }

    @Test
    public void newEncode_getsShiftKey_expectedShiftKey() {
        testDecode = new Decode(expectedCipheredText, expectedShiftKey);
        int actualShiftKey = testDecode.getShiftKey();
        assertEquals(expectedShiftKey, actualShiftKey);
    }

    @Test
    public void runEncrypt_ifEncryptsVariousInputs() {
        testDecode = new Decode(expectedCipheredText, expectedShiftKey);
        String expectedRawText = "THE QUICK";
        assertEquals(expectedRawText, Decode.decrypt(testDecode));
    }

}
