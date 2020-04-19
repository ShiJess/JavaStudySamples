
public class CommissionEmployee extends BaseplusEmployee{
	protected float commissionrate;//佣金率
	protected int grossproceeds;//销售总额
	public void setCommissionrate(float c)
	{
		this.commissionrate=c;
	}
	public float getCommissionrate()
	{
		return this.commissionrate;
	}
	public void setGrossproceeds(int g)
	{
		this.grossproceeds=g;
	}
	public int getGrossproceeds()
	{
		return this.grossproceeds;
	}

}
