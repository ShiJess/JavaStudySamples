

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NoteHelp extends JFrame {

	/**
	 * 
	 * Launch the application
	 * 
	 * @param args
	 */
	public NoteHelp() {
		super("JAVA记事本帮助");
		JTextArea textArea = new JTextArea(9, 10);

		JLabel label = new JLabel("记事本：常见问题解答");
		label.setForeground(new Color(0, 128, 0));
		label.setFont(new Font("", Font.BOLD, 24));
		label.setBounds(0, 0, 390, 40);
		textArea.add(label);

		JLabel label_1 = new JLabel("以下是一些有关记事本的常见问题解答");
		label_1.setFont(new Font("", Font.BOLD, 18));
		label_1.setBounds(0, 46, 390, 31);
		textArea.add(label_1);

		JLabel label_2 = new JLabel("什么是记事本？");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("", Font.BOLD, 18));
		label_2.setBounds(0, 104, 390, 24);
		textArea.add(label_2);

		JLabel label_3 = new JLabel(" 记事本是一个基本的文本编辑程序，最常用于查看或编辑文本文件。");
		label_3.setFont(new Font("", Font.BOLD, 12));
		label_3.setBounds(0, 134, 420, 18);
		textArea.add(label_3);

		JLabel label_4 = new JLabel(" 文本文件是通常由 .txt 文件扩展名标识的文件类型。");
		label_4.setFont(new Font("", Font.BOLD, 12));
		label_4.setBounds(0, 164, 390, 18);
		textArea.add(label_4);

		JLabel label_5 = new JLabel("如何更改字形和字号？");
		label_5.setForeground(Color.BLUE);
		label_5.setFont(new Font("", Font.BOLD, 18));
		label_5.setBounds(0, 194, 390, 24);
		textArea.add(label_5);

		JLabel label_6 = new JLabel(" 对字形和字号的更改会影响文档中的所有文本。");
		label_6.setFont(new Font("", Font.BOLD, 12));
		label_6.setBounds(0, 224, 390, 18);
		textArea.add(label_6);
		
		JLabel label_7 = new JLabel("  1. 单击“格式”菜单，然后单击“字体”。");
		label_7.setFont(new Font("", Font.BOLD, 12));
		label_7.setBounds(0, 250, 390, 18);
		textArea.add(label_7);

		JLabel label_8 = new JLabel("  2. 在“字体”、“字形”和“字号”框中进行选择。");
		label_8.setFont(new Font("", Font.BOLD, 12));
		label_8.setBounds(0, 274, 390, 18);
		textArea.add(label_8);

		JLabel label_9 = new JLabel("      在“示例”下显示字体的外观示例。");
		label_9.setFont(new Font("", Font.BOLD, 12));
		label_9.setBounds(0, 298, 390, 18);
		textArea.add(label_9);

		JLabel label_10 = new JLabel("  3. 完成字体选择后，请单击“确定”。");
		label_10.setFont(new Font("", Font.BOLD, 12));
		label_10.setBounds(0, 322, 390, 18);
		textArea.add(label_10);

		JLabel label_11 = new JLabel(" 如何剪切、复制、粘贴或删除文本？");
		label_11.setForeground(Color.BLUE);
		label_11.setFont(new Font("", Font.BOLD, 18));
		label_11.setBounds(0, 346, 390, 24);
		textArea.add(label_11);

		JLabel label_12 = new JLabel("  ●若要剪切文本以便可以将它移动到其他位置，请选择文本，单击“编辑”菜单，然后单击“剪切”。");
		label_12.setFont(new Font("", Font.BOLD, 12));
		label_12.setBounds(0, 376, 681, 18);
		textArea.add(label_12);

		JLabel label_13 = new JLabel("  ●若要复制文本以便可以将它粘贴到其他位置，请选择文本，单击“编辑”菜单，然后单击“复制”。");
		label_13.setFont(new Font("", Font.BOLD, 12));
		label_13.setBounds(0, 400, 627, 18);
		textArea.add(label_13);

		JLabel label_14 = new JLabel("  ●若要粘贴已经剪切或复制的文本，请在文件中要粘贴文本的位置单击，单击“编辑”菜单，然后单击“粘贴”。");
		label_14.setFont(new Font("", Font.BOLD, 12));
		label_14.setBounds(0, 424, 681, 18);
		textArea.add(label_14);

		JLabel label_15 = new JLabel("  ●若要粘贴已经剪切或复制的文本，请在文件中要粘贴文本的位置单击，单击“编辑”菜单，然后单击“粘贴”。");
		label_15.setFont(new Font("", Font.BOLD, 12));
		label_15.setBounds(0, 448, 703, 18);
		textArea.add(label_15);
		
		JLabel label_16 = new JLabel("  ●若要撤消上次操作，请单击“编辑”菜单，然后单击“撤消”。");
		label_16.setFont(new Font("", Font.BOLD, 12));
		label_16.setBounds(0, 472, 616, 18);
		textArea.add(label_16);

		JLabel label_17 = new JLabel(" 如何查找和替换特定的字符或单词？");
		label_17.setForeground(Color.BLUE);
		label_17.setFont(new Font("", Font.BOLD, 18));
		label_17.setBounds(0, 496, 390, 24);
		textArea.add(label_17);

		JLabel label_18 = new JLabel(" 查找特定的字符或单词的步骤");
		label_18.setFont(new Font("", Font.BOLD, 12));label_18.setFont(new Font("", Font.BOLD, 12));
		label_18.setBounds(0, 526, 221, 18);
		textArea.add(label_18);

		JLabel label_19 = new JLabel("  1. 单击“编辑”菜单，然后单击“查找”。");
		label_19.setFont(new Font("", Font.BOLD, 12));
		label_19.setBounds(0, 550, 369, 18);
		textArea.add(label_19);

		JLabel label_20 = new JLabel("  2. 在“查找内容”框中，键入要查找的字符或单词。");
		label_20.setFont(new Font("", Font.BOLD, 12));
		label_20.setBounds(0, 574, 433, 18);
		textArea.add(label_20);
		
		JLabel label_21 = new JLabel("  3. 在“方向”下，单击“向上”从当前光标位置向文档顶部进行搜索，单击“向下”从光标位置向文档底部进行搜索。");
		label_21.setFont(new Font("", Font.BOLD, 12));
		label_21.setBounds(0, 598, 727, 18);
		textArea.add(label_21);
		
		JLabel label_22 = new JLabel("  4. 单击“查找下一个”。");
		label_22.setFont(new Font("", Font.BOLD, 12));
		label_22.setBounds(0, 622, 335, 18);
		textArea.add(label_22);

		JLabel label_23 = new JLabel(" 替换特定的字符或单词的步骤");
		label_23.setFont(new Font("", Font.BOLD, 12));
		label_23.setBounds(0, 646, 305, 18);
		textArea.add(label_23);

		JLabel label_24 = new JLabel("  1. 单击“编辑”菜单，然后单击“替换”。");
		label_24.setFont(new Font("", Font.BOLD, 12));
		label_24.setBounds(0, 670, 256, 18);
		textArea.add(label_24);

		JLabel label_25 = new JLabel("  2. 在“查找内容”框中，键入要查找的字符或单词。");
		label_25.setFont(new Font("", Font.BOLD, 12));
		label_25.setBounds(0, 694, 305, 18);
		textArea.add(label_25);

		JLabel label_26 = new JLabel("  3. 在“替换为”框中，键入替换文本。");
		label_26.setFont(new Font("", Font.BOLD, 12));
		label_26.setBounds(0, 718, 305, 18);
		textArea.add(label_26);

		JLabel label_27 = new JLabel("  4. 单击“查找下一个”，然后单击“替换”。");
		label_27.setFont(new Font("", Font.BOLD, 12));
		label_27.setBounds(0, 744, 305, 18);
		textArea.add(label_27);

		JLabel label_28 = new JLabel("      若要替换文本的全部实例，请单击“全部替换”。");
		label_28.setFont(new Font("", Font.BOLD, 12));
		label_28.setBounds(0, 768, 390, 18);
		textArea.add(label_28);
		
		JLabel label_29 = new JLabel("欢迎使用Java记事本帮助");
		label_29.setForeground(Color.RED);
		label_29.setFont(new Font("", Font.BOLD, 20));
		label_29.setBounds(0, 804, 390, 18);
		textArea.add(label_29);
		
		String space = new String();
		String enter = new String();
		for(int i = 0; i <= 225;i++){
			space += " ";
			if(i % 5 ==0)
			enter += "\n";	
		}
		textArea.setText(space + enter);
		textArea.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setForeground(new Color(255, 0, 0));
		scroll.setBounds(86, 156, 382, 116);
		getContentPane().add(scroll);
		
		setBounds(150, 150, 400, 500);// 设置位置和大小
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
