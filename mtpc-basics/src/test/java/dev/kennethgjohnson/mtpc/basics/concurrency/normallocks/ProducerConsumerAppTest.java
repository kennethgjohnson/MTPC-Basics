package dev.kennethgjohnson.mtpc.basics.concurrency.normallocks;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ProducerConsumerAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ProducerConsumerApp.main(arguments);
    assertTrue(true);
  }
}
