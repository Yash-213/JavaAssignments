package threads;

public class DownloadDemo extends Thread {
	public void run() {
	    int t = 0;

	    // Loop runs 6 times (0 to 5) to simulate download progress
	    for (int i = 0; i <= 5; i++) {

	        // Display current download percentage
	        System.out.println("Downloading... " + t + "%");

	        try {
	            // Pause thread for 500 milliseconds
	            Thread.sleep(500);
	        } catch (Exception e) {
	            // Exception handling (ignored here)
	        }

	        // Increase progress by 20%
	        t += 20;
	    }

	    // Print completion message with current thread name
	    System.out.println(Thread.currentThread().getName() + " Downloading Completed!!");
	}

	public static void main(String[] args) {

	    // Create two thread objects
	    DownloadDemo demo = new DownloadDemo();
	    DownloadDemo demo2 = new DownloadDemo();

	    // Assign custom names to threads
	    demo.setName("Aditya");
	    demo2.setName("Mayuresh");

	    // Set thread priorities
	    // MIN_PRIORITY = 1 (lowest priority)
	    demo.setPriority(MIN_PRIORITY);

	    // MAX_PRIORITY = 10 (highest priority)
	    demo2.setPriority(MAX_PRIORITY);

	    // Note:
	    // Thread priority is only a scheduling hint to JVM/OS.
	    // It does NOT guarantee execution order.

	    // Start first thread
	    demo.start();

	    /*
	     * join() makes the current thread (main thread)
	     * wait until 'demo' finishes execution.
	     * If join() is used, demo2 will start only after
	     * demo completes its work.
	     */
	    // try {
	    //     demo.join();
	    // } catch (Exception e) {}

	    // Start second thread
	    demo2.start();

	    /*
	     * Without join():
	     * Both threads run concurrently (multithreading).
	     *
	     * With join():
	     * demo executes completely first,
	     * then demo2 starts.
	     */
	}
}
