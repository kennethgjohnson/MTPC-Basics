package dev.kennethgjohnson.mtpc.basics;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void shouldBeAbleToExecuteMainWithoutException() {
        String[] arguments = {};
        App.main(arguments);
        assertTrue(true);
    }
}
