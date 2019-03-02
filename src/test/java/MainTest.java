
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest extends TestCase{

    private ClassX classUnderTest;

    public void setUp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        classUnderTest = (ClassX) ctx.getBean("classX");
    }


    @Test
    public void testAdd() {
        int result = classUnderTest.add(5,5);
        assertEquals(result,10);
    }

    @Test
    public void testDrives() {
        boolean result = classUnderTest.drives(true);
        assertEquals(result,false);
    }

}
