//���ȼ����顾3��
public class Prio_array {
	private int nr_active;	//�����еĽ�����
	Queue_array active;//����ȼ�����
	Queue_array expired;//���ڵ����ȼ�����
	public void setNr_active()
	{
		this.nr_active=this.active.getNum()+this.expired.getNum();
	}
	public void setNr_active(int i)
	{
		this.nr_active=i;
	}
	public int getNr_active()
	{
		return this.nr_active;
	}

	private int listhead;//���ȼ�����ͷ���[���ȼ���]
	public void setListhead(int i)
	{
		this.listhead=i;
	}
	public int getListhead()
	{
		return this.listhead;
	}


}
