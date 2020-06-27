package dev.kennethgjohnson.mtpc.basics.concurrency.executor;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CachedThreadPoolExecutorSemaphoreAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    CachedThreadPoolExecutorSemaphoreApp.main(arguments);
    assertTrue(true);
  }
}