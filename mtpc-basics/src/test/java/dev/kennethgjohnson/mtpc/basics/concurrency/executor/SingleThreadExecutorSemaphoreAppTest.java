package dev.kennethgjohnson.mtpc.basics.concurrency.executor;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SingleThreadExecutorSemaphoreAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    SingleThreadExecutorSemaphoreApp.main(arguments);
    assertTrue(true);
  }
}