import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pruet on 8/8/2559.
 */
public class Hw1_1Test {
    private Hw1_1 h;
    @Before
    public void setUp() throws Exception {
        h = new Hw1_1();
    }

    @Test
    public void countEvenNumSingleOdd() throws Exception {
        int[] inputs = {5};
        assertEquals(0, h.countEvenNum(inputs));
    }

    @Test
    public void countEvenNumSingleEven() throws Exception {
        int[] inputs = {4};
        assertEquals(1, h.countEvenNum(inputs));
    }

    @Test
    public void countEvenNumMultiple() throws Exception {
        int[] inputs = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(3, h.countEvenNum(inputs));
    }

}