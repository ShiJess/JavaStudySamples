//存放进程的队列[就绪队列]进程的创建删除
public class Queue_array {
	private static final int queue_num = 20;//每个进程队列的数组大小【即最多可有几个进程】
	private int num;//队列中的进程数
	public void setNum(int i)
	{
		this.num=i;
	}
	public int getNum()
	{
		return this.num;
	}
	Task_struct[] queue=new Task_struct[queue_num];
	private int prio;//本队列的进程优先级
	public void setPrio(int i)
	{
		this.prio=i;
	}
	public int getPrio()
	{
		return this.prio;
	}
}
