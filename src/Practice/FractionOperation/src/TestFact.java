
public class TestFact {
	public static void main(String arg[]){
	Fact x=new Fact();
	Fact y=new Fact();
	Fact z=new Fact();
	System.out.println("�������һ�������ķ��Ӻͷ�ĸ��");
	x.InFact();
	System.out.println("������ڶ��������ķ��Ӻͷ�ĸ��");
	y.InFact();
	System.out.print("��С�ȽϽ��Ϊ��");
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
	System.out.print("\n��һ����Լ�ֺ�Ľ���ǣ�");
	x.ReduceY().Print();
	System.out.print("\nͨ�ֺ��һ����Ϊ��");
	x.ReduceT(y).Print();
	System.out.print("\nͨ�ֺ�ڶ�����Ϊ��");
	y.ReduceT(x).Print();
	System.out.print("\n��������Ӻ�Ľ��Ϊ��");
	z=x.Add(y);
	z.Print();
	}
}
