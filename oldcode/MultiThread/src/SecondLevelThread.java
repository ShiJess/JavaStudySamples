
public class SecondLevelThread implements Runnable
{
	public static int CurrentSecondCount = 0;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.print("One SecontLevel Thread Over!\r\n");
			CurrentSecondCount--;
			System.out.print("CurrentSecondCount£º" + CurrentSecondCount+"\r\n");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}