import org.junit.*;

import static org.junit.Assert.*;
public class ReverseStringCheckerTest {

    ReverseStringChecker reverseStringChecker;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before Class");
        ReverseStringChecker reverseStringChecker = new ReverseStringChecker();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Class");
        reverseStringChecker = null;
    }
    //Given String Should Return Reverse Of That String.
    @Test
    public void  givenStringShouldReturnReverseString(){
        //act
        String actualvalue = reverseStringChecker.stringReverse("Manish");
        //assert
        assertEquals("hsinaM",actualvalue);
    }
    //Given String Should Return Reverse String And Checks For Not Palindrome
    @Test
    public void givenStringShouldReturnReverseStringAndChecksNotPalindrome(){

        String actualvalue = reverseStringChecker.stringReverse("Manish");

        assertEquals("Not Palindrome",actualvalue);
    }

    //Given String Should Return Reverse String And Checks For Palindrome
    @Test
    public void  givenStringShouldReturnReverseStringAndcheckPalindrome(){

        String actualvalue = reverseStringChecker.stringReverse("mom");

        assertEquals("Palindrome",actualvalue);
    }
    //Given Integer Should Return Error
    @Test
    public void  givenIntegerShouldReturnError(){

        String actualvalue = reverseStringChecker.stringReverse(4);

        assertEquals("Integer Not Allowed",actualvalue);
    }
    //Given Null Should Return Error Message
    @Test
    public void  givenNullShouldReturnErrorMessage(){

        String actualvalue = reverseStringChecker.stringReverse(null);
        assertNotNull(actualvalue);

        assertEquals("Null Value Not Allowed",actualvalue);
    }

}