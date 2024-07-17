package coding.practice.thread.InterThreadCommunication;

public class PrinterTest {

	boolean evenFlag = false;

	public void printEven(int number) {
		System.out.println("PrinterTest - printEven method called");
		synchronized (this) {
			while(!evenFlag) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " - " + number);

			evenFlag = false;
			notify();
			// notifyAll();
		}
	}

	public void printOdd(int number) {
		// System.out.println("PrinterTest - printOdd method called");
		synchronized (this) {
			while(evenFlag) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " - " + number);

				evenFlag = true;
				notify();
				// notifyAll();
			}
		}
	}

	public static void main(String[] args) {

		PrinterTest printer = new PrinterTest();

		Thread t1 = new Thread(new PrintOddTask(printer, 10), "Odd");

		Thread t2 = new Thread(new PrintEvenTask(printer, 10), "Even");

		// Thread t1 = new Thread(new PrintOddTask(printer, 10));

		// Thread t2 = new Thread(new PrintEvenTask(printer, 10));

		t1.start();
		t2.start();
	}

}
