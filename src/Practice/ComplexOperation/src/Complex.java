import java.util.Scanner;

public class Complex {
	
	//������ʵ�����鲿
	private int realPart,imaginaryPart;
	
	//���캯��
	public Complex(){}
	public Complex(int x,int y){
		this.realPart=x;
		this.imaginaryPart=y;
	}
	
	//set��������
	public void setRealPart(int x){
		realPart=x;
	}
	public void setImaginaryPart(int y){
		imaginaryPart=y;
	}
	
	//get���Ի��
	public int getRealPart(){
		return realPart;
	}
	public int getImaginaryPart(){
		return imaginaryPart;
	}
	
	//��������ʵ�����鲿
	public void InComplex(){
		Scanner scan=new Scanner(System.in);
		System.out.print("����ʵ����");
		int m=scan.nextInt();
		System.out.print("�����鲿��");
		int n=scan.nextInt();
		setRealPart(m);
		setImaginaryPart(n);
	}
	
	//�����������
	public Complex Add(Complex complex1){
		Complex complex2=new Complex();
		complex2.setRealPart(this.realPart+complex1.getRealPart());
		complex2.setImaginaryPart(this.imaginaryPart+complex1.getImaginaryPart());
		return complex2;
	}
	
	//�����������
	public Complex Sub(Complex complex1){
		Complex complex2=new Complex();
		complex2.setRealPart(this.realPart-complex1.getRealPart());
		complex2.setImaginaryPart(this.imaginaryPart-complex1.getImaginaryPart());
		return complex2;
	}
	
	//�����������
	public Complex Multiply(Complex complex1){
		Complex complex2=new Complex();
		complex2.setRealPart(this.realPart*complex1.getRealPart()-this.imaginaryPart*complex1.getImaginaryPart());
		complex2.setImaginaryPart(this.imaginaryPart*complex1.getRealPart()+this.realPart*complex1.getImaginaryPart());
		return complex2;
	}
	
	//�������
	public void Print(){
		System.out.println("("+realPart+","+imaginaryPart+")");
	}
}
