package dev.kennethgjohnson.mtpc.basics;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {
  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    App.main(arguments);
    assertTrue(true);
  }
}
