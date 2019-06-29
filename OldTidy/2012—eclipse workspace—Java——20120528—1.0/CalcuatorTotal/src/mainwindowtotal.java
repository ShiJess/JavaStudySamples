import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class mainwindowtotal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4229984330415461934L;
	private JPanel contentPane;
	private JTextField textField;
	public double first=0,second;
	public int lastnum,thisnum;
	public Boolean havenumber=false,havepoint=false;
	public char calcuator;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainwindowtotal frame = new mainwindowtotal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainwindowtotal() {
		setFont(new Font("Dialog", Font.PLAIN, 20));
		setTitle("\u8BA1\u7B97\u5668\u3010\u53EF\u76F4\u63A5\u70B9\u51FB\u6570\u5B57\u8F93\u5165\u3011");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6570\u5B57");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(14, 60, 350, 288);
		lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.red));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(havenumber==false)
				{
					textField.setText(1+"");
					havenumber=true;
					lastnum=1;
				}
				else
				{
					if(havepoint==false)
					{
						lastnum=lastnum*10+1;
						textField.setText(lastnum+"");
					}
					else
					{
						thisnum=thisnum*10+1;
						textField.setText(lastnum+"."+thisnum);
					}
				}
			}
		});
		btnNewButton.setBounds(47, 102, 73, 49);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setFont(new Font("Dialog", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(havenumber==false)
				{
					textField.setText(2+"");
					havenumber=true;
					lastnum=2;
				}
				else
				{
					if(havepoint==false)
					{
						lastnum=lastnum*10+2;
						textField.setText(lastnum+"");
					}
					else
					{
						thisnum=thisnum*10+2;
						textField.setText(lastnum+"."+thisnum);
					}
				}
			}
		});
		button.setBounds(142, 102, 81, 49);
		contentPane.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(havenumber==false)
				{
					textField.setText(3+"");
					havenumber=true;
					lastnum=3;
				}
				else
				{
					if(havepoint==false)
					{
						lastnum=lastnum*10+3;
						textField.setText(lastnum+"");
					}
					else
					{
						thisnum=thisnum*10+3;
						textField.setText(lastnum+"."+thisnum);
					}
				}
			}
		});
		button_1.setBounds(250, 102, 86, 49);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(havenumber==false)
				{
					textField.setText(4+"");
					havenumber=true;
					lastnum=4;
				}
				else
				{
					if(havepoint==false)
					{
						lastnum=lastnum*10+4;
						textField.setText(lastnum+"");
					}
					else
					{
						thisnum=thisnum*10+4;
						textField.setText(lastnum+"."+thisnum);
					}
				}
			}
		});
		button_2.setBounds(47, 164, 73, 50);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(havenumber==false)
				{
					textField.setText(5+"");
					havenumber=true;
					lastnum=5;
				}
				else
				{
					if(havepoint==false)
					{
						lastnum=lastnum*10+5;
						textField.setText(lastnum+"");
					}
					else
					{
						thisnum=thisnum*10+5;
						textField.setText(lastnum+"."+thisnum);
					}
				}
			}
		});
		button_3.setBounds(142, 164, 81, 50);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(havenumber==false)
				{
					textField.setText(6+"");
					havenumber=true;
					lastnum=6;
				}
				else
				{
					if(havepoint==false)
					{
						lastnum=lastnum*10+6;
						textField.setText(lastnum+"");
					}
					else
					{
						thisnum=thisnum*10+6;
						textField.setText(lastnum+"."+thisnum);
					}
				}
			}
		});
		button_4.setBounds(250, 164, 86, 50);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(havenumber==false)
				{
					textField.setText(7+"");
					havenumber=true;
					lastnum=7;
				}
				else
				{
					if(havepoint==false)
					{
						lastnum=lastnum*10+7;
						textField.setText(lastnum+"");
					}
					else
					{
						thisnum=thisnum*10+7;
						textField.setText(lastnum+"."+thisnum);
					}
				}
			}
		});
		button_5.setBounds(47, 227, 73, 49);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(havenumber==false)
				{
					textField.setText(8+"");
					havenumber=true;
					lastnum=8;
				}
				else
				{
					if(havepoint==false)
					{
						lastnum=lastnum*10+8;
						textField.setText(lastnum+"");
					}
					else
					{
						thisnum=thisnum*10+8;
						textField.setText(lastnum+"."+thisnum);
					}
				}
			}
		});
		button_6.setBounds(142, 227, 81, 49);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(havenumber==false)
				{
					textField.setText(9+"");
					havenumber=true;
					lastnum=9;
				}
				else
				{
					if(havepoint==false)
					{
						lastnum=lastnum*10+9;
						textField.setText(lastnum+"");
					}
					else
					{
						thisnum=thisnum*10+9;
						textField.setText(lastnum+"."+thisnum);
					}
				}
			}
		});
		button_7.setBounds(250, 227, 86, 49);
		contentPane.add(button_7);
		
		JLabel lblNewLabel_1 = new JLabel("\u8FD0\u7B97\u7B26");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(378, 60, 242, 288);
		lblNewLabel_1.setBorder(BorderFactory.createLineBorder(Color.red));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 20));
		textField.setBounds(47, 13, 446, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_8 = new JButton("+");
		button_8.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				calcuator='+';
				textField.setText("");
				lastnum=0;
				havenumber=false;
			}
		});
		button_8.setBounds(412, 102, 81, 49);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				calcuator='-';
				textField.setText("");
				lastnum=0;
				havenumber=false;
			}
		});
		button_9.setBounds(507, 102, 81, 49);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				calcuator='*';
				textField.setText("");
				lastnum=0;
				havenumber=false;
			}
		});
		button_10.setBounds(412, 164, 81, 50);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				calcuator='/';
				textField.setText("");
				lastnum=0;
				havenumber=false;
			}
		});
		button_11.setBounds(507, 164, 81, 50);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("=");
		button_12.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				switch(calcuator)
				{
				case '+':
					textField.setText(""+(first+second)+"");
					textField_1.setText(first+"+"+second+"="+(first+second));
					break;
				case '-':
					textField.setText(""+(first-second)+"");
					textField_1.setText(first+"-"+second+"="+(first-second));
					break;
				case '*':
					textField.setText(""+(first*second)+"");
					textField_1.setText(first+"*"+second+"="+(first*second));
					break;
				case '/':
					if(second!=0)
					{
					textField.setText(""+(first/second)+"");
					textField_1.setText(first+"/"+second+"="+(first/second));
					}
					else
					{
						textField.setText("");
						textField_1.setText("Error:divisor is 0[除数为0]");
					}
					break;
				}
				lastnum=0;
				havenumber=false;
				
			}
		});
		button_12.setBounds(507, 289, 81, 49);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton(".");
		button_13.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				havepoint=true;
				thisnum=0;
				textField.setText(textField.getText()+".");
			}
		});
		button_13.setBounds(142, 289, 81, 49);
		contentPane.add(button_13);
		
		JLabel label = new JLabel("\u7ED3\u679C\uFF1A");
		label.setFont(new Font("Dialog", Font.PLAIN, 20));
		label.setBounds(47, 361, 554, 42);
		label.setBorder(BorderFactory.createLineBorder(Color.red));
		contentPane.add(label);
		
		JButton button_14 = new JButton("0");
		button_14.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(havenumber==false)
				{
					textField.setText(0+"");
					havenumber=true;
					lastnum=0;
				}
				else
				{
					if(havepoint==false)
					{
						lastnum=lastnum*10+0;
						textField.setText(lastnum+"");
					}
					else
					{
						thisnum=thisnum*10+0;
						textField.setText(lastnum+"."+thisnum);
					}
				}
			}
		});
		button_14.setBounds(47, 289, 73, 49);
		contentPane.add(button_14);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_1.setBounds(92, 363, 491, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("宋体", Font.PLAIN, 20));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				havenumber=false;
				havepoint=false;
				textField.setText("");
				textField_1.setText("");
				first=0;
			}
		});
		btnCe.setBounds(412, 227, 81, 49);
		contentPane.add(btnCe);
		
		JButton button_15 = new JButton("\u2190");
		button_15.setFont(new Font("宋体", Font.PLAIN, 20));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().substring(0, textField.getText().length()-1));
			}
		});
		button_15.setBounds(507, 227, 81, 49);
		contentPane.add(button_15);
		
		JButton btnBug = new JButton("Bug");
		btnBug.setFont(new Font("宋体", Font.PLAIN, 20));
		btnBug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "存在的错误：\n小数运算时，有时运算会出错，\n主要是两数相减，结果有时只是接近正确值\n另外：\n两个数以上运算时需每两个数运算按下‘=’","存在的问题",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnBug.setBounds(507, 13, 113, 34);
		contentPane.add(btnBug);
	}
}
