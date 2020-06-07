package dev.kennethgjohnson.mtpc.basics.concurrency;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ConcurrencyAppTest {

    @Test
    public void shouldBeAbleToExecuteMainWithoutException() {
        String[] arguments = {};
        ConcurrencyApp.main(arguments);
        assertTrue(true);
    }
}
