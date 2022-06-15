import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCharacter {

    @Test
    public void testWhiteSpace(){
        assertEquals(true,Character.isWhitespace('\n'));
        assertEquals(true, Character.isWhitespace('\t'));
        assertEquals(false, Character.isWhitespace('\b'));
    }
    @Test
    public void testRestriction(){
        assertEquals(true, Character.isJavaIdentifierPart('a'));
    }
}
