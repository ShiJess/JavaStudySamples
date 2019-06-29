import java.util.Scanner;
public class Circle extends Point{
	protected double radius;//半径
	public int area;//圆面积
	public void setRadius(double r)//设置圆的半径
	{
		this.radius=r;
	}
	public double getRadius()//获取圆的半径
	{
		return radius;
	}
	public Circle()//构造函数1【空】
	{	}
	public Circle(double x,double y,double r)//构造函数2【设置三个值】
	{
		this.abscissa=x;
		this.ordinate=y;
		this.radius=r;
	}
	public void InCircle()//方法1【键盘输入圆的信息】
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入圆点的横坐标：");
		double x=scan.nextDouble();
		System.out.print("请输入圆点的纵坐标：");
		double y=scan.nextDouble();
		System.out.print("请输入圆的半径：");
		double r=scan.nextDouble();
		setAbscissa(x);
		setOrdinate(y);
		setRadius(r);
	}
	public int Area(Circle c)//方法2【求圆的面积】
	{
		area=(int)(Math.PI*Math.pow(c.getRadius(), 2));
		return area;
	}
	public void Print()//方法3【输出圆的信息】
	{
		System.out.print("圆心坐标是:"+"("+this.abscissa+","+this.ordinate+")"+"\n"+"圆的半径是:"+this.radius+"\n");
	}

}
