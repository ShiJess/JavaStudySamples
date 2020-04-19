
public class Test {
	public static Scientist [] Sc=new Scientist[5];
	     public static Fork [] fork=new Fork[5];
    public static void main(String args[])
    {
    	ScientistInitial();
    	 ForkInitial();
    	 
        
    }
    public  static void ScientistInitial()
    {
    	Sc[0]=new Scientist("think","p0");
    	Sc[1]=new Scientist("think","p1");
    	Sc[2]=new Scientist("think","p2");
    	Sc[3]=new Scientist("think","p3");
    	Sc[4]=new Scientist("think","p4");
    }
    public static void ForkInitial()
    {
    	for(int i=0;i<5;i++)
    	{
        fork[0]=new Fork(false);
        }	
    }
}
class Scientist{
	public String state;
    public	 String name;
	public Scientist(String a, String b) {
		this.name=a;this.state=b;
	}
	
}
class Fork{
	public Fork(boolean a)
	{
		this.state=a;
	}
	boolean state;
}

