import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextFileTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenATextFileInputShouldReturnUpperString(){

        TextFile textFile = new TextFile();

        String actualvalue = textFile.textFileFunction()
    }
}