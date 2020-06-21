package dev.kennethgjohnson.mtpc.basics.concurrency;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ConcurrentProcessingWithSyncronizedBlocksAppTest {
  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ConcurrentProcessingWithSyncronizedBlocksApp.main(arguments);
    assertTrue(true);
  }
}