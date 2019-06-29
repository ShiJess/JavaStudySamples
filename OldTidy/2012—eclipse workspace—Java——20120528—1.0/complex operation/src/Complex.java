import java.util.Scanner;

public class Complex {
	
	//复数的实部和虚部
	private int realPart,imaginaryPart;
	
	//构造函数
	public Complex(){}
	public Complex(int x,int y){
		this.realPart=x;
		this.imaginaryPart=y;
	}
	
	//set属性设置
	public void setRealPart(int x){
		realPart=x;
	}
	public void setImaginaryPart(int y){
		imaginaryPart=y;
	}
	
	//get属性获得
	public int getRealPart(){
		return realPart;
	}
	public int getImaginaryPart(){
		return imaginaryPart;
	}
	
	//键盘输入实部和虚部
	public void InComplex(){
		Scanner scan=new Scanner(System.in);
		System.out.print("输入实部：");
		int m=scan.nextInt();
		System.out.print("输入虚部：");
		int n=scan.nextInt();
		setRealPart(m);
		setImaginaryPart(n);
	}
	
	//两个复数相加
	public Complex Add(Complex complex1){
		Complex complex2=new Complex();
		complex2.setRealPart(this.realPart+complex1.getRealPart());
		complex2.setImaginaryPart(this.imaginaryPart+complex1.getImaginaryPart());
		return complex2;
	}
	
	//两个复数相减
	public Complex Sub(Complex complex1){
		Complex complex2=new Complex();
		complex2.setRealPart(this.realPart-complex1.getRealPart());
		complex2.setImaginaryPart(this.imaginaryPart-complex1.getImaginaryPart());
		return complex2;
	}
	
	//两个复数相乘
	public Complex Multiply(Complex complex1){
		Complex complex2=new Complex();
		complex2.setRealPart(this.realPart*complex1.getRealPart()-this.imaginaryPart*complex1.getImaginaryPart());
		complex2.setImaginaryPart(this.imaginaryPart*complex1.getRealPart()+this.realPart*complex1.getImaginaryPart());
		return complex2;
	}
	
	//复数输出
	public void Print(){
		System.out.println("("+realPart+","+imaginaryPart+")");
	}
}
