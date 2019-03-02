
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainTest extends TestCase{


    private Main classUnderTest = new Main();


    public void testApp()
    {
        int result = 12232;
        assertEquals(result, classUnderTest.returnValue1());
    }

}
