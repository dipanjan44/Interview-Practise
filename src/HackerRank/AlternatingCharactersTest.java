package HackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingCharactersTest {

    @Test
    public void hasAlternate()
    {
        AlternatingCharacters alt = new AlternatingCharacters();

        assertEquals(6,alt.alternatingCharacters("aabbbbbcc"));
    }

    @Test
    public void hasNoAlternate()
    {
        AlternatingCharacters alt = new AlternatingCharacters();

        assertEquals(0,alt.alternatingCharacters("abc"));
    }

}