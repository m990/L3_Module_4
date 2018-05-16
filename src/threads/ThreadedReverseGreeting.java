package threads;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	int threadCount = 50;
	public static void main(String[] args) {
		ThreadedReverseGreeting trg = new ThreadedReverseGreeting();
		
		Thread t = new Thread(() -> trg.createThread());
		
		t.start();
		
	}
	void createThread() {
		System.out.println("hello from thread " + threadCount);
		threadCount--;
		if (threadCount > 0) {
			Thread t = new Thread(() -> createThread());
			t.start();
		}
	}
}
