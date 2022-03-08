package my


import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class JSayGTest {

    @Test
    public void test_hello() {
        JSay jg = new JSay();
        assertEquals("Hello, world", jg.hello("world"))
    }
}
