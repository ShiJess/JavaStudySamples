import java.util.Scanner;

public class Sheep {
	private String type;
	private int number;
	private int weight;
	private String color;

	//set���Ժ���
	public void setType(String t)
	{
		this.type=t;
	}
	public void setNum(int n)
	{
		this.number=n;
	}
	public void setWeight(int w)
	{
		this.weight=w;
	}
	public void  setColor(String c)
	{
		this.color=c;
	}

	//get���Ժ���
	public String getType()
	{
		return this.type;
	}
	public int getNum()
	{
		return this.number;
	}
	public int getWeight()
	{
		return this.weight;
	}
	public String getColor()
	{
		return this.color;
	}

	//���캯��
	public Sheep()
	{
	}
	public Sheep(String t,int n,int w,String c)
	{
		this.type=t;
		this.number=n;
		this.weight=w;
		this.color=c;
	}
	
	//�������������Ϣ
	public void Insheep()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n�������������:");
		String t=scan.next();
		System.out.print("\n��������ı��:");
		int n=scan.nextInt();
		System.out.print("\n�������������:");
		int w=scan.nextInt();
		System.out.print("\n�����������ɫ:");
		String c=scan.next();
		setType(t);
		setNum(n);
		setWeight(w);
		setColor(c);
	}
	
	//����Ϣ��ʾ
	public void Print()
	{
		System.out.print("\n���������"+this.getType()+"\n��ı����"+this.getNum()+"\n���������"+this.getWeight()+"\n�����ɫ��"+this.getColor()+"\n");
	}
}
