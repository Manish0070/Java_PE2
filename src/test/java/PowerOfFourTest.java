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
    //Given Integer Should Return It Is Power Of Four
    @Test
    public void givenIntegerShouldReturnPowerOfFour(){
        //act
        String actualvalue = powerOfFour.powerFunction(16);
        //assert
        assertEquals("Power Of Four",actualvalue);
    }
    //Given Integer Should Return Not A Power Of Four
    @Test
    public void givenIntegerShouldReturnNotAPowerOfFour(){
        //act
        String actualvalue = powerOfFour.powerFunction(20);
        //assert
        assertEquals("Not A Power Of Four",actualvalue);
    }

    @Test
    public void givenNegativeIntegerShouldReturnErrorMessage(){

        String actualvalue = powerOfFour.powerFunction(-9);

        assertEquals("Should Not Be A Negative Integer",actualvalue);
    }

}