import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable memberVariable;
    @Before
    public void setUp() throws Exception {

        System.out.println("Before Class");
        MemberVariable memberVariable = new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Class");
        memberVariable = null;
    }

    @Test
    public void givenAnArrayShouldReturnElementsOfArray() {
        String[] expectedArray = { "Manish", "22", "22000" };
        String[] actualvalue = memberVariable.memberDetails("Manish",22,22000);
        assertArrayEquals(expectedArray,actualvalue);
    }
    //Given A Input Array And Function Should Return An Error Message .Beacuase Function Passing null.
    @Test
    public void givenAnArrayShouldReturnError() {
        String[] expectedArray = { "Manish", "22", "22000" };
        String[] actualvalue = memberVariable.memberDetails(null,22,22000);
        assertNotNull(actualvalue);
        assertArrayEquals(expectedArray,actualvalue);
    }
}