package dev.kennethgjohnson.mtpc.basics.concurrency.executor;

import java.util.concurrent.Semaphore;

/**
 * Based on BasicSemaphoreApp downloader keeps concurrency to 4.
 */
public enum Downloader {
  INSTANCE;

  private final Semaphore allowedConcurrentDownloadAttempts = new Semaphore(4, true);

  public void Download(int blockNumber) throws InterruptedException {
    try {
      System.out
          .println(String.format("Downloader for block %d: aquiring semaphore resource for download...", blockNumber));
      allowedConcurrentDownloadAttempts.acquire();
      System.out.println(String.format("Downloader for block %d: semaphore aquired.", blockNumber));
      downloadNextFileChunk(blockNumber);
    } finally {
      System.out
          .println(String.format("Downloader for block %d: aquiring semaphore resource for download...", blockNumber));
      allowedConcurrentDownloadAttempts.release();
    }

  }

  private void downloadNextFileChunk(int blockNumber) throws InterruptedException {
    System.out.println(String.format("Downloader for block %d: Fake Downloading block %d ", blockNumber, blockNumber));
    System.out.println(
        String.format("Downloader for block %d: simulating fake thread sleep for non blocking IO...", blockNumber));
    Thread.sleep(2000);
    System.out.println(String.format("Downloader for block %d: waking up.", blockNumber));
    System.out.println(String.format("Downloader for block %d: download completed.", blockNumber));
  }

}