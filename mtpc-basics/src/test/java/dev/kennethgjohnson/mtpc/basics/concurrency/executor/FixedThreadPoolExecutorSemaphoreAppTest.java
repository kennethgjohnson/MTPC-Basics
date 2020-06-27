package dev.kennethgjohnson.mtpc.basics.concurrency.executor;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FixedThreadPoolExecutorSemaphoreAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    FixedThreadPoolExecutorSemaphoreApp.main(arguments);
    assertTrue(true);
  }
}