
public class TestEmployee {
	public static void main(String arg[])
	{
		System.out.print("��һ��Ա��\n");
		Employee em=new Employee();
		em.InEmployee();
		em.hourpay();
		em.workhour();
		System.out.print("�ڶ���Ա��\n");
		Employee em1=new Employee("wang","123456",(float)0.01,100,200);
		em1.hourpay();
		em1.workhour();
		em.Print();
		System.out.print(em.weekpay());
		em1.Print();
		System.out.print(em1.weekpay());
	}

}
