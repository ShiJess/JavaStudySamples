import javax.swing.*;
import javax.swing.undo.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.awt.datatransfer.*;
import java.awt.print.*;
import java.io.*;

public class Jishiben extends JFrame implements ActionListener {
	JPopupMenu pm ;
	JTextArea ta;
	boolean isNewFile=true;    //是否新文件(未保存过的)
	File currentFile;                 //当前文件名
	String oldValue;           //存放编辑区原来的内容,用于比较文本是否有改动
	//protected UndoManager undo = new UndoManager();
	//protected UndoableEditListener undoHandler = new UndoHandler();
	JToolBar tbar = new JToolBar();
	JCheckBoxMenuItem mt19;
	public Jishiben()
	{		
		super("记事本");
		//Container ct=getContentPane();
		//以下三句是设置编辑区域及滚动条
	    ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		add(sp);
		JMenuBar mb = new JMenuBar();
		//设置文件菜单
		JMenu mu1 = new JMenu("文件(F)",true);
		mu1.setMnemonic('F');//设置快捷键按下ALT+F激活打开菜单
		
		JMenuItem mt1 = new JMenuItem("新建(N)",'N');
		mt1.setMnemonic('N');
		//mt1.addActionListener(new new1());
		
		
		JMenuItem mt2 = new JMenuItem("打开(O)...",'O');	
		mt2.setMnemonic('O');
		mt2.addActionListener(this);
		
		JMenuItem mt3 = new JMenuItem("保存(S)",'S');
		//mt3.addActionListener(new save());
		mu1.add(mt3);
		
		JMenuItem mt4 = new JMenuItem("另存为(A)...");
		JMenuItem mt5 = new JMenuItem("页面设置(A)...");
		JMenuItem mt6 = new JMenuItem("打印(P)...");
		
		JMenuItem mt7 = new JMenuItem("退出(X)",'X');
		//组合键的设置
		mt1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));	//新建		
		mt2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));	//打开
		mt3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK)); //保存
		mt6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.CTRL_MASK));	//打印		
		
		this.setJMenuBar(mb);
		mb.add(mu1);
		mu1.add(mt1);
		mu1.add(mt2);
		mu1.add(mt3);
		mu1.add(mt4);
		mu1.addSeparator();
		mu1.add(mt5);
		mu1.add(mt6);
		mu1.addSeparator();
		mu1.add(mt7);
		
		//设置编辑菜单
		JMenu mu2 = new JMenu("编辑(E)",true);
		mu2.setMnemonic('E');
		JMenuItem mt8 = new JMenuItem("辙稍(U)",'U');
		JMenuItem mt9 = new JMenuItem("剪切(T)",'T');
		JMenuItem mt10 = new JMenuItem("复制(C)",'C');
		JMenuItem mt11 = new JMenuItem("粘贴(P)",'P');
		JMenuItem mt12 = new JMenuItem("删除(L)",'L');
		JMenuItem mt13 = new JMenuItem("查找(F)",'F');
		JMenuItem mt14 = new JMenuItem("查找下一个(N)",'N');
		JMenuItem mt15 = new JMenuItem("替换(R)...",'R');
		JMenuItem mt16 = new JMenuItem("转到(G)...",'G');
		JMenuItem mt17 = new JMenuItem("全选(A)",'A');
		JMenuItem mt18 = new JMenuItem("时间/日期(D)",'D');
		//组合键的设置
		mt8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,InputEvent.CTRL_MASK));	//辙稍		
		mt9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_MASK));	//剪切
		mt10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));//复制
		mt11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_MASK));//粘贴
		mt12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));//删除	
		mt13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.CTRL_MASK));//查找
		mt14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));//查找下一个
		mt15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_MASK));//替换
		mt16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,InputEvent.CTRL_MASK));//转到
		mt17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));//全选
		mt18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));//时间/日期
		
		mb.add(mu2);
		mu2.add(mt8);
		mu2.addSeparator();//分隔线
		mu2.add(mt9);
		mu2.add(mt10);
		mu2.add(mt11);
		mu2.add(mt12);
		mu2.addSeparator();
		mu2.add(mt13);
		mu2.add(mt14);
		mu2.add(mt15);
		mu2.add(mt16);
		mu2.addSeparator();
		mu2.add(mt17);
		mu2.add(mt18);
		
		//设置格式菜单
		JMenu mu3 = new JMenu("格式(O)",true);
		mu3.setMnemonic('O');		
		 mt19 = new JCheckBoxMenuItem("自动换行(W)");
		mt19.setMnemonic('W');
		JMenuItem mt20 = new JMenuItem("字体(F)...",'F');
		JMenuItem mtys = new JMenuItem("颜色");
		
		mb.add(mu3);	
		mu3.add(mt19);
		mu3.add(mt20);
		mu3.add(mtys);
		
		//设置查看菜单
		JMenu mu4 = new JMenu("查看(V)",true);
		mu4.setMnemonic('V');
		JCheckBoxMenuItem mt21 = new JCheckBoxMenuItem("状态栏(S)");
		mt21.setMnemonic('S');
		mb.add(mu4);
		mu4.add(mt21);
	
		//设置帮助菜单
		JMenu mu5 = new JMenu("帮助(H)",true);
		mu5.setMnemonic('H');
		JMenuItem mt22 = new JMenuItem("帮助文档(H)",'H');
		JMenuItem mt23 = new JMenuItem("关于记事本(A)",'A');
		mt22.addActionListener(this);
		mt23.addActionListener(this);
		
		mb.add(mu5);
		mu5.add(mt22);
		mu5.addSeparator();
		mu5.add(mt23);
		
		setVisible(true);
		//显示记事本的位置
		setBounds(400,200,500,400);		
		
		//设置右键菜单
		pm = new JPopupMenu();			
		JMenuItem undo = new JMenuItem("辙销(U)",'U');
		JMenuItem cut  = new JMenuItem("剪切(T)");
		cut.setMnemonic('T');
		JMenuItem copy = new JMenuItem("复制(C)",'C');
		JMenuItem paste = new JMenuItem("粘贴(P)",'P');
		JMenuItem Delete = new JMenuItem("删除(D)",'D');
		JMenuItem All = new JMenuItem("全选(A)",'A');
		//undo.setEnabled(false);//撤消选项初始设为不可用
		 ta.add(pm);
		 ta.addMouseListener(new MouseAdapter(){
			   public void mouseReleased(MouseEvent e)
			   {
			    
				   if(e.isPopupTrigger())
			    {			   
					   pm.show(ta,e.getX(),e.getY());
			    }
			   }
			   public void mousePressed(MouseEvent e)
			   {
			    mouseReleased(e);
			   } 
			   
			  });
		pm.add(undo);
		pm.addSeparator();
		pm.add(cut);
		pm.add(copy);
		pm.add(paste);
		pm.add(Delete);
		pm.addSeparator();
		pm.add(All);
		undo.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		Delete.addActionListener(this);
		All.addActionListener(this);
		
		//系统剪贴板
		Toolkit tk = Toolkit.getDefaultToolkit();
		Clipboard clipBoard  = tk.getSystemClipboard();	   
	}	
	public static void main(String[] args)
	{
		new Jishiben();
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("辙销")) 
		{
		
		}
		if(e.getActionCommand()=="剪切(T)")
		{
			ta.cut();
		}
		if(e.getActionCommand().equals("复制(C)"))
		{
			ta.copy();
		}
		if(e.getActionCommand().equals("粘贴(P)"))
		{
			ta.paste();
		}
		if(e.getSource().equals("自动换行(W)"))
		{
			 if(mt19.getState())
			   { 
				    ta.setLineWrap(true); 
				    ta.setWrapStyleWord(true); 
				} 
				   else 
				   { 
				   ta.setLineWrap(false); 
				    ta.setWrapStyleWord(false); 
				   } 

		}
		
	}
			
}

