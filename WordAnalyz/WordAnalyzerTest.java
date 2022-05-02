package Exercise_Test_3;

import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordAnalyzerTest {
    @Test
    public void firstRepeatedCharacterTestPass() {
        WordAnalyzer obj = new WordAnalyzer("amir hossein ansari");
        char res = obj.firstRepeatedCharacter();
        assertEquals(res, 's');
    }

    @Test
    public void firstRepeatedCharacterTestFail() {
        WordAnalyzer obj = new WordAnalyzer("amir");
        int res = obj.firstRepeatedCharacter();
        assertEquals(res, 0);
    }

    @Test
    public void firstMultipleCharacterPass() {
        WordAnalyzer obj = new WordAnalyzer("amir hossein ");
        char res = obj.firstMultipleCharacter();
        assertEquals(res, 'i');
    }

    @Test
    public void firstMultipleCharacterFail() {
        WordAnalyzer obj = new WordAnalyzer("amir");
        char res = obj.firstMultipleCharacter();
        assertEquals(res, 0);
    }

    @Test
    public void countRepeatedCharactersTest() {
        WordAnalyzer obj = new WordAnalyzer("mississippi!!!");
        int res = obj.countRepeatedCharacters();
        assertEquals(res, 4);
    }

    @Test
    public void countRepeatedCharactersTestFail() {
//        i cant
        WordAnalyzer obj = new WordAnalyzer("mmmii");
        int res = obj.countRepeatedCharacters();
        assertEquals(res, 2);
    }
}
