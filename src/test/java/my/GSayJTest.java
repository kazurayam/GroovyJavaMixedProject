package my;

import org.junit.jupiter.api.Test;
import my.GSay;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GSayJTest {

    @Test
    public void test_hello() {
        GSay gg = new GSay();
        assertEquals("Hello, world", gg.hello("world"));
    }
}
