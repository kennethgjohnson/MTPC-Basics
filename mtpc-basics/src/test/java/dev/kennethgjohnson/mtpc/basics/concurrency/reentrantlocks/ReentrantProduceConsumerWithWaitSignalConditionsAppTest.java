package dev.kennethgjohnson.mtpc.basics.concurrency.reentrantlocks;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ReentrantProduceConsumerWithWaitSignalConditionsAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ReentrantProduceConsumerWithWaitSignalConditionsApp.main(arguments);
    assertTrue(true);
  }
}