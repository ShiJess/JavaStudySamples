
public class TestFact {
	public static void main(String arg[]){
	Fact x=new Fact();
	Fact y=new Fact();
	Fact z=new Fact();
	System.out.println("请输入第一个分数的分子和分母：");
	x.InFact();
	System.out.println("请输入第二个分数的分子和分母：");
	y.InFact();
	System.out.print("大小比较结果为：");
	if(x.Bigger(y)){
		x.Print();
		System.out.print(">");
		y.Print();
	}
	else if(y.Bigger(x)){
		x.Print();
		System.out.print("<");
		y.Print();
	}
	else{
		x.Print();
		System.out.print("=");
		y.Print();
	}
	System.out.print("\n第一个数约分后的结果是：");
	x.ReduceY().Print();
	System.out.print("\n通分后第一个数为：");
	x.ReduceT(y).Print();
	System.out.print("\n通分后第二个数为：");
	y.ReduceT(x).Print();
	System.out.print("\n两分数相加后的结果为：");
	z=x.Add(y);
	z.Print();
	}
}
