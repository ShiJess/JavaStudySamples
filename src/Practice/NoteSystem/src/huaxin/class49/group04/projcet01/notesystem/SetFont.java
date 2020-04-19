package huaxin.class49.group04.projcet01.notesystem;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class SetFont extends JDialog implements ListSelectionListener{

	private JList listStyle;
	private JList listChar;
	private JList listSize;
	private JComboBox comboBoxChars;
	private JTextField textField_1;
	private JTextField textFieldSize;
	private JTextField textFieldChar;
	private JTextField textFieldStyle;
	private GraphicsEnvironment font;
	private Font[] fonts;
	/**
	 * Launch the application
	 * @param args
	 */

	public SetFont(NoteGUI noteGUI) {
		super();
		setTitle("字体");
		this.setModal(true);
		getContentPane().setLayout(null);
		setBounds(100, 100, 460, 285);

		final JLabel label = new JLabel("字体");
		label.setBounds(35, 0, 44, 24);
		getContentPane().add(label);

		final JLabel label_1 = new JLabel("字形");
		label_1.setBounds(180, 0, 37, 24);
		getContentPane().add(label_1);

		final JLabel label_2 = new JLabel(" 大小");
		label_2.setBounds(269, 0, 44, 24);
		getContentPane().add(label_2);

		final JButton buttonFinish = new JButton("确定");
		buttonFinish.setBounds(353, 29, 86, 33);
		buttonFinish.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setUserFont();	
				dispose();
			}			
		});
		getContentPane().add(buttonFinish);

		textFieldStyle = new JTextField("宋体");
		textFieldStyle.setBounds(10, 25, 152, 33);
		getContentPane().add(textFieldStyle);

		textFieldChar = new JTextField("常规");
		textFieldChar.setBounds(165, 25, 87, 33);
		getContentPane().add(textFieldChar);

		textFieldSize = new JTextField("10");
		textFieldSize.setBounds(260, 25, 86, 33);
		getContentPane().add(textFieldSize);

		final JButton buttonCancel = new JButton("取消");
		buttonCancel.setBounds(353, 99, 86, 33);
		buttonCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {	
				dispose();
			}			
		});
		getContentPane().add(buttonCancel);

		
		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("", Font.PLAIN, 26));
		label_3.setText("示例");
		label_3.setBounds(15, 196, 64, 41);
		getContentPane().add(label_3);

		textField_1 = new JTextField("AaBbCc");
		textField_1.setEditable(false);
		textField_1.setBounds(85, 198, 166, 47);
		getContentPane().add(textField_1);

		final JLabel labelChars = new JLabel();
		labelChars.setFont(new Font("", Font.PLAIN, 15));
		labelChars.setText("字符集");
		labelChars.setBounds(261, 205, 52, 30);
		getContentPane().add(labelChars);

		comboBoxChars = new JComboBox();
		comboBoxChars.setBounds(319, 205, 120, 33);
		getContentPane().add(comboBoxChars);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 152, 130);
		getContentPane().add(scrollPane);

		listStyle = new JList();
		listStyle.addListSelectionListener(this);
		scrollPane.setViewportView(listStyle);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(261, 60, 87, 130);
		getContentPane().add(scrollPane_1);

		listSize = new JList();
		listSize.addListSelectionListener(this);
		scrollPane_1.setViewportView(listSize);

		listChar = new JList();
		listChar.addListSelectionListener(this);
		listChar.setBounds(165, 60, 87, 130);
		getContentPane().add(listChar);
		setListSize();
		setListChar();
		getSystemFont();
	}
	public void setListSize(){
		String[] size = new String[32];
		for(int i = 10,j = 0;j <= 31 && i <= 72;j++,i+=2){
			size[j] = "" + i;
		}
		listSize.setListData(size);
	}
	public void getSystemFont(){
		font = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fonts = font.getAllFonts();
		String[] fontName = new String[fonts.length];
		for(int i = 0; i < fonts.length; i++){
			fontName[i] = fonts[i].getFontName();
		}
		listStyle.setListData(fontName);
		
	}
	private void setListChar() {
		String chara[] = { "常规", "斜体", "粗体", "粗斜体" };
		listChar.setListData(chara);
	}
	private void setUserFont(){
		String font_size = textFieldSize.getText();	
		int size = 1;
		try{
			size = Integer.parseInt(font_size);
		}catch(NumberFormatException e){
			System.out.println("输入非法");
			e.printStackTrace();
		}
		String font_font = textFieldStyle.getText();
		Font f = new Font(font_font,getStyle(),size);
		textField_1.setFont(f);
		NoteGUI.textArea.setFont(f);
	}
	private int getStyle(){
		int style = -1;
		String font_char = textFieldChar.getText();
		if(font_char.equals("常规"))
			style = Font.PLAIN;
		else if(font_char.equals("斜体"))
			style = Font.ITALIC;
		else if(font_char.equals("粗体"))
			style = Font.BOLD;
		else 
			style = Font.BOLD + Font.ITALIC;
		return style;
	}
	public void valueChanged(ListSelectionEvent e) {
		String font_size = textFieldSize.getText();	
		int size = 1;
		try{
			size = Integer.parseInt(font_size);
		}catch(NumberFormatException eg){
			eg.printStackTrace();
		}
		String font_font = textFieldStyle.getText();
		Font f = new Font(font_font,getStyle(),size);
		textField_1.setFont(f);
		NoteGUI.textArea.setFont(f);
		if(e.getSource() == listStyle){
			textField_1.setFont(f);
			textFieldStyle.setText("" + listStyle.getSelectedValue());
		}else if(e.getSource() == listSize){
			textField_1.setFont(f);
			textFieldSize.setText(listSize.getSelectedValue().toString());
		}else if(e.getSource() == listChar){
			textField_1.setFont(f);
			textFieldChar.setText("" + listChar.getSelectedValue());
		}
	}

}
