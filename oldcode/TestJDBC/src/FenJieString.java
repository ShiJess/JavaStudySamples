public class FenJieString 
{ public static void main(String[] args) 
	{ // TODO Auto-generated method stub 
	System.out.println("请输入N的值："); 
Scanner input_n = new Scanner(System.in); 
int n = input_n.nextInt(); 
System.out.println("请输入两个字符串："); 
Scanner input_01 = new Scanner(System.in); 
String in01 = input_01.nextLine();
 StringBuffer sb_01 = new StringBuffer(); 
sb_01.append(in01); 
Scanner input_02 = new Scanner(System.in); 
String in02 = input_02.nextLine(); 
StringBuffer sb_02 = new StringBuffer(); 
sb_02.append(in02);
 fenjie( sb_01,n); 
fenjie( sb_02,n); 
}

 public static void fenjie(StringBuffer sb,int n)
{ StringBuffer sbfin = new StringBuffer(); int m=0; if(sb.length()&amp;lt;=n){ m = n-sb.length(); // 那个这里一定要用单独的变量记录长度 
for(int i=0;i sb.append("0"); } sbfin.append(sb); } else{ System.out.println(sb.toString().substring(0,n)); sbfin.append(sb.toString().substring(n,sb.length())); m = n-sbfin.length(); for(int i=0;i sbfin.append('0'); } } System.out.println(sbfin); }
}
 } 