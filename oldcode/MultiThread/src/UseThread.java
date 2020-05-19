public class UseThread {

	public static void main(String[] args) {
		UseThread newthread = new UseThread();
		newthread.FirstLevelThread();

		newthread.WaitForAllThreadOver();
	}

	private void FirstLevelThread() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			MyThread th1 = new MyThread();
			Thread thread1 = new Thread(th1);
			thread1.start();
			MyThread.CurrentMyThreadCount++;
			System.out.print("CurrentFirstLevelThreadCount:"
					+ MyThread.CurrentMyThreadCount + "\r\n");
		}
		System.out.print("Now MainThread IsOver!\r\n");
	}

	private void WaitForAllThreadOver() {
		while (MyThread.CurrentMyThreadCount > 0) {
			continue;
		}
		System.out.print("AllThreadOver!\r\n");
	}

}
