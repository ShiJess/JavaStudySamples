import java.util.Scanner;
public class Cylinder extends Circle{
	protected double higher;//圆柱体的高
	public int volume;//圆柱体的体积
	public void setHigher(double h)//设置圆柱体的高
	{
		this.higher=h;
	}
	public double getHigher()//获取圆柱体的高
	{
		return higher;
	}
	public Cylinder()//构造函数1【空】
	{}
	public Cylinder(double r,double h)//构造函数2【设置两个值：底面半径和高】
	{
		this.abscissa=0;
		this.ordinate=0;
		this.radius=r;
		this.higher=h;
	}
	public Cylinder(double x,double y,double r,double h)//构造函数3【设置全部】
	{
		this.abscissa=x;
		this.ordinate=y;
		this.radius=r;
		this.higher=h;
	}
	public void InCylinder()//方法1【键盘输入圆柱信息】
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入圆柱下底面圆点的横坐标：");
		double x=scan.nextDouble();
		System.out.print("请输入圆柱下底面圆点的纵坐标：");
		double y=scan.nextDouble();
		System.out.print("请输入圆柱底面圆的半径：");
		double r=scan.nextDouble();
		System.out.print("请输入圆柱的高：");
		double h=scan.nextDouble();
		setAbscissa(x);
		setOrdinate(y);
		setRadius(r);
		setHigher(h);
	}
	public int Volume(Cylinder cy)//方法2【求圆柱体的体积】
	{
		volume=(int)(cy.Area(cy)*cy.higher);
		return volume;
	}
	public void Print()//方法3【输出圆柱体的一些信息】
	{
		System.out.print("圆柱的底面半径是:"+this.radius+"\n"+"圆柱的高是:"+this.higher+"\n");
	}

}
