import java.util.Scanner;


public class Fact {
	
	//�����ķ��Ӻͷ�ĸ
	private int num,den;
	
	//set��������
	public void setNum(int x){
		num=x;
	}
	public void setDen(int y){
		den=y;
	}
	
	//get���Ի��
	public int getNum(){
		return num;
	}
	public int getDen(){
		return den;
	}
	
	//����������ӷ�ĸ
	public void InFact(){
		Scanner scan=new Scanner(System.in);
		System.out.print("��������ӣ�");
		int m=scan.nextInt();
		System.out.print("�������ĸ��");
		int n=scan.nextInt();
		setNum(m);
		setDen(n);
	}
	
	//�Ƚϴ�С��������Ϊ�桿
	public Boolean Bigger(Fact Fact1){
		int a=this.num*Fact1.getDen()-Fact1.getNum()*this.den;
		Boolean b=(a>0);
		return b;
	}
	
	//�����Լ��
	public int GreatestCoDi(int x,int y){
		while((x-y)!=0){
			if((x-y)>0){
				x=x-y;
			}
			else{
				y=y-x;
			}
		}
		return x;
	}
	
	//Լ��
	public Fact ReduceY(){
		Fact Fact1=new Fact();
		int x=GreatestCoDi(this.getNum(),this.getDen());
		Fact1.setNum(this.getNum()/x);
		Fact1.setDen(this.getDen()/x);
		return Fact1;
	}
	
	//ͨ��
	public Fact ReduceT(Fact Fact1){
		int x=GreatestCoDi(ReduceY().getDen(),Fact1.ReduceY().getDen());
		Fact Fact2=new Fact();
		Fact2.setDen((Fact1.ReduceY().getDen()/x)*ReduceY().getDen());
		Fact2.setNum((Fact1.ReduceY().getDen()/x)*ReduceY().getNum());
		return Fact2;
	}
	
	//�������
	public Fact Add(Fact Fact1){
		Fact Fact2=new Fact();
		int x;
		Fact2.setNum(this.ReduceT(Fact1).getNum()+Fact1.ReduceT(this).getNum());
		Fact2.setDen(this.ReduceT(Fact1).getDen());
		x=GreatestCoDi(Fact2.getNum(),Fact2.getDen());
		Fact2.setNum(Fact2.getNum()/x);
		Fact2.setDen(Fact2.getDen()/x);
		return Fact2;
	}
	
	//�������
	public void Print(){
		System.out.print(this.getNum()+"/"+this.getDen());
	}
}
