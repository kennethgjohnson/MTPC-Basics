package dev.kennethgjohnson.mtpc.basics.concurrency;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ConcurrentProcessingWithSyncronizedBlocksWaitAndNotifyAppTest {
  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ConcurrentProcessingWithSyncronizedBlocksWaitAndNotifyApp.main(arguments);
    assertTrue(true);
  }
}