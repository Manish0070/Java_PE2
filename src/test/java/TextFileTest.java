import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextFileTest {

    @Before
    public void setUp() throws Exception {
        TextFile textFile = new TextFile();
    }

    @After
    public void tearDown() throws Exception {
        textFile = null;
    }

    @Test
    public void givenATextFileInputShouldReturnUpperString(){

       String filePath ="/home/cgi/test.txt";
       int lengthOfFile =10 ;
       String fileContent = "abcdefghij";

        String actualvalue = textFile.textFileFunction(filePath,lengthOfFile,fileContent);

        assertEquals("ABCDEFGHIJ",actualvalue);
    }
}