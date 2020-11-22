import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import recursion_task.Recursion;

public class RecursionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void recursionMethodTest(){

        Recursion recursion = new Recursion();
        String expected = recursion.recursionMethod("Hello world, this is recursion method!!");

        String actual = "H*e*ll*o w*o*rld, th*i*s i*s r*e*c*u*rs*i*o*n m*e*th*o*d!!";

        Assert.assertEquals(expected, actual);
    }

}
