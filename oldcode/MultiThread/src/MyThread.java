public class MyThread implements Runnable {

	public static int CurrentMyThreadCount = 0;

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				SecondLevelThread th1 = new SecondLevelThread();
				Thread thread1 = new Thread(th1);
				thread1.start();
				SecondLevelThread.CurrentSecondCount++;
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// �ȴ���һ���߳�ȫ��ִ���꣬���̲߳�����ȫ����
		while (SecondLevelThread.CurrentSecondCount > 0) {
			continue;
		}
		System.out.print("One FirstLevel Thread Over!\r\n");
		CurrentMyThreadCount--;
		System.out.print("CurrentMyThreadCount��" + CurrentMyThreadCount
				+ "\r\n");
	}
}
