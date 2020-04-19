

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Goto extends JDialog{
	public  Goto(NoteGUI noteGUI){
		super(noteGUI);
		final JDialog gotoDialog=new JDialog();
		gotoDialog.setBounds(50,50,200,300);
		JLabel gotoLabel=new JLabel("行数(L):");
		final JTextField linenum=new JTextField(10);
		linenum.setText("1");
		linenum.selectAll();
		
		JButton okButton=new JButton("确定");
		okButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				int totalLine = NoteGUI.textArea.getLineCount(); 
				int[] lineNumber = new int[totalLine + 1]; 
				String s = NoteGUI.textArea.getText(); 
				int pos = 0, t = 0; 
				
				while(true) { 
					pos = s.indexOf('\12', pos); 
					if(pos == -1) 
					break; 
					lineNumber[t++] = pos++; 
				} 
				
				int gt = 1; 
				try { 
					gt = Integer.parseInt(linenum.getText()); 
				}
				catch(NumberFormatException efe) { 
					JOptionPane.showMessageDialog(null, "请输入行数!", "提示",JOptionPane.WARNING_MESSAGE); 
					linenum.requestFocus(true);
					return;
				} 
				
				if(gt < 2 || gt >= totalLine) { 
					if(gt < 2) 
						NoteGUI.textArea.setCaretPosition(0); 
					else 
						NoteGUI.textArea.setCaretPosition(s.length()); 
				} 
				else 
					NoteGUI.textArea.setCaretPosition(lineNumber[gt-2] + 1); 
				
				gotoDialog.dispose(); 
			} 
			
		});
		
		JButton cancelButton=new JButton("取消");
		cancelButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				gotoDialog.dispose();
			}
		});
		
		Container con=gotoDialog.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(gotoLabel);
		con.add(linenum);
		con.add(okButton);
		con.add(cancelButton);
		
		gotoDialog.setSize(200,100);
		gotoDialog.setResizable(false);
		gotoDialog.setLocation(300,280);
		gotoDialog.setVisible(true);
	}
	
}
