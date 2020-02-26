import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.Math;


class PuissTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void racineCarre() {
        Puiss p = new Puiss(1, 3);
        double[] t = new double[3];
        p.racineCarre(t);
        assertEquals(Math.sqrt(1), t[0], 0.001);
        assertEquals(Math.sqrt(2), t[1], 0.001);
        assertEquals(Math.sqrt(3), t[2], 0.001);
    }

    @Test
    void testZero() {
        Puiss p = new Puiss(0, 0);
        double[] t = new double[1];
        p.racineCarre(t);
        assertEquals(Math.sqrt(0), t[0], 0.001);
    }

    @Test
    void testNeg() {
        Puiss p = new Puiss(-2, -2);
        double[] t = new double[1];
        p.racineCarre(t);
        System.out.println(Math.sqrt(-2));
        assertEquals(Math.sqrt(-2), t[0], 0.001);
    }

}
