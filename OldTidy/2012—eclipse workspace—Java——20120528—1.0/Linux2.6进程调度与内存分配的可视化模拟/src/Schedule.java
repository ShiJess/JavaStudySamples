//���Ⱥ���
public class Schedule {
	private static final int BITMAP_SIZE = 140;
	
	//����������ȼ��Ľ��̶���[����ֵΪ���ȼ���ͷ ��ţ���ΪBITMAP_SIZE���ʾû�н�����]
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
		System.out.println("�������Ѿ�û�н���");
		return BITMAP_SIZE;
	}

	public void schedule(Runqueue runqueue,Prio_array[] arr)//���ҵ��Ľ��̶����Ƶ����ж�����ȥ
	{
		runqueue.setListhead(this.sched_find_first_bit(arr));
	}
	
	//���ж����еĽ���[ʱ��Ƭ]
	public void Runtask(Runqueue runqueue)
	{
		System.out.println("�������ȼ�Ϊ"+runqueue.getListhead()+"�Ľ��̶���");
	}
}
