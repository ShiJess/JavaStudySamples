import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class eating{
	static Philosopher philosopher[]=new Philosopher[5];
	static Fork fork[]=new Fork[5];
   public static void main(String args[])
   {
	   for(int i=0;i<5;i++)
	   {
	     philosopher[i]=new Philosopher(i,0); 
	     fork[i]=new Fork(i,0);
	   }
	   
   }
}

class Philosopher{
	int PId;                                 //�ܱ��ѧ��
	int PState;                              //��ѧ��״̬ 0,1,2��ʾ˼������������
	Philosopher(int PId,int PState){}
}


class Fork{
	int FId;                                 //���ӱ��
	int FState;								 //����״̬ 0,1 �ֱ��ʾ���кͱ�ʹ��
	Fork(int FId,int FState){}
}


class Picup{                                 //
	//enter(IM)
	public void pickup(int i,Fork f[],Philosopher p[])
	{
     p[i].PState=1;                                   //�޸�״̬Ϊ����
     if(p[i%5].PState==1&&p[(i+1)%5].PState!=2){
      if(i==0)                                        //��i=0ʱ�����ߵ�״̬
      {
    	  if(p[i+4].PState!=2)
    	  {
    		  p[i].PState=2;                          //��i��״̬��Ϊ��
    		 // ���ѽ���     
    	  }
      }
      else
      {
    	  if(p[i-1].PState%5!=2)                       //�ж���ߵ�״̬
    	  {
    		p[i].PState=2;                        	   //��i��״̬��Ϊ��  
    	  }
      }
     
	}
     else 
     {
    	//leave(im)                                  //�뿪�ܳ�
     }
     }
}


class Putdown{
	public void putdown(int i,Fork f[],Philosopher p[]){
		//enter��IM��
		p[i].PState=0;                               //��i��״̬��Ϊ˼��
		if(i==0)
		{
			if(p[i+4].PState==1)
			{
				//����p[4]
			}
			if(p[1].PState==1)
			{
				//����p[1]
			}
		}
		else
		{
			if(p[(i-1)%5].PState==1)
			{
				//����
			}
			if(p[(i+1)%5].PState==1)
			{
				//����
			}
		}
	}
}

class State{                      //״̬���
	public void statr(Fork f[],Philosopher p[])
	{
		System.out.println("************************************************************");
		System.out.println("  ��ѧ��1		��ѧ��2		��ѧ��3		��ѧ��4		��ѧ��5");
		for(int i=0;i<5;i++)
		{
			if(p[i].PState==0)
				System.out.print("  ˼��\t\t");
			if(p[i].PState==1)
				System.out.print("  ����\t\t");
			if(p[i].PState==2)
				System.out.println("  ��\t\t");
		}
	}
}

class In{                         //״̬����
	public void in(Fork f[],Philosopher p[]) throws IOException
	{
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in ));
		String state="1";
		while(state.length()!=5)
		{
		System.out .print("������������λ��ѧ�ҵ�״̬����0����ʾ˼������1����ʾ��������2����ʾ��,��������5�����֣���");
		state=read.readLine();
		for(int i=0;i<5;i++)
		{
			p[i].PState=Integer.parseInt(String.valueOf(state.charAt(i)));
		
		if(p[i].PState!=0&&p[i].PState!=1&&p[i].PState!=2){
			System.out .println("�밴Ҫ�����������ʾ��ѧ��״̬�����֣���");
		}
		else if(state.length()!=5)
		
			System.out .println("�밴Ҫ�����������ʾ��ѧ��״̬�����֣���");
		
	    }}
		for(int i=0;i<5;i++)
		{
			p[i].PState=Integer.parseInt(String.valueOf(state.charAt(i)));
		}
		State s1=new State();
		s1.statr(f, p);
	}
}












