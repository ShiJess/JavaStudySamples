
public class Cardbasicinfo {
	private long cardNumber;
	private double balance;
	
	public void setCardNumber(long x)
	{
		this.cardNumber=x;
	}
	public void setBalance(double y)
	{
		this.balance=y;
	}
	
	public long getCardNumber()
	{
		return this.cardNumber;
	}
	public double getBalance()
	{
		return this.balance;
	}
	
	
	public boolean performConnection(long cn,int pw)
	{
		if((cn==this.getCardNumber())&&(pw==this.getCardNumber()))
		{
			return true;
		}
		return false;
	}
	
	
	public void performDial(long phoneNum,long phonebook[])
	{
		
	}

}
