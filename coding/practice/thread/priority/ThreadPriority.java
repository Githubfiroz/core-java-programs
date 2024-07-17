package coding.practice.thread.priority;

public class ThreadPriority extends Thread {

	// MAX_PRIORITY -> 10
	// NORM_PRIORITY -> 5
	// MIN_PRIORITY -> 1

	public void run() {
		System.out.println("Running Thread Name :" + Thread.currentThread().getName());
		System.out.println("Running Thread Priority :" + Thread.currentThread().getPriority());

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();

		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);

		t1.start();
		t2.start();
	}

}

// without priority
// Running Thread Name :Thread-0
// Running Thread Priority :5
// Running Thread Name :Thread-1
// Running Thread Priority :5

// After priority
// Running Thread Name :Thread-0
// Running Thread Name :Thread-1
// Running Thread Priority :1
// Running Thread Priority :10
