//主类，调度执行【4】
public abstract class Testshedule {
	private static final int BITMAP_SIZE = 140;

	public static void main(String arg[])
	{
		
		//创建优先级的索引数组,将其当前进程数设为0,其优先级设为其数组编号
		Prio_array[] array=new Prio_array[BITMAP_SIZE];//总优先级数组
		for(int i=0;i<BITMAP_SIZE;i++)//设置优先级数1——BITMAP_SIZE-1
		{
			array[i].setNr_active(0);//设置每个优先级中当前有多少个进程
			array[i].setListhead(i);
		}
		
		//运行队列[当有多个CPU是许多个运行队列,先用1个]
		Runqueue run = null;//运行进程数组
			
		
		//进程创建[用创建一个进程实验,用随机数创建多个进程-待写]
		Task_struct task=new Task_struct();
		Task_To_Queue movetask=new Task_To_Queue();
		@SuppressWarnings("unused")
		boolean movesuccess=false;
		movesuccess=movetask.Movetask(task, array);
		if(movesuccess=true)
		{
			System.out.println("创建新进程并成功加入就绪队列");
		}
		else
		{
			System.out.println("进程创建错误或未成功加入就绪队列");
		}
		
		
		//进程调度程序
		Schedule Test=new Schedule();//调度
		Test.schedule(run,array);//获得要运行的进程队列
		Test.Runtask(run);
		System.out.print("sgdsga");
	}
}
