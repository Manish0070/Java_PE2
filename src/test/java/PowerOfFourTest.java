import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
     PowerOfFour powerOfFour;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before Class");
        PowerOfFour powerOfFour = new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Class");
        powerOfFour=null;
    }
    @Test
    public void givenIntegerShouldReturnPowerOfFour(){

        String actualvalue = powerOfFour.powerFunction(16);

        assertEquals("Power Of Four",actualvalue);
    }
    @Test
    public void givenIntegerShouldReturnNotAPowerOfFour(){

        String actualvalue = powerOfFour.powerFunction(20);

        assertEquals("Not A Power Of Four",actualvalue);
    }
}