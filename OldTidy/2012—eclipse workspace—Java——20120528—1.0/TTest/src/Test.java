import java.util.ArrayList;
import java.util.List;

public class Test{
	public static void main(String args[])
	{
		ArrayList myList=new Object();
		String ss=new String("abcdefg");
		for(int i=1;i<ss.length();i+=2)
			System.out.print(ss.charAt(i));
	}
}