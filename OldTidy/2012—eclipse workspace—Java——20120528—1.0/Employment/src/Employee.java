import java.util.Scanner;


public class Employee extends CommissionEmployee implements SalariedEmployee,HourlyEmployee{
	protected String name;//����
	protected String securitynumber;//���պ�
	public int hourPay;//ÿСʱ�Ĺ���
	public int workHour;//����Сʱ��
	public int weekPay;
	//���Ժ���
	public void setName(String n)
	{
		this.name=n;
	}
	public String getName()
	{
		return this.name;
	}
	public void setSecuritynumber(String s)
	{
		this.securitynumber=s;
	}
	public String getSecuritynumber()
	{
		return this.securitynumber;
	}
	//���캯��
	public Employee()
	{	}
	public Employee(String N,String S,float C,int G,int B)
	{
		this.name=N;
		this.securitynumber=S;
		this.commissionrate=C;
		this.grossproceeds=G;
		this.baseweekpay=B;
	}
	//����employee����Ϣ
	public void InEmployee()//��������Ա����Ϣ
	{
		System.out.print("������Ա������Ϣ\n");
		Scanner scan=new Scanner(System.in);
		System.out.print("������");
		String n=scan.next();
		setName(n);
		System.out.print("���պţ�");
		String s=scan.next();
		setSecuritynumber(s);
		System.out.print("Ӷ���ʣ�");
		float c=scan.nextFloat();
		setCommissionrate(c);
		System.out.print("�����ܶ");
		int g=scan.nextInt();
		setGrossproceeds(g);
		System.out.print("ÿ�ܻ�����������");
		int b=scan.nextInt();
		setBaseweekpay(b);
	}

	public int weekpay()//��н��á��ӿ�SalariedEmployee�̳С�
	{
		System.out.print("Ա�� "+this.getName()+" ����н��");
		this.weekPay= (int)(this.getCommissionrate()*this.getGrossproceeds())+(int)this.getBaseweekpay();
		return weekPay;
	}
	public void hourpay()//ÿСʱ��������á��ӿ�HourlyEmployee�̳С�
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("������Ա�� "+this.getName()+" ÿСʱ�Ĺ��ʣ�");
		this.hourPay= scan.nextInt();
	}
	public void workhour()//����Сʱ�����ӿ�HourlyEmployee�̳С�
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("������Ա�� "+this.getName()+" ����Сʱ����");
		this.workHour= scan.nextInt();
	}
	public void Print()//Ա������Ϣ���
	{
		System.out.print("\n\n����Ϊ "+this.getName()+" �Ĺ�Ա����Ϣ��"+"\n���պţ�"+this.getSecuritynumber()+"\nÿ�ܻ�����������"+this.getBaseweekpay()+"\nӶ���ʣ�"+this.getCommissionrate()+"\n�����ܶ"+this.getGrossproceeds()+"\nÿСʱ�Ĺ��ʣ�"+this.hourPay+"\n����Сʱ����"+this.workHour+"\n");
	}

}
