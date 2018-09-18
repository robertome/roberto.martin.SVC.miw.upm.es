package es.upm.miw.iwvg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C52Test {

    @Test
    public void testMA() {
        assertEquals("mA", new C52().mA());
    }
}
