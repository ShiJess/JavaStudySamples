import java.util.Scanner;
public class Point {
	protected double abscissa;//������
	protected double ordinate;//������
	public int distance;//�㵽ԭ��ľ���
 	public void setAbscissa(double x)//���ú�����
	{
		this.abscissa=x;
	}
	public double getAbscissa()//��ȡ������
	{
		return abscissa;
	}
	public void setOrdinate(double y)//����������
	{
		this.ordinate=y;
	}
	public double getOrdinate()//��ȡ������
	{
		return ordinate;
	}
	public Point()//���캯��1���ա�
	{	}
	public Point(double x,double y)//���캯��2����ʼ������ֵ��
	{
		this.abscissa=x;
		this.ordinate=y;
	}
	public void InPoint()//����1�������������꡿
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("�������ĺ����꣺");
		double x=scan.nextDouble();
		System.out.print("�������������꣺");
		double y=scan.nextDouble();
		setAbscissa(x);
		setOrdinate(y);
	}
	public int Distance(Point p)//����2����㵽ԭ��ľ��롾����java.lang.math.hypot����
	{
		distance=(int)Math.hypot(p.getAbscissa(), p.getOrdinate());
		return distance;
	}
	public void Print()//����3����Ϣ�����
	{
		System.out.print("��������:"+this.abscissa+"\n"+"��������:"+this.ordinate+"\n");
	}
}
