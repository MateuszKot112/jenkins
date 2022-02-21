

import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {
    @Test
    protected void testConcatenate() {
        int x;
        Main main = new Main();
        x = main.dupa(5);

//        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", x);

    }
}

