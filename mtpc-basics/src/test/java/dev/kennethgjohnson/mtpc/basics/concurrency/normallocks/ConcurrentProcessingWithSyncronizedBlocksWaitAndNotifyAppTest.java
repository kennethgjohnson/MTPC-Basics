package dev.kennethgjohnson.mtpc.basics.concurrency.normallocks;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConcurrentProcessingWithSyncronizedBlocksWaitAndNotifyAppTest {
  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ConcurrentProcessingWithSyncronizedBlocksWaitAndNotifyApp.main(arguments);
    assertTrue(true);
  }
}