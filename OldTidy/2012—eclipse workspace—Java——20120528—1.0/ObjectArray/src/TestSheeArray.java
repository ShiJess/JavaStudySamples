import java.util.Random;


public class TestSheeArray {
	public static void main(String[] args)
	{
		System.out.print("�˳�������������в鿴��������������ʱֻ����һ������޷��鿴����Ч����");
		final int number=10;
		SheeArray sheep=new SheeArray();
		Sheep[] Array=new Sheep[number];
		int count=0;
		Random r=new Random();
		
		Array[0]=new Sheep();
		System.out.print("\n�������1�������Ϣ[ע�⣺������ı����50���ڣ���ֹ����������ʱ�ظ���]");
		Array[0].Insheep();
		count++;
		
		//������������Ƿ�������������Ϣ
		for(int i=1;i<number;i++)
		{

			Boolean b=r.nextBoolean();
			
			//���������Ϣ
			if(b)
			{
				Boolean b1=r.nextBoolean();
				
				//�ֶ����������Ϣ
				if(b1)
				{
					Array[i]=new Sheep();
					System.out.print("\n�������"+(i+1)+"�������Ϣ[ע�⣺������ı����50���ڣ���ֹ����������ʱ�ظ���]");
					Array[i].Insheep();
					count++;
					continue;
				}
				
				//��������������Ϣ
				else
				{
					Array[i]=new Sheep("q"+i,r.nextInt(50)+50,r.nextInt(100)+1,"g"+i);
					count++;
					continue;
				}
			}
			
			//��������Ϣ�����ã�Ϊ��������Ϊnull���������������������̶�ֵ��Ĭ�ϴ�ֵΪ��Чֵ��
			else
			{
				System.out.print("\n�����Ϣ�������\n");
				for(int j=i;j<number;j++)
				{
					Array[i]=new Sheep("0",0,0,"0");
				}
				break;
			}
		}
		
		

		//���������Ϣ
		sheep.setSheearray(Array);
		sheep.Insheearray();
		sheep.setSheenum(count);
		
		
		for(int i=0;i<count;i++)
		{
			System.out.print("\n��"+(i+1)+"ֻ�����Ϣ:");
			Array[i].Print();
		}
		
		sheep.Collate();
		System.out.print("\n��ʵ�����Ϣ:");
		sheep.ChooseFattest().Print();
	}

}
