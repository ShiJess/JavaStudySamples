import java.util.Scanner;


public class SheeArray {
	final int number=10;
	private Sheep sheearray[]=new Sheep[number];
	private String sheeowner;
	private int sheenum;
	
	//set属性函数
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
	
	//get属性函数
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
	
	//构造函数
	public SheeArray()
	{
	}
	

	//键盘输入羊队主人
	public void Insheearray()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n请输入羊队主人是");
		String sh=scan.next();
		setSheeowner(sh);
	}
	
	//羊按照重量排序
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
		System.out.print("\n按重量排序后【小到大】（只显示羊的编号）:\n");
		for(int k=0;k<this.getSheenum();k++)
		{
			System.out.print(s[k].getNum()+"   ");
		}
	}
	
	
	//获得最肥的羊
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
