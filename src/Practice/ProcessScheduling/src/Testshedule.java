//���࣬����ִ�С�4��
public abstract class Testshedule {
	private static final int BITMAP_SIZE = 140;

	public static void main(String arg[])
	{
		
		//�������ȼ�����������,���䵱ǰ��������Ϊ0,�����ȼ���Ϊ��������
		Prio_array[] array=new Prio_array[BITMAP_SIZE];//�����ȼ�����
		for(int i=0;i<BITMAP_SIZE;i++)//�������ȼ���1����BITMAP_SIZE-1
		{
			array[i].setNr_active(0);//����ÿ�����ȼ��е�ǰ�ж��ٸ�����
			array[i].setListhead(i);
		}
		
		//���ж���[���ж��CPU���������ж���,����1��]
		Runqueue run = null;//���н�������
			
		
		//���̴���[�ô���һ������ʵ��,������������������-��д]
		Task_struct task=new Task_struct();
		Task_To_Queue movetask=new Task_To_Queue();
		@SuppressWarnings("unused")
		boolean movesuccess=false;
		movesuccess=movetask.Movetask(task, array);
		if(movesuccess=true)
		{
			System.out.println("�����½��̲��ɹ������������");
		}
		else
		{
			System.out.println("���̴��������δ�ɹ������������");
		}
		
		
		//���̵��ȳ���
		Schedule Test=new Schedule();//����
		Test.schedule(run,array);//���Ҫ���еĽ��̶���
		Test.Runtask(run);
		System.out.print("sgdsga");
	}
}
