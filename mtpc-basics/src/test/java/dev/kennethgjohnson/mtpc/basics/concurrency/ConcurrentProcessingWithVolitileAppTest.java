package dev.kennethgjohnson.mtpc.basics.concurrency;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ConcurrentProcessingWithVolitileAppTest {

    @Test
    public void shouldBeAbleToExecuteMainWithoutException() {
        String[] arguments = {};
        ConcurrentProcessingWithVolitileApp.main(arguments);
        assertTrue(true);
    }
}
