import java.util.Scanner;


public class SheeArray {
	final int number=10;
	private Sheep sheearray[]=new Sheep[number];
	private String sheeowner;
	private int sheenum;
	
	//set���Ժ���
 	public void setSheearray(Sheep[] s)
	{
		this.sheearray=s;
	}
	public void setSheeowner(String sh)
	{
		this.sheeowner=sh;
	}
	public void setSheenum(int she)
	{
		this.sheenum=she;
	}
	
	//get���Ժ���
	public Sheep[] getSheearray()
	{
		return this.sheearray;
	}
	public String getSheeowner()
	{
		return this.sheeowner;
	}
	public int getSheenum()
	{
		return this.sheenum;
	}
	
	//���캯��
	public SheeArray()
	{
	}
	

	//���������������
	public void Insheearray()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n���������������");
		String sh=scan.next();
		setSheeowner(sh);
	}
	
	//������������
	public void Collate()
	{
		Sheep[] s=new Sheep[number];
		s=this.getSheearray();
		Sheep middle=new Sheep();
		for(int i=0;i<this.getSheenum();i++)
		{
			for(int j=1;j<this.getSheenum()-i;j++)
			{
				if(s[j-1].getWeight()>s[j].getWeight())
				{
					middle=s[j-1];
					s[j-1]=s[j];
					s[j]=middle;
				}
				else
				{
					continue;
				}
			}
		}
		System.out.print("\n�����������С���󡿣�ֻ��ʾ��ı�ţ�:\n");
		for(int k=0;k<this.getSheenum();k++)
		{
			System.out.print(s[k].getNum()+"   ");
		}
	}
	
	
	//�����ʵ���
	public Sheep ChooseFattest()
	{
		Sheep[] s=new Sheep[number];
		s=this.sheearray;
		Sheep fattest=new Sheep();
		fattest=s[0];
		for(int i=1;i<this.getSheenum();i++)
		{
			if(fattest.getWeight()<s[i].getWeight())
			{
				fattest=s[i];
			}
			else
			{
				continue;
			}
		}
		return fattest;
	}
}
