package dev.kennethgjohnson.mtpc.basics.concurrency;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ConcurrentProcessingAppTest {

    @Test
    public void shouldBeAbleToExecuteMainWithoutException() {
        String[] arguments = {};
        SequentialProcessingApp.main(arguments);
        assertTrue(true);
    }
}
