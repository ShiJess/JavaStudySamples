

import javax.swing.JDialog;
import javax.swing.JLabel;

public class TextCount extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8939467898581483799L;

	/**
	 * Launch the application
	 * @param args
	 */
	public TextCount() {
		super();
		getContentPane().setLayout(null);
		setBounds(200, 200, 200, 300);
		
		this.setVisible(true);
		
		String stringCount = TextEditor.textArea.getText();
		char[] count = stringCount.toCharArray();
		int spaceCount = 0;//ͳ�ƿո�
		int enterCount = 1;//ͳ�ƻ���
		int charCount = 0;//ͳ������
		int acount = 0;//ͳ���ַ�a�ĸ���
		for(int i = 0; i < count.length; i++){
			if(32 == count[i]){
				spaceCount++;
			}else if('\n' == count[i]){
				enterCount++;
			}else if(count[i] > 47 && count[i] > 58 || count[i] > 64){
				charCount++;
				if(count[i]=='a')
					acount++;
			}
		}
		final JLabel label = new JLabel("ͳ����Ϣ��");
		label.setBounds(41, 0, 66, 27);
		getContentPane().add(label);

		final JLabel label_1 = new JLabel("�ַ���");
		label_1.setBounds(22, 33, 50, 27);
		getContentPane().add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText(count.length + "");
		label_2.setBounds(96, 33, 52, 27);
		getContentPane().add(label_2);

		final JLabel label_3 = new JLabel("�ո���");
		label_3.setBounds(22, 66, 50, 27);
		getContentPane().add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setText(spaceCount + "");
		label_4.setBounds(96, 66, 52, 27);
		getContentPane().add(label_4);

		final JLabel label_5 = new JLabel("����");
		label_5.setBounds(22, 99, 50, 27);
		getContentPane().add(label_5);

		final JLabel label_6 = new JLabel();
		label_6.setText(charCount + "");
		label_6.setBounds(96, 99, 52, 27);
		getContentPane().add(label_6);

		final JLabel label_rows = new JLabel("����");
		label_rows.setBounds(22, 132, 50, 27);
		getContentPane().add(label_rows);

		final JLabel labelRows = new JLabel();
		labelRows.setText(enterCount + "");
		labelRows.setBounds(96, 132, 52, 27);
		getContentPane().add(labelRows);
		
		final JLabel label_a = new JLabel("'a'����");
		label_a.setBounds(22, 160, 50, 27);
		getContentPane().add(label_a);

		final JLabel labela = new JLabel();
		labela.setText(acount + "");
		labela.setBounds(96, 160, 52, 27);
		getContentPane().add(labela);
	}
	public void qu()//�˽�Ϊ��������û�У���
	{
	}
	

}
