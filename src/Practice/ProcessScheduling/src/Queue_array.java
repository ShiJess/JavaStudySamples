//��Ž��̵Ķ���[��������]���̵Ĵ���ɾ��
public class Queue_array {
	private static final int queue_num = 20;//ÿ�����̶��е������С���������м������̡�
	private int num;//�����еĽ�����
	public void setNum(int i)
	{
		this.num=i;
	}
	public int getNum()
	{
		return this.num;
	}
	Task_struct[] queue=new Task_struct[queue_num];
	private int prio;//�����еĽ������ȼ�
	public void setPrio(int i)
	{
		this.prio=i;
	}
	public int getPrio()
	{
		return this.prio;
	}
}
