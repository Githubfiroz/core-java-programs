package coding.practice.thread.InterThreadCommunication;


public class PrintEvenTask implements Runnable {
	PrinterTest printer;
	int max;

	PrintEvenTask(PrinterTest printer, int max) {
		this.printer = printer;
		this.max = max;
	}

	@Override
	public void run() {
		System.out.println("PrintEvenTask started");

		for (int i = 2; i <= max; i += 2) {
			System.out.println(">>" + i);
			printer.printEven(i);
		}
	}
	
}
