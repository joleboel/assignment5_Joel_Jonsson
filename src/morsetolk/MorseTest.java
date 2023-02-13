package morsetolk;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MorseTest {

    @Test
    public void TestSetText(){
        Logic TexttoMorse = new Logic();
        String actual = TexttoMorse.translate("hej");
        String expected = "**** * *--- ";
        assertEquals(expected,actual);
    }
    @Test
    public void TestSetMorse(){
        Logic MorsetoText = new Logic();
        String actual = MorsetoText.translate("**** * *---");
        String expected = "HEJ";
        assertEquals(expected,actual);
    }
    @Test
    public void TestSetNum(){
    Logic nonLettertoMorse = new Logic();
    String actual = nonLettertoMorse.translate("1");
    String expected ="fel, använd endast engelska bokstäver eller morse tecken separerade med mellanrum";
    assertEquals(expected, actual);


    }
}
