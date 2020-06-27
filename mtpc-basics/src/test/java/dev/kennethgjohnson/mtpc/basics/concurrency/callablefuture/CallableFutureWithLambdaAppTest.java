package dev.kennethgjohnson.mtpc.basics.concurrency.callablefuture;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CallableFutureWithLambdaAppTest {

  @Test
  public void shouldBeAbleToExecuteMainWithoutException() {
    String[] arguments = {};
    CallableFutureWithLambdaApp.main(arguments);
    assertTrue(true);
  }
}