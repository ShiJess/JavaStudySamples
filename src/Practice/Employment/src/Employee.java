import java.util.Scanner;


public class Employee extends CommissionEmployee implements SalariedEmployee,HourlyEmployee{
	protected String name;//姓名
	protected String securitynumber;//保险号
	public int hourPay;//每小时的工资
	public int workHour;//工作小时数
	public int weekPay;
	//属性函数
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
	//构造函数
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
	//设置employee的信息
	public void InEmployee()//键盘输入员工信息
	{
		System.out.print("请输入员工的信息\n");
		Scanner scan=new Scanner(System.in);
		System.out.print("姓名：");
		String n=scan.next();
		setName(n);
		System.out.print("保险号：");
		String s=scan.next();
		setSecuritynumber(s);
		System.out.print("佣金率：");
		float c=scan.nextFloat();
		setCommissionrate(c);
		System.out.print("销售总额：");
		int g=scan.nextInt();
		setGrossproceeds(g);
		System.out.print("每周基本工资数：");
		int b=scan.nextInt();
		setBaseweekpay(b);
	}

	public int weekpay()//周薪获得【接口SalariedEmployee继承】
	{
		System.out.print("员工 "+this.getName()+" 的周薪：");
		this.weekPay= (int)(this.getCommissionrate()*this.getGrossproceeds())+(int)this.getBaseweekpay();
		return weekPay;
	}
	public void hourpay()//每小时工资数获得【接口HourlyEmployee继承】
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入员工 "+this.getName()+" 每小时的工资：");
		this.hourPay= scan.nextInt();
	}
	public void workhour()//工作小时数【接口HourlyEmployee继承】
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入员工 "+this.getName()+" 工作小时数：");
		this.workHour= scan.nextInt();
	}
	public void Print()//员工的信息输出
	{
		System.out.print("\n\n姓名为 "+this.getName()+" 的雇员的信息："+"\n保险号："+this.getSecuritynumber()+"\n每周基本工资数："+this.getBaseweekpay()+"\n佣金率："+this.getCommissionrate()+"\n销售总额："+this.getGrossproceeds()+"\n每小时的工资："+this.hourPay+"\n工作小时数："+this.workHour+"\n");
	}

}
