package coding.practice.thread.InterThreadCommunication;


public class PrintOddTask implements Runnable {

	PrinterTest printer;
	int max;

	PrintOddTask(PrinterTest printer, int max) {
		this.printer = printer;
		this.max = max;
	}

	@Override
	public void run() {
		System.out.println("PrintOddTask started");
		for (int i = 1; i <= max; i += 2) {
			System.out.println(">>" + i);
			printer.printOdd(i);
		}

	}
}
