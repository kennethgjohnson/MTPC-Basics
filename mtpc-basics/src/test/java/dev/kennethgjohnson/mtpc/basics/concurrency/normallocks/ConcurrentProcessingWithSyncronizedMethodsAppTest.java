package dev.kennethgjohnson.mtpc.basics.concurrency.normallocks;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ConcurrentProcessingWithSyncronizedMethodsAppTest {
  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ConcurrentProcessingWithSyncronizedMethodsApp.main(arguments);
    assertTrue(true);
  }
}