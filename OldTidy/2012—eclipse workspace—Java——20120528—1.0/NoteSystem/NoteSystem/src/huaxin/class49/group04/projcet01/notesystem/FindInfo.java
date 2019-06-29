package huaxin.class49.group04.projcet01.notesystem;

//�������õ���Ӧ�İ�
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
 * ����ʵ�����öԻ�����ҡ��滻��ȫ���滻�ı���Ϣ�Ĺ���
 * @author ����
 * @version 1.0 2008/1/5
 */
class FindInfo extends JDialog {
	private int intTextFindIndex = 0;						//Ҫ�����ݵ��±�
	private int intTextFindLength = 0;						//Ҫ�����ݵĳ���
	private int num = 0;
	final JTextField textFind = new JTextField(15);			//���������Ϣ���ı���
	private int count = 0;									//��λ�����￪ʼ��ѯ
	private JPanel pane1 = new JPanel();
	private JPanel pane2 = new JPanel();
	private JPanel pane3 = new JPanel();
	
	public FindInfo(NoteGUI noteGUI,String str){
		super(noteGUI);										//���ø��๹�캯��Ϊ�Ի���ָ��������

		this.setLocation(350,300);
		this.setTitle(str);

		JLabel labelFind = new JLabel("��������");
		JLabel labelChange = new JLabel("�滻����");
		
		final JTextField textChange = new JTextField(15);	//�����滻��Ϣ���ı���
		JButton buttonFind = new JButton("����");
		
		final JButton buttonChange = new JButton("�滻");
		buttonChange.setEnabled(false);
		JButton buttonAllChange = new JButton("ȫ���滻");
		JButton buttonCancel = new JButton("ȡ��");
		
		this.setSize(400,150);
		this.setResizable(false);
		
		pane1.add(labelFind);
		pane1.add(textFind);
		pane1.add(buttonFind);
		this.getContentPane().add(pane1,BorderLayout.NORTH);
		
		
		buttonFind.addActionListener(new ActionListener(){		//��buttonFind��Ӽ���
			
			//	�˷�����Ҫʵ�ֲ�ѯ
			public void actionPerformed(ActionEvent eFind){
					//change("find");	
				String  textAreaText = NoteGUI.textArea.getText();
				String strTextFind = textFind.getText();
				
				if(strTextFind.equals("")){
					JOptionPane.showMessageDialog(null, "������Ҫ��ѯ����Ϣ", "���ҽ��",1);
					
				}else{
					
					if(intTextFindIndex >= 0){
						intTextFindIndex = textAreaText.indexOf(strTextFind,count);
					
					
						intTextFindLength = strTextFind.length();
						count = intTextFindIndex + intTextFindLength;
					
						if(intTextFindIndex == -1){
							JOptionPane.showMessageDialog(null, "û����Ҫ���ҵ���Ϣ", "���ҽ��",1); 	//�����Ի�����ʾΪ�ҵ������1ΪҪ��ʾ����Ϣ����ERROR_MESSAGE
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
		
		buttonChange.addActionListener(new ActionListener(){	//��buttonChange��Ӽ���
			
			//�˷���ʵ���˵����滻
			public void actionPerformed(ActionEvent eChange) { 
				String strRepleace = textChange.getText(); 			//strRepleace���Ҫ���滻���ݵ�����
				
				if(strRepleace.equals("")) { 
					JOptionPane.showMessageDialog(null, "������Ҫ�滻����Ϣ", "�滻����",1);
				}else{
					
					JOptionPane.showMessageDialog(null, "ȷ��Ҫ�滻��", "",1);
					//change("change");
				
					NoteGUI.textArea.replaceSelection(strRepleace); 	//ʵ���滻
					JOptionPane.showMessageDialog(null, "�滻���", "�滻����",1);
					buttonChange.setEnabled(false);
				} 
			}
		});

		pane2.add(buttonChange);
		this.getContentPane().add(pane2, BorderLayout.CENTER);
		
		buttonAllChange.addActionListener(new ActionListener(){		//��buttonAllChange��Ӽ���
			
			//�˷���ʵ����ȫ���滻
			public void actionPerformed(ActionEvent eAllChange){
				
				String strRepleace = textChange.getText(); 			
				
				if(strRepleace.equals("")){
					JOptionPane.showMessageDialog(null, "������Ҫ�滻����Ϣ", "�滻����",1);
				}else{
					//change();
					JOptionPane.showMessageDialog(null, "ȷ��Ҫ�滻��", "",1);
					
					intTextFindIndex = 0;
					intTextFindLength = 0;
					count = 0;
					while(intTextFindIndex > -1){					//ʵ��ȫ���滻�Ĺ���
						
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
					JOptionPane.showMessageDialog(null,"ȫ���滻���,�滻�ĸ����ǣ�" + num,"�滻����",1);
					num = 0;
				}
			
			}
		});

		pane3.add(buttonAllChange);
		
		buttonCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent eCancel){
				JOptionPane.showMessageDialog(null,"ȷ��ȡ��","",1);
				dispose();
			}
		});

		pane3.add(buttonCancel);
		this.getContentPane().add(pane3, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	//�˷���ʵ���˲�ѯ����
	/*public void change(String str){
		
		String  textAreaText = NoteGUI.textArea.getText();
		String strTextFind = textFind.getText();
		
		if(strTextFind.equals("")){
			JOptionPane.showMessageDialog(null, "������Ҫ��ѯ����Ϣ", "���ҽ��",1);
			
		}else{
			
			if(intTextFindIndex >= 0){
				intTextFindIndex = textAreaText.indexOf(strTextFind,count);
			
			
				intTextFindLength = strTextFind.length();
				count = intTextFindIndex + intTextFindLength;
			
				if(intTextFindIndex == -1){
					JOptionPane.showMessageDialog(null, "û����Ҫ���ҵ���Ϣ", "���ҽ��",1); 	//�����Ի�����ʾΪ�ҵ������1ΪҪ��ʾ����Ϣ����ERROR_MESSAGE
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
