//调度函数
public class Schedule {
	private static final int BITMAP_SIZE = 140;
	
	//查找最高优先级的进程队列[返回值为优先级的头 编号，若为BITMAP_SIZE则表示没有进程了]
	public int sched_find_first_bit(Prio_array[] s)
	{
		for(int i=0;i<BITMAP_SIZE;i++)
		{
			if(s[i].getNr_active()>0)
			{
				return s[i].getListhead();
			}
			else
				continue;
		}
		System.out.println("队列中已经没有进程");
		return BITMAP_SIZE;
	}

	public void schedule(Runqueue runqueue,Prio_array[] arr)//将找到的进程队列移到运行对列中去
	{
		runqueue.setListhead(this.sched_find_first_bit(arr));
	}
	
	//运行队列中的进程[时间片]
	public void Runtask(Runqueue runqueue)
	{
		System.out.println("运行优先级为"+runqueue.getListhead()+"的进程队列");
	}
}
