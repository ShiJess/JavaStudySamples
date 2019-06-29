import java.util.Scanner;
public class Point {
	protected double abscissa;//横坐标
	protected double ordinate;//纵坐标
	public int distance;//点到原点的距离
 	public void setAbscissa(double x)//设置横坐标
	{
		this.abscissa=x;
	}
	public double getAbscissa()//获取横坐标
	{
		return abscissa;
	}
	public void setOrdinate(double y)//设置纵坐标
	{
		this.ordinate=y;
	}
	public double getOrdinate()//获取纵坐标
	{
		return ordinate;
	}
	public Point()//构造函数1【空】
	{	}
	public Point(double x,double y)//构造函数2【初始化两个值】
	{
		this.abscissa=x;
		this.ordinate=y;
	}
	public void InPoint()//方法1【键盘输入坐标】
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入点的横坐标：");
		double x=scan.nextDouble();
		System.out.print("请输入点的纵坐标：");
		double y=scan.nextDouble();
		setAbscissa(x);
		setOrdinate(y);
	}
	public int Distance(Point p)//方法2【求点到原点的距离【利用java.lang.math.hypot】】
	{
		distance=(int)Math.hypot(p.getAbscissa(), p.getOrdinate());
		return distance;
	}
	public void Print()//方法3【信息输出】
	{
		System.out.print("横坐标是:"+this.abscissa+"\n"+"纵坐标是:"+this.ordinate+"\n");
	}
}
