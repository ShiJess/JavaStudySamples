//优先级数组【3】
public class Prio_array {
	private int nr_active;	//数组中的进程数
	Queue_array active;//活动优先级数组
	Queue_array expired;//过期的优先级数组
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

	private int listhead;//优先级队列头编号[优先级数]
	public void setListhead(int i)
	{
		this.listhead=i;
	}
	public int getListhead()
	{
		return this.listhead;
	}


}
