package huaxin.class49.group04.projcet01.notesystem;

	import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
	public class AboutUs extends JDialog {

		/**
		 * Launch the application
		 * @param args
		 */
		public AboutUs() {
			super();
			setTitle("��������");
			setBounds(100, 100, 270, 190);
			setBackground(Color.white);
			JPanel panel = new JPanel();
			JLabel label = new JLabel("      �˼��±���Ȩ��");
			label.setFont(new Font("",Font.BOLD,24));
			label.setBounds(0,10,280,20);
			panel.add(label);
			getContentPane().add(panel);
			label = new JLabel("   ����49���������У�");
			label.setFont(new Font("",Font.BOLD,24));
			label.setBounds(0,40,280,20);
			getContentPane().add(label);
			label = new JLabel("          ������Ȩ��");
			label.setFont(new Font("",Font.BOLD,24));
			label.setBounds(0,80,280,20);
			getContentPane().add(label);
			this.setVisible(true);
			//
		}

	}


