package dev.kennethgjohnson.mtpc.basics.concurrency.semaphore;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BasicSemaphoreAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    BasicSemaphoreApp.main(arguments);
    assertTrue(true);
  }
}