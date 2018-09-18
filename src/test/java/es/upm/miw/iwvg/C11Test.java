package es.upm.miw.iwvg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C11Test {

    @Test
    public void testM1() {
        assertEquals("m1()", new C11().m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2", new C11().m2());
    }

}
