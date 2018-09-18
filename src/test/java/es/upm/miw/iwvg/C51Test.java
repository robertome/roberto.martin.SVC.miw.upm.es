package es.upm.miw.iwvg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C51Test {

    @Test
    public void testM1() {
        assertEquals("m1", new C51().m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2", new C51().m2());
    }
}
