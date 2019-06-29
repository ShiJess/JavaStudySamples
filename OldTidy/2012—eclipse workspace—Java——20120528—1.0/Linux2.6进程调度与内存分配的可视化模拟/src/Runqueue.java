//运行队列【2】
public class Runqueue {
	private int listhead;//进程队列头编号[与优先级相等]
	public void setListhead(int i)
	{
		this.listhead=i;
	}
	public int getListhead()
	{
		return this.listhead;
	}
	Queue_array active;//活动优先级数组
	Queue_array expired;//过期的优先级数组
}
