import java.util.Scanner;
public class Circle extends Point{
	protected double radius;//�뾶
	public int area;//Բ���
	public void setRadius(double r)//����Բ�İ뾶
	{
		this.radius=r;
	}
	public double getRadius()//��ȡԲ�İ뾶
	{
		return radius;
	}
	public Circle()//���캯��1���ա�
	{	}
	public Circle(double x,double y,double r)//���캯��2����������ֵ��
	{
		this.abscissa=x;
		this.ordinate=y;
		this.radius=r;
	}
	public void InCircle()//����1����������Բ����Ϣ��
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("������Բ��ĺ����꣺");
		double x=scan.nextDouble();
		System.out.print("������Բ��������꣺");
		double y=scan.nextDouble();
		System.out.print("������Բ�İ뾶��");
		double r=scan.nextDouble();
		setAbscissa(x);
		setOrdinate(y);
		setRadius(r);
	}
	public int Area(Circle c)//����2����Բ�������
	{
		area=(int)(Math.PI*Math.pow(c.getRadius(), 2));
		return area;
	}
	public void Print()//����3�����Բ����Ϣ��
	{
		System.out.print("Բ��������:"+"("+this.abscissa+","+this.ordinate+")"+"\n"+"Բ�İ뾶��:"+this.radius+"\n");
	}

}
