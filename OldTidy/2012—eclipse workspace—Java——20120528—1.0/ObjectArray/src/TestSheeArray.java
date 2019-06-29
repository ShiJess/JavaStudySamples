import java.util.Random;


public class TestSheeArray {
	public static void main(String[] args)
	{
		System.out.print("此程序可能需多次运行查看结果【避免随机数时只产生一个羊而无法查看具体效果】");
		final int number=10;
		SheeArray sheep=new SheeArray();
		Sheep[] Array=new Sheep[number];
		int count=0;
		Random r=new Random();
		
		Array[0]=new Sheep();
		System.out.print("\n请输入第1个羊的信息[注意：请输入的编号在50以内（防止随机产生编号时重复）]");
		Array[0].Insheep();
		count++;
		
		//用随机数设置是否继续设置羊的信息
		for(int i=1;i<number;i++)
		{

			Boolean b=r.nextBoolean();
			
			//设置羊的信息
			if(b)
			{
				Boolean b1=r.nextBoolean();
				
				//手动设置羊的信息
				if(b1)
				{
					Array[i]=new Sheep();
					System.out.print("\n请输入第"+(i+1)+"个羊的信息[注意：请输入的编号在50以内（防止随机产生编号时重复）]");
					Array[i].Insheep();
					count++;
					continue;
				}
				
				//随机数产生羊的信息
				else
				{
					Array[i]=new Sheep("q"+i,r.nextInt(50)+50,r.nextInt(100)+1,"g"+i);
					count++;
					continue;
				}
			}
			
			//结束羊信息的设置，为避免数组为null出错，将后面的数组内容设固定值【默认此值为无效值】
			else
			{
				System.out.print("\n羊的信息设置完成\n");
				for(int j=i;j<number;j++)
				{
					Array[i]=new Sheep("0",0,0,"0");
				}
				break;
			}
		}
		
		

		//设置羊队信息
		sheep.setSheearray(Array);
		sheep.Insheearray();
		sheep.setSheenum(count);
		
		
		for(int i=0;i<count;i++)
		{
			System.out.print("\n第"+(i+1)+"只羊的信息:");
			Array[i].Print();
		}
		
		sheep.Collate();
		System.out.print("\n最肥的羊信息:");
		sheep.ChooseFattest().Print();
	}

}
