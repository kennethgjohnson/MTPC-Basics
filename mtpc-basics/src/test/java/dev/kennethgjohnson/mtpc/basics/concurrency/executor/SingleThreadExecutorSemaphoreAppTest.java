package dev.kennethgjohnson.mtpc.basics.concurrency.executor;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SingleThreadExecutorSemaphoreAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    SingleThreadExecutorSemaphoreApp.main(arguments);
    assertTrue(true);
  }
}