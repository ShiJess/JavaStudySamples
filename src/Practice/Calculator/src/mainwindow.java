import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class mainwindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	public int first=0,second;
	public Boolean computed=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainwindow frame = new mainwindow();
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
	public mainwindow() {
		setTitle("\u8BA1\u7B97\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 30));
		textField.setBounds(33, 32, 161, 86);
		contentPane.add(textField);
		textField.setColumns(10);;
		
		JButton button = new JButton("+(\u52A0)");
		button.setFont(new Font("宋体", Font.PLAIN, 30));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Integer.parseInt(textField.getText());
				computed=false;
				textField.setText("");
			}
		});
		button.setBounds(273, 32, 149, 86);
		contentPane.add(button);
		
		JButton button_1 = new JButton("-(\u51CF)");
		button_1.setFont(new Font("宋体", Font.PLAIN, 30));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Integer.parseInt(textField.getText());
				computed=true;
				textField.setText("");
			}
		});
		button_1.setBounds(273, 148, 149, 86);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("=(\u7ED3\u679C)");
		button_2.setFont(new Font("宋体", Font.PLAIN, 30));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				second=Integer.parseInt(textField.getText());
				if(computed==false)
				{
					textField.setText("0");
					textField.setText(""+(first+second)+"");
				}
				else
				{
					textField.setText("0");
					textField.setText(""+(first-second)+"");
				}
			}
		});
		button_2.setBounds(33, 148, 161, 86);
		contentPane.add(button_2);
	}

}
