package huaxin.class49.group04.projcet01.notesystem;

//引入所用到相应的包
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 本类实现了用对话框查找、替换和全部替换文本信息的功能
 * @author 靳纲
 * @version 1.0 2008/1/5
 */
class FindInfo extends JDialog {
	private int intTextFindIndex = 0;						//要查内容的下标
	private int intTextFindLength = 0;						//要查内容的长度
	private int num = 0;
	final JTextField textFind = new JTextField(15);			//输入查找信息的文本框
	private int count = 0;									//定位从哪里开始查询
	private JPanel pane1 = new JPanel();
	private JPanel pane2 = new JPanel();
	private JPanel pane3 = new JPanel();
	
	public FindInfo(NoteGUI noteGUI,String str){
		super(noteGUI);										//调用父类构造函数为对话框指定父窗体

		this.setLocation(350,300);
		this.setTitle(str);

		JLabel labelFind = new JLabel("查找内容");
		JLabel labelChange = new JLabel("替换内容");
		
		final JTextField textChange = new JTextField(15);	//输入替换信息的文本框
		JButton buttonFind = new JButton("查找");
		
		final JButton buttonChange = new JButton("替换");
		buttonChange.setEnabled(false);
		JButton buttonAllChange = new JButton("全部替换");
		JButton buttonCancel = new JButton("取消");
		
		this.setSize(400,150);
		this.setResizable(false);
		
		pane1.add(labelFind);
		pane1.add(textFind);
		pane1.add(buttonFind);
		this.getContentPane().add(pane1,BorderLayout.NORTH);
		
		
		buttonFind.addActionListener(new ActionListener(){		//对buttonFind添加监听
			
			//	此方法主要实现查询
			public void actionPerformed(ActionEvent eFind){
					//change("find");	
				String  textAreaText = NoteGUI.textArea.getText();
				String strTextFind = textFind.getText();
				
				if(strTextFind.equals("")){
					JOptionPane.showMessageDialog(null, "请输入要查询的信息", "查找结果",1);
					
				}else{
					
					if(intTextFindIndex >= 0){
						intTextFindIndex = textAreaText.indexOf(strTextFind,count);
					
					
						intTextFindLength = strTextFind.length();
						count = intTextFindIndex + intTextFindLength;
					
						if(intTextFindIndex == -1){
							JOptionPane.showMessageDialog(null, "没有您要查找的信息", "查找结果",1); 	//调出对话框提示为找到结果，1为要显示的消息类型ERROR_MESSAGE
							intTextFindIndex = 0; 
							count = 0; 
						}else{
							
							NoteGUI.textArea.requestFocus();
							NoteGUI.textArea.select(intTextFindIndex,count);
							buttonChange.setEnabled(true);
										
							}
					
					}
				}
				}
		});
		
		pane2.add(labelChange);
		pane2.add(textChange);
		
		buttonChange.addActionListener(new ActionListener(){	//对buttonChange添加监听
			
			//此方法实现了单个替换
			public void actionPerformed(ActionEvent eChange) { 
				String strRepleace = textChange.getText(); 			//strRepleace存放要被替换内容的内容
				
				if(strRepleace.equals("")) { 
					JOptionPane.showMessageDialog(null, "请输入要替换的信息", "替换内容",1);
				}else{
					
					JOptionPane.showMessageDialog(null, "确定要替换吗？", "",1);
					//change("change");
				
					NoteGUI.textArea.replaceSelection(strRepleace); 	//实现替换
					JOptionPane.showMessageDialog(null, "替换完毕", "替换内容",1);
					buttonChange.setEnabled(false);
				} 
			}
		});

		pane2.add(buttonChange);
		this.getContentPane().add(pane2, BorderLayout.CENTER);
		
		buttonAllChange.addActionListener(new ActionListener(){		//对buttonAllChange添加监听
			
			//此方法实现了全部替换
			public void actionPerformed(ActionEvent eAllChange){
				
				String strRepleace = textChange.getText(); 			
				
				if(strRepleace.equals("")){
					JOptionPane.showMessageDialog(null, "请输入要替换的信息", "替换内容",1);
				}else{
					//change();
					JOptionPane.showMessageDialog(null, "确定要替换吗？", "",1);
					
					intTextFindIndex = 0;
					intTextFindLength = 0;
					count = 0;
					while(intTextFindIndex > -1){					//实现全部替换的过程
						
						String strTextFind = textFind.getText();
						String  textAreaText = NoteGUI.textArea.getText();
						
						intTextFindIndex = textAreaText.indexOf(strTextFind,count);
						if(intTextFindIndex == -1){
							break;
						}
						intTextFindLength = strTextFind.length();
						count = intTextFindIndex + intTextFindLength;		
						NoteGUI.textArea.select(intTextFindIndex,count);
						NoteGUI.textArea.replaceSelection(strRepleace);
						
						
						num++;
					}
					JOptionPane.showMessageDialog(null,"全部替换完毕,替换的个数是：" + num,"替换内容",1);
					num = 0;
				}
			
			}
		});

		pane3.add(buttonAllChange);
		
		buttonCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent eCancel){
				JOptionPane.showMessageDialog(null,"确定取消","",1);
				dispose();
			}
		});

		pane3.add(buttonCancel);
		this.getContentPane().add(pane3, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	//此方法实现了查询功能
	/*public void change(String str){
		
		String  textAreaText = NoteGUI.textArea.getText();
		String strTextFind = textFind.getText();
		
		if(strTextFind.equals("")){
			JOptionPane.showMessageDialog(null, "请输入要查询的信息", "查找结果",1);
			
		}else{
			
			if(intTextFindIndex >= 0){
				intTextFindIndex = textAreaText.indexOf(strTextFind,count);
			
			
				intTextFindLength = strTextFind.length();
				count = intTextFindIndex + intTextFindLength;
			
				if(intTextFindIndex == -1){
					JOptionPane.showMessageDialog(null, "没有您要查找的信息", "查找结果",1); 	//调出对话框提示为找到结果，1为要显示的消息类型ERROR_MESSAGE
					intTextFindIndex = 0; 
					count = 0; 
				}else{
					
					NoteGUI.textArea.requestFocus();
					NoteGUI.textArea.select(intTextFindIndex,count);
								
					}
			
			}
		}
	}*/
}
