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
	boolean isNewFile=true;    //�Ƿ����ļ�(δ�������)
	File currentFile;                 //��ǰ�ļ���
	String oldValue;           //��ű༭��ԭ��������,���ڱȽ��ı��Ƿ��иĶ�
	//protected UndoManager undo = new UndoManager();
	//protected UndoableEditListener undoHandler = new UndoHandler();
	JToolBar tbar = new JToolBar();
	JCheckBoxMenuItem mt19;
	public Jishiben()
	{		
		super("���±�");
		//Container ct=getContentPane();
		//�������������ñ༭���򼰹�����
	    ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		add(sp);
		JMenuBar mb = new JMenuBar();
		//�����ļ��˵�
		JMenu mu1 = new JMenu("�ļ�(F)",true);
		mu1.setMnemonic('F');//���ÿ�ݼ�����ALT+F����򿪲˵�
		
		JMenuItem mt1 = new JMenuItem("�½�(N)",'N');
		mt1.setMnemonic('N');
		//mt1.addActionListener(new new1());
		
		
		JMenuItem mt2 = new JMenuItem("��(O)...",'O');	
		mt2.setMnemonic('O');
		mt2.addActionListener(this);
		
		JMenuItem mt3 = new JMenuItem("����(S)",'S');
		//mt3.addActionListener(new save());
		mu1.add(mt3);
		
		JMenuItem mt4 = new JMenuItem("���Ϊ(A)...");
		JMenuItem mt5 = new JMenuItem("ҳ������(A)...");
		JMenuItem mt6 = new JMenuItem("��ӡ(P)...");
		
		JMenuItem mt7 = new JMenuItem("�˳�(X)",'X');
		//��ϼ�������
		mt1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));	//�½�		
		mt2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));	//��
		mt3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK)); //����
		mt6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.CTRL_MASK));	//��ӡ		
		
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
		
		//���ñ༭�˵�
		JMenu mu2 = new JMenu("�༭(E)",true);
		mu2.setMnemonic('E');
		JMenuItem mt8 = new JMenuItem("����(U)",'U');
		JMenuItem mt9 = new JMenuItem("����(T)",'T');
		JMenuItem mt10 = new JMenuItem("����(C)",'C');
		JMenuItem mt11 = new JMenuItem("ճ��(P)",'P');
		JMenuItem mt12 = new JMenuItem("ɾ��(L)",'L');
		JMenuItem mt13 = new JMenuItem("����(F)",'F');
		JMenuItem mt14 = new JMenuItem("������һ��(N)",'N');
		JMenuItem mt15 = new JMenuItem("�滻(R)...",'R');
		JMenuItem mt16 = new JMenuItem("ת��(G)...",'G');
		JMenuItem mt17 = new JMenuItem("ȫѡ(A)",'A');
		JMenuItem mt18 = new JMenuItem("ʱ��/����(D)",'D');
		//��ϼ�������
		mt8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,InputEvent.CTRL_MASK));	//����		
		mt9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_MASK));	//����
		mt10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));//����
		mt11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_MASK));//ճ��
		mt12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));//ɾ��	
		mt13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.CTRL_MASK));//����
		mt14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));//������һ��
		mt15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_MASK));//�滻
		mt16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,InputEvent.CTRL_MASK));//ת��
		mt17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));//ȫѡ
		mt18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));//ʱ��/����
		
		mb.add(mu2);
		mu2.add(mt8);
		mu2.addSeparator();//�ָ���
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
		
		//���ø�ʽ�˵�
		JMenu mu3 = new JMenu("��ʽ(O)",true);
		mu3.setMnemonic('O');		
		 mt19 = new JCheckBoxMenuItem("�Զ�����(W)");
		mt19.setMnemonic('W');
		JMenuItem mt20 = new JMenuItem("����(F)...",'F');
		JMenuItem mtys = new JMenuItem("��ɫ");
		
		mb.add(mu3);	
		mu3.add(mt19);
		mu3.add(mt20);
		mu3.add(mtys);
		
		//���ò鿴�˵�
		JMenu mu4 = new JMenu("�鿴(V)",true);
		mu4.setMnemonic('V');
		JCheckBoxMenuItem mt21 = new JCheckBoxMenuItem("״̬��(S)");
		mt21.setMnemonic('S');
		mb.add(mu4);
		mu4.add(mt21);
	
		//���ð����˵�
		JMenu mu5 = new JMenu("����(H)",true);
		mu5.setMnemonic('H');
		JMenuItem mt22 = new JMenuItem("�����ĵ�(H)",'H');
		JMenuItem mt23 = new JMenuItem("���ڼ��±�(A)",'A');
		mt22.addActionListener(this);
		mt23.addActionListener(this);
		
		mb.add(mu5);
		mu5.add(mt22);
		mu5.addSeparator();
		mu5.add(mt23);
		
		setVisible(true);
		//��ʾ���±���λ��
		setBounds(400,200,500,400);		
		
		//�����Ҽ��˵�
		pm = new JPopupMenu();			
		JMenuItem undo = new JMenuItem("����(U)",'U');
		JMenuItem cut  = new JMenuItem("����(T)");
		cut.setMnemonic('T');
		JMenuItem copy = new JMenuItem("����(C)",'C');
		JMenuItem paste = new JMenuItem("ճ��(P)",'P');
		JMenuItem Delete = new JMenuItem("ɾ��(D)",'D');
		JMenuItem All = new JMenuItem("ȫѡ(A)",'A');
		//undo.setEnabled(false);//����ѡ���ʼ��Ϊ������
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
		
		//ϵͳ������
		Toolkit tk = Toolkit.getDefaultToolkit();
		Clipboard clipBoard  = tk.getSystemClipboard();	   
	}	
	public static void main(String[] args)
	{
		new Jishiben();
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("����")) 
		{
		
		}
		if(e.getActionCommand()=="����(T)")
		{
			ta.cut();
		}
		if(e.getActionCommand().equals("����(C)"))
		{
			ta.copy();
		}
		if(e.getActionCommand().equals("ճ��(P)"))
		{
			ta.paste();
		}
		if(e.getSource().equals("�Զ�����(W)"))
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

