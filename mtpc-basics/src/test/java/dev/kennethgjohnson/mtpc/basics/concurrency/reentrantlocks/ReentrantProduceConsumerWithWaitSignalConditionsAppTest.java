package dev.kennethgjohnson.mtpc.basics.concurrency.reentrantlocks;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ReentrantProduceConsumerWithWaitSignalConditionsAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ReentrantProduceConsumerWithWaitSignalConditionsApp.main(arguments);
    assertTrue(true);
  }
}