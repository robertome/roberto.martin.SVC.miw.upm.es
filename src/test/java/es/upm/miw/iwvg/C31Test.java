package es.upm.miw.iwvg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C31Test {

    @Test
    public void testM1() {
        assertEquals("m1", new C31().m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2", new C31().m2());
    }

    @Test
    public void testMB() {
        assertEquals("mB", new C31().mB());
    }
}
