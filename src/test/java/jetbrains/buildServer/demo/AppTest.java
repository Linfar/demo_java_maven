package jetbrains.buildServer.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class AppTest
{
    private App app;

    @BeforeAll
    public void setUp() {
        app = new App();
    }

    @Test
    public void testAlwaysTrue() {
        assertTrue(app.alwaysTrue());
    }

    @Test
    public void testAlwaysFalse() {
        assertFalse(app.alwaysFalse());
    }

    @Test
    public void testTenPercentTrue() {
        int trues = 0;
        for (int i = 0; i < 1000; i++) {
            if (app.tenPercentTrue()) trues++;
        }
        assertTrue(trues > 90 && trues < 110, trues + "");
    }

    @Test
    public void testNinetyPercentTrue() {
        int trues = 0;
        for (int i = 0; i < 1000; i++) {
            if (app.ninetyPercentTrue()) trues++;
        }
        assertTrue(trues > 890 && trues < 910, trues + "");
    }
}
