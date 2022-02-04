import static org.junit.Assert.*;
import org.junit.*;
 
public class skilltest {
    @Test
    public void testTry(){
        assertEquals("Output is right", skilldem.testMethod("wrong"));
    }
   
}
