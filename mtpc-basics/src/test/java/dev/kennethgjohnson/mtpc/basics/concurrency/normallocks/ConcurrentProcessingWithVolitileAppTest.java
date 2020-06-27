package dev.kennethgjohnson.mtpc.basics.concurrency.normallocks;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConcurrentProcessingWithVolitileAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ConcurrentProcessingWithVolitileApp.main(arguments);
    assertTrue(true);
  }
}
