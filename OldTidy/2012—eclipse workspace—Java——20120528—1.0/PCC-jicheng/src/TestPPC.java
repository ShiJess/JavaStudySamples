
public class TestPPC {
	public static void main(String arg[])
	{
		Point p1=new Point(1,1);//用含有参数的构造函数创建对象
		Point p3=new Point();//用不含参数的构造函数创建对象
		System.out.print("请输入p3点的坐标：\n");
		p3.InPoint();
		
		Circle c1=new Circle(2,2,2);//用含有参数的构造函数创建对象
		Circle c3=new Circle();//用不含参数的构造函数创建对象
		System.out.print("请输入圆c3的信息：\n");
		c3.InCircle();
		
		Cylinder cy1=new Cylinder(3,3,3,3);//用含有参数的构造函数创建对象
		Cylinder cy3=new Cylinder();//用不含参数的构造函数创建对象
		System.out.print("请输入圆柱cy3的信息：\n");
		cy3.InCylinder();
		
		System.out.print("p1点的位置是:"+"\n");
		p1.Print();
		System.out.print("p1点到原点的距离是:"+p1.Distance(p1)+"\n");
		System.out.print("p3点的位置是:"+"\n");
		p3.Print();
		System.out.print("p3点到原点的距离是:"+p3.Distance(p3)+"\n");
		
		c1.Print();
		System.out.print("圆c1的面积是:"+c1.Area(c1)+"\n");
		c3.Print();
		System.out.print("圆c3的面积是:"+c1.Area(c3)+"\n");
		
		cy1.Print();	
		System.out.print("圆柱体cy1的体积是:"+cy1.Volume(cy1)+"\n");
		cy3.Print();
		System.out.print("圆柱体cy3的体积是:"+cy3.Volume(cy3)+"\n");
		
		Point p2=c1;//利用子类对象创建父类对象
		Circle c2=cy1;//利用子类对象创建父类对象
		System.out.print("p1点的位置是:");
		p2.Print();
		System.out.print("p2点到原点的距离是:"+p2.Distance(p2)+"\n");
		c2.Print();
		System.out.print("圆c2的面积是:"+c2.Area(c2)+"\n");
	}

}
