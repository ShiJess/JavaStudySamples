
public class TestPPC {
	public static void main(String arg[])
	{
		Point p1=new Point(1,1);//�ú��в����Ĺ��캯����������
		Point p3=new Point();//�ò��������Ĺ��캯����������
		System.out.print("������p3������꣺\n");
		p3.InPoint();
		
		Circle c1=new Circle(2,2,2);//�ú��в����Ĺ��캯����������
		Circle c3=new Circle();//�ò��������Ĺ��캯����������
		System.out.print("������Բc3����Ϣ��\n");
		c3.InCircle();
		
		Cylinder cy1=new Cylinder(3,3,3,3);//�ú��в����Ĺ��캯����������
		Cylinder cy3=new Cylinder();//�ò��������Ĺ��캯����������
		System.out.print("������Բ��cy3����Ϣ��\n");
		cy3.InCylinder();
		
		System.out.print("p1���λ����:"+"\n");
		p1.Print();
		System.out.print("p1�㵽ԭ��ľ�����:"+p1.Distance(p1)+"\n");
		System.out.print("p3���λ����:"+"\n");
		p3.Print();
		System.out.print("p3�㵽ԭ��ľ�����:"+p3.Distance(p3)+"\n");
		
		c1.Print();
		System.out.print("Բc1�������:"+c1.Area(c1)+"\n");
		c3.Print();
		System.out.print("Բc3�������:"+c1.Area(c3)+"\n");
		
		cy1.Print();	
		System.out.print("Բ����cy1�������:"+cy1.Volume(cy1)+"\n");
		cy3.Print();
		System.out.print("Բ����cy3�������:"+cy3.Volume(cy3)+"\n");
		
		Point p2=c1;//����������󴴽��������
		Circle c2=cy1;//����������󴴽��������
		System.out.print("p1���λ����:");
		p2.Print();
		System.out.print("p2�㵽ԭ��ľ�����:"+p2.Distance(p2)+"\n");
		c2.Print();
		System.out.print("Բc2�������:"+c2.Area(c2)+"\n");
	}

}
