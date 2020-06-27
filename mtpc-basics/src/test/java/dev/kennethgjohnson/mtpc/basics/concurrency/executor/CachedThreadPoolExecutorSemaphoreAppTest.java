package dev.kennethgjohnson.mtpc.basics.concurrency.executor;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CachedThreadPoolExecutorSemaphoreAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    CachedThreadPoolExecutorSemaphoreApp.main(arguments);
    assertTrue(true);
  }
}