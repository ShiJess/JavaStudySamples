
public class TestComplex {
	public static void main(String args[]){
		Complex x=new Complex();
		Complex y=new Complex();
		Complex z=new Complex();
		System.out.println("�������һ��������ʵ�����鲿��");
		x.InComplex();
		System.out.println("������ڶ���������ʵ�����鲿��");
		y.InComplex();
		System.out.print("��������ӣ�");
		z=x.Add(y);
		z.Print();
		System.out.print("�����������");
		z=x.Sub(y);
		z.Print();
		System.out.print("��������ˣ�");
		z=x.Multiply(y);
		z.Print();
	}
}
