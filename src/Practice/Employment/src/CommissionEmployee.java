
public class CommissionEmployee extends BaseplusEmployee{
	protected float commissionrate;//Ӷ����
	protected int grossproceeds;//�����ܶ�
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
