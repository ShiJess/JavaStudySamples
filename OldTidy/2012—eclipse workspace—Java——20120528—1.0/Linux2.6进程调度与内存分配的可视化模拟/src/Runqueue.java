//���ж��С�2��
public class Runqueue {
	private int listhead;//���̶���ͷ���[�����ȼ����]
	public void setListhead(int i)
	{
		this.listhead=i;
	}
	public int getListhead()
	{
		return this.listhead;
	}
	Queue_array active;//����ȼ�����
	Queue_array expired;//���ڵ����ȼ�����
}
