
import module5_3.task2.StringManipulator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {
    @Test
    void canConcatenate() {
        StringManipulator sm = new StringManipulator();
        assertEquals("Hello world", sm.concatenate("Hello ", "world"));
    }

    @Test
    void canFindLenght() {
        StringManipulator sm = new StringManipulator();
        assertEquals(11, sm.findLenght("Hello world"));
    }

    @Test
    void canConvertToUppercase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("HELLO WORLD", sm.convertToUppercase("Hello world"));
    }

    @Test
    void canConvertToLowerCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("hello world", sm.convertToLowerCase("Hello world"));
    }

    @Test
    void canCheckIfContainsSubString() {
        StringManipulator sm = new StringManipulator();
        assertTrue(sm.containsSubString("Hello world", "world"));
        assertFalse(sm.containsSubString("Hello world", "WORLD"));
    }
}
