import java.util.Scanner;
public class Cylinder extends Circle{
	protected double higher;//Բ����ĸ�
	public int volume;//Բ��������
	public void setHigher(double h)//����Բ����ĸ�
	{
		this.higher=h;
	}
	public double getHigher()//��ȡԲ����ĸ�
	{
		return higher;
	}
	public Cylinder()//���캯��1���ա�
	{}
	public Cylinder(double r,double h)//���캯��2����������ֵ������뾶�͸ߡ�
	{
		this.abscissa=0;
		this.ordinate=0;
		this.radius=r;
		this.higher=h;
	}
	public Cylinder(double x,double y,double r,double h)//���캯��3������ȫ����
	{
		this.abscissa=x;
		this.ordinate=y;
		this.radius=r;
		this.higher=h;
	}
	public void InCylinder()//����1����������Բ����Ϣ��
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("������Բ���µ���Բ��ĺ����꣺");
		double x=scan.nextDouble();
		System.out.print("������Բ���µ���Բ��������꣺");
		double y=scan.nextDouble();
		System.out.print("������Բ������Բ�İ뾶��");
		double r=scan.nextDouble();
		System.out.print("������Բ���ĸߣ�");
		double h=scan.nextDouble();
		setAbscissa(x);
		setOrdinate(y);
		setRadius(r);
		setHigher(h);
	}
	public int Volume(Cylinder cy)//����2����Բ����������
	{
		volume=(int)(cy.Area(cy)*cy.higher);
		return volume;
	}
	public void Print()//����3�����Բ�����һЩ��Ϣ��
	{
		System.out.print("Բ���ĵ���뾶��:"+this.radius+"\n"+"Բ���ĸ���:"+this.higher+"\n");
	}

}
