import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2Test {
    private Hw1_2 h;
    @Before
    public void setUp() throws Exception {
        h = new Hw1_2();
    }

    @Test
    public void gpaCalculationSingleZero() throws Exception {
        int[] credit = {3};
        int[] grade  = {0};
        assertEquals(0.0f, h.gpaCalculation(credit, grade), 0);
    }

    @Test
    public void gpaCalculationSingleNoneZero() throws Exception {
        int[] credit = {3};
        int[] grade  = {4};
        assertEquals(4.0f, h.gpaCalculation(credit, grade), 0);
    }

    @Test
    public void gpaCalculationMultipleZero() throws Exception {
        int[] credit = {3, 3, 3};
        int[] grade  = {0, 0, 0};
        assertEquals(0.0f, h.gpaCalculation(credit, grade), 0);
    }

    @Test
    public void gpaCalculationMultipleNoneZero() throws Exception {
        int[] credit = {3, 3, 3};
        int[] grade  = {4, 4, 4};
        assertEquals(4.0f, h.gpaCalculation(credit, grade), 0);
    }

    @Test
    public void gpaCalculationMultiple() throws Exception {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        assertEquals(3.07f, h.gpaCalculation(credit, grade), 0.01f);
    }

}