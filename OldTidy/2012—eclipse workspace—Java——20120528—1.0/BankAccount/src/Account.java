
public class Account {
	public static double balance=0;
	public static void main(String args[])
	{
		Account aman=new Account();
		aman.go();
	}
	public void go()
	{
		SaveMoney save=new SaveMoney();
		TreadDraw draw=new TreadDraw();
		save.start();
		draw.start();
	}

}

class SaveMoney extends Thread
{
	public void Save()
	{
		Account.balance=Account.balance+10;//�������10
		System.out.print("�������10Ԫ��"+"���Ϊ��"+Account.balance+"\n");
	}
	public void run()
	{
		try
		{
			SaveMoney.sleep(100);
		}
		catch(Exception e)
		{}
		int i=10;
		while(i>0)
		{
		Save();
		i--;
		//System.exit(0);
		}
	}
}

class TreadDraw extends Thread
{
	public void Draw()
	{
		if(Account.balance>=10.0)
		{
			Account.balance=Account.balance-10;
			System.out.print("��ȡ����10Ԫ��"+"���Ϊ��"+Account.balance+"\n");
		}
		else
		{
			System.out.print("����!!!	����ǰ���Ϊ��"+Account.balance+"\n");
		}
	}
	public void run()
	{
		try
		{
			TreadDraw.sleep(100);
		}
		catch(Exception e)
		{}
		int i=10;
		while(i>0)
		{
		Draw();
		i--;
		//System.exit(0);
		}
	}
	
}