package es.upm.miw.iwvg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C12Test {

    @Test
    public void testMA() {
        assertEquals("mA", new C12().mA());
    }
}
