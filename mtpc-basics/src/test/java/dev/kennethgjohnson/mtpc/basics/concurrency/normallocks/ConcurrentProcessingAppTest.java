package dev.kennethgjohnson.mtpc.basics.concurrency.normallocks;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConcurrentProcessingAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ConcurrentProcessingApp.main(arguments);
    assertTrue(true);
  }
}
