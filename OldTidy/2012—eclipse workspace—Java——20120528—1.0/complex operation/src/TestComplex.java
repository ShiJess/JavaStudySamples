
public class TestComplex {
	public static void main(String args[]){
		Complex x=new Complex();
		Complex y=new Complex();
		Complex z=new Complex();
		System.out.println("请输入第一个复数的实部和虚部：");
		x.InComplex();
		System.out.println("请输入第二个复数的实部和虚部：");
		y.InComplex();
		System.out.print("两复数相加：");
		z=x.Add(y);
		z.Print();
		System.out.print("两复数相减：");
		z=x.Sub(y);
		z.Print();
		System.out.print("两复数相乘：");
		z=x.Multiply(y);
		z.Print();
	}
}
