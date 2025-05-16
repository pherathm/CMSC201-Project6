
/*
 * Class: CMSC201
 * Instructor: Amanullah Khalid
 * Description: JUnit test for String methods
 * Due: 05/12/2025
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Piushani Ellegala
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class StringTest {

    @Test
    public void testLength() {
        String str = "hello";
        assertEquals(5, str.length());
    }

    @Test
    public void testCharAt() {
        String str = "world";
        assertEquals('w', str.charAt(0));
        assertEquals('d', str.charAt(4));
    }

    @Test
    public void testSubstring() {
        String str = "university";
        assertEquals("vers", str.substring(3, 7));
    }

    @Test
    public void testIndexOf() {
        String str = "banana";
        assertEquals(1, str.indexOf('a'));
        assertEquals(2, str.indexOf("na"));
        assertEquals(-1, str.indexOf("x"));
    }
}
