package Exercise_Test_3;

/**
 * A class that analyzes words.
 */

public class WordAnalyzer {

    private String word;

    /**
     * Constructs an analyzer for a given word.
     *
     * @param aWord the word to be analyzed.
     */
    public WordAnalyzer(String aWord) {
        word = aWord;
    }

    /**
     * Gets the first repeated character. A character is repeated
     * if it occurs at least twice in adjacent positions. For example,
     * 'l' is repeated in "hollow", but 'o' is not.
     *
     * @return the first repeated character, or 0 if none found.
     */
    public char firstRepeatedCharacter() {

        for (int i = 0; i < word.length() - 1; i++) {
            char ch = word.charAt(i);
//            FIXED by amir ansari
            if (ch == word.charAt(i + 1))
                return ch;
        }

        return 0;
    }

    /**
     * Gets the first multiply occurring character. A character is multiple
     * if it occurs at least twice in the word, not necessarily in adjacent positions.
     * For example, both 'o' and 'l' are multiple in "hollow", but 'h' is not.
     *
     * @return the first repeated character, or 0 if none found.
     */
    public char firstMultipleCharacter() {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (find(ch, i) >= 0)
                return ch;
        }

        return 0;
    }

    private int find(char c, int pos) {
//        FIXED by amir ansari
        for (int i = pos + 1; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Counts the groups of repeated characters. For example, "mississippi!!!" has
     * four such groups: ss, ss, pp and !!!.
     *
     * @return the number of repeated character groups.
     */
    public int countRepeatedCharacters() {
        int c = 0;
        for (int i = 1; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                if (word.charAt(i) != word.charAt(i - 1))
                    c++;
            }
        }

        return c;
    }

}