package dev.kennethgjohnson.mtpc.basics.concurrency;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SequentialProcessingAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    SequentialProcessingApp.main(arguments);
    assertTrue(true);
  }
}
