package dev.kennethgjohnson.mtpc.basics.concurrency.normallocks;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConcurrentProcessingWithSyncronizedMethodsAppTest {
  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ConcurrentProcessingWithSyncronizedMethodsApp.main(arguments);
    assertTrue(true);
  }
}