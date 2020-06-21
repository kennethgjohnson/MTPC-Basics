package dev.kennethgjohnson.mtpc.basics.concurrency.reentrantlocks;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ReentrantLocksAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    ReentrantLocksApp.main(arguments);
    assertTrue(true);
  }
}