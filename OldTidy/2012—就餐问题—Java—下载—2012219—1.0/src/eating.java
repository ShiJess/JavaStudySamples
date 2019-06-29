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
	int PId;                                 //哲编号学家
	int PState;                              //哲学家状态 0,1,2表示思考，饥饿，吃
	Philosopher(int PId,int PState){}
}


class Fork{
	int FId;                                 //叉子编号
	int FState;								 //叉子状态 0,1 分别表示空闲和被使用
	Fork(int FId,int FState){}
}


class Picup{                                 //
	//enter(IM)
	public void pickup(int i,Fork f[],Philosopher p[])
	{
     p[i].PState=1;                                   //修改状态为饥饿
     if(p[i%5].PState==1&&p[(i+1)%5].PState!=2){
      if(i==0)                                        //当i=0时候的左边的状态
      {
    	  if(p[i+4].PState!=2)
    	  {
    		  p[i].PState=2;                          //将i的状态改为吃
    		 // 唤醒进程     
    	  }
      }
      else
      {
    	  if(p[i-1].PState%5!=2)                       //判断左边的状态
    	  {
    		p[i].PState=2;                        	   //将i的状态改为吃  
    	  }
      }
     
	}
     else 
     {
    	//leave(im)                                  //离开管程
     }
     }
}


class Putdown{
	public void putdown(int i,Fork f[],Philosopher p[]){
		//enter（IM）
		p[i].PState=0;                               //将i的状态改为思考
		if(i==0)
		{
			if(p[i+4].PState==1)
			{
				//唤醒p[4]
			}
			if(p[1].PState==1)
			{
				//唤醒p[1]
			}
		}
		else
		{
			if(p[(i-1)%5].PState==1)
			{
				//唤醒
			}
			if(p[(i+1)%5].PState==1)
			{
				//唤醒
			}
		}
	}
}

class State{                      //状态输出
	public void statr(Fork f[],Philosopher p[])
	{
		System.out.println("************************************************************");
		System.out.println("  哲学家1		哲学家2		哲学家3		哲学家4		哲学家5");
		for(int i=0;i<5;i++)
		{
			if(p[i].PState==0)
				System.out.print("  思考\t\t");
			if(p[i].PState==1)
				System.out.print("  饥饿\t\t");
			if(p[i].PState==2)
				System.out.println("  吃\t\t");
		}
	}
}

class In{                         //状态输入
	public void in(Fork f[],Philosopher p[]) throws IOException
	{
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in ));
		String state="1";
		while(state.length()!=5)
		{
		System.out .print("请依次输入五位哲学家的状态（“0”表示思考，“1”表示饥饿，“2”表示吃,必须输入5个数字）：");
		state=read.readLine();
		for(int i=0;i<5;i++)
		{
			p[i].PState=Integer.parseInt(String.valueOf(state.charAt(i)));
		
		if(p[i].PState!=0&&p[i].PState!=1&&p[i].PState!=2){
			System.out .println("请按要求输入五个表示哲学家状态的数字！！");
		}
		else if(state.length()!=5)
		
			System.out .println("请按要求输入五个表示哲学家状态的数字！！");
		
	    }}
		for(int i=0;i<5;i++)
		{
			p[i].PState=Integer.parseInt(String.valueOf(state.charAt(i)));
		}
		State s1=new State();
		s1.statr(f, p);
	}
}












