//将对应优先级的进程放入对应的进程队列
public class Task_To_Queue {
	private static final int BITMAP_SIZE = 140;
	
	public boolean Movetask(Task_struct task,Prio_array[] array)//进程移动
	{
		int i;
		for(i=0;i<BITMAP_SIZE;i++)
		{
			if(task.getPrio()==i)
			{
				array[i].active.setNum(array[i].active.getNum()+1);//默认是加入到活动优先级
				return true;
			}
			else
				continue;
		}
		if(i==BITMAP_SIZE)
		{
			System.out.println("优先级出界");
		}
		return false;
	}
}
