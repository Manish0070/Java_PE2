import org.junit.*;

import static org.junit.Assert.*;
public class ReverseStringCheckerTest {

    ReverseStringChecker reverseStringChecker;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before Class");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Class");
    }


    @Test
    public void givenStringShouldReturnReverseString(){

        String actualvalue = reverseStringChecker.stringReverse("Manish");

        assertEquals("Not Palindrome",actualvalue);
    }

    @Test
    public void  givenStringShouldReturnReverseStringAndcheckPalindrome(){

        String actualvalue = reverseStringChecker.stringReverse("mom");

        assertEquals("Palindrome",actualvalue);
    }

}