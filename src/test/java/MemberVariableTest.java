import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Before Class");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Class");
    }

    @Test
    public void givenAnArrayShouldReturnElementsOfArray() {
        MemberVariable memberVariable = new MemberVariable();
        String[] expectedArray = { "Manish", "22", "22000" };
        String[] actualvalue = memberVariable.memberDetails("Manish",22,22000);
        assertArrayEquals(expectedArray,actualvalue);
    }
}