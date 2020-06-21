# MTPC-Basics
Refreshing basic multithreading and parrallel computing in Java.

So far includes -

*NORMAL LOCKS:*
* SequentialProcessingApp
  * non threaded implementation
  
* ConcurrentProcessingApp
  * Demonstrates how to create runable's with threads running them.
  * Dmonstrates how to extend threads and create run implementations for them.
  * Demonstrates how join works where one thread waits on the completion of another.
  
* ConcurrentProcessingWithVolitileApp
  * Under normal execution the processor may reference the value of a variable direct from it's cache, this is a problem when another thread references the same variable on another processor, to resolve this mark the variable as volitile, this tells the program to go fetch it from the main ram memory, however this is expensive and should be used sparingly.
  * Demonstrates the use of the volitile keyword.
  
* ConcurrentProcessingWithSyncronizedMethodsApp
  * When two threads are interacting with a single variable value with non atomic operations it can create situations where values / actions are discarded and itterations of increments skipped working on the value, to mitigate this thread syncronization is applied in that it will syncronized on a lock.
  * Demonstrates the use of syncronize keyword on methods: this performs a lock on the class/instance object and would block other syncronize method calls in the same class even if it does not manipulate/access the same values.

* ConcurrentProcessingWithSyncronizedBlocksApp
  * Demonstrates the use of syncronize blocks on locks used explicitly for specific variables allowing multiple methods in the same class to be called concurrently even though they both require syncronization for their respective variables being manipulated.

* ConcurrentProcessingWithSyncronizedBlocksWaitAndNotifyApp
  * Demonstrates the use of notify and wait, with detailed logs showing how locks are made and released, and how wait sleeps a thread and notfiy signals a syncronize block to send a wake to waiting threads.
  * Execution order tutorial basically for syncronized/wait/notify

* ProducerConsumerApp
  * Demonstrates the use of notify and wait, and while loop with a stop signal.
  * Shows how wait will also engage notify signals instead of going to the end of a syncronize block.

*Reentrant LOCKS:*
* ReentrantLocksApp
  * Demonstrates the use of reentrant locks.
  * The main difference of reentrant lock (at least what I can see) is they don't need interupted exception blocks.
  * Demonstrates how to use lambda runnables as arguments.
  * Reentrant locks also have a "fairness" parameter argument that if specified as true will make the lock pass to the longest waiting thread rather than a random one when released.
  
  
  
  
  
  
  
  
  
  
  
  
