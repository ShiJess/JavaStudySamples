import java.util.Scanner;

public class Sheep {
	private String type;
	private int number;
	private int weight;
	private String color;

	//set属性函数
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

	//get属性函数
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

	//构造函数
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
	
	//键盘输入羊的信息
	public void Insheep()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n请输入羊的类型:");
		String t=scan.next();
		System.out.print("\n请输入羊的编号:");
		int n=scan.nextInt();
		System.out.print("\n请输入羊的重量:");
		int w=scan.nextInt();
		System.out.print("\n请输入羊的颜色:");
		String c=scan.next();
		setType(t);
		setNum(n);
		setWeight(w);
		setColor(c);
	}
	
	//羊信息显示
	public void Print()
	{
		System.out.print("\n羊的类型是"+this.getType()+"\n羊的编号是"+this.getNum()+"\n羊的重量是"+this.getWeight()+"\n羊的颜色是"+this.getColor()+"\n");
	}
}
