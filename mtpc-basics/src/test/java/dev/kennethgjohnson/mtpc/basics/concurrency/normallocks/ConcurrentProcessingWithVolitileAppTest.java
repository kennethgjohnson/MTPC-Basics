package dev.kennethgjohnson.mtpc.basics.concurrency.normallocks;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ConcurrentProcessingWithVolitileAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ConcurrentProcessingWithVolitileApp.main(arguments);
    assertTrue(true);
  }
}
