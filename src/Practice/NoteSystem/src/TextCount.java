

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class TextCount extends JDialog {

	/**
	 * Launch the application
	 * @param args
	 */
	public TextCount() {
		super();
		getContentPane().setLayout(null);
		setBounds(100, 100, 174, 201);
		
		this.setVisible(true);
		
		String stringCount = NoteGUI.textArea.getText();
		char[] count = stringCount.toCharArray();
		int spaceCount = 0;//统计空格
		int enterCount = 1;//统计换行
		int charCount = 0;//统计字数
		for(int i = 0; i < count.length; i++){
			if(32 == count[i]){
				spaceCount++;
			}else if('\n' == count[i]){
				enterCount++;
			}else if(count[i] > 47 && count[i] > 58 || count[i] > 64){
				charCount++;
			}
		}
		final JLabel label = new JLabel("统计信息：");
		label.setBounds(41, 0, 66, 27);
		getContentPane().add(label);

		final JLabel label_1 = new JLabel("字符数");
		label_1.setBounds(22, 33, 50, 27);
		getContentPane().add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText(count.length + "");
		label_2.setBounds(96, 33, 52, 27);
		getContentPane().add(label_2);

		final JLabel label_3 = new JLabel("空格数");
		label_3.setBounds(22, 66, 50, 27);
		getContentPane().add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setText(spaceCount + "");
		label_4.setBounds(96, 66, 52, 27);
		getContentPane().add(label_4);

		final JLabel label_5 = new JLabel("字数");
		label_5.setBounds(22, 99, 50, 27);
		getContentPane().add(label_5);

		final JLabel label_6 = new JLabel();
		label_6.setText(charCount + "");
		label_6.setBounds(96, 99, 52, 27);
		getContentPane().add(label_6);

		final JLabel label_rows = new JLabel("行数");
		label_rows.setBounds(22, 132, 50, 27);
		getContentPane().add(label_rows);

		final JLabel labelRows = new JLabel();
		labelRows.setText(enterCount + "");
		labelRows.setBounds(96, 132, 52, 27);
		getContentPane().add(labelRows);
		
		//
	}

}
