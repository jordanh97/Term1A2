
import junit.framework.TestCase;

public class MainTest extends TestCase{

    private Main classUnderTest = new Main();

    public void testApp()
    {
        int result = classUnderTest.add(10,20);
        assertEquals("Add 2+3", 30, result);
    }

}
