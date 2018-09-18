package es.upm.miw.iwvg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C22Test {

    @Test
    public void testMA() {
        assertEquals("mA", new C22().mA());
    }

}
