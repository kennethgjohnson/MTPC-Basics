package dev.kennethgjohnson.mtpc.basics.concurrency;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ProducerConsumerAppTest {

    @Test
    public void shouldBeAbleToExecuteMainWithoutException() {
        String[] arguments = {};
        ProducerConsumerApp.main(arguments);
        assertTrue(true);
    }
}
