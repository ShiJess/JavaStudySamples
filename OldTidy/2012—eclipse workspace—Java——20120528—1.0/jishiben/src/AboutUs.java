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
			setTitle("关于我们");
			setBounds(100, 100, 270, 190);
			setBackground(Color.white);
			JPanel panel = new JPanel();
			JLabel label = new JLabel("      此记事本版权归");
			label.setFont(new Font("",Font.BOLD,24));
			label.setBounds(0,10,280,20);
			panel.add(label);
			getContentPane().add(panel);
			label = new JLabel("   华信49班四组所有！");
			label.setFont(new Font("",Font.BOLD,24));
			label.setBounds(0,40,280,20);
			getContentPane().add(label);
			label = new JLabel("          保留版权！");
			label.setFont(new Font("",Font.BOLD,24));
			label.setBounds(0,80,280,20);
			getContentPane().add(label);
			this.setVisible(true);
			//
		}

	}


