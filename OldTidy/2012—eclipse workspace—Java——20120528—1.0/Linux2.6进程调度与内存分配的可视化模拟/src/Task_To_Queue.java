//����Ӧ���ȼ��Ľ��̷����Ӧ�Ľ��̶���
public class Task_To_Queue {
	private static final int BITMAP_SIZE = 140;
	
	public boolean Movetask(Task_struct task,Prio_array[] array)//�����ƶ�
	{
		int i;
		for(i=0;i<BITMAP_SIZE;i++)
		{
			if(task.getPrio()==i)
			{
				array[i].active.setNum(array[i].active.getNum()+1);//Ĭ���Ǽ��뵽����ȼ�
				return true;
			}
			else
				continue;
		}
		if(i==BITMAP_SIZE)
		{
			System.out.println("���ȼ�����");
		}
		return false;
	}
}
