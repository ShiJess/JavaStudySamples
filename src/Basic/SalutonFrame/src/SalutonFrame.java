import java.awt.Color;

import javax.swing.*;
public class SalutonFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6565234878259132064L;

	public SalutonFrame(){
		super("Salunton mondo!图形化界面first");
		//setLocation(400,100);
		setBackground(Color.BLUE);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] arguments){
		SalutonFrame sal=new SalutonFrame();
		sal.setLocation(400,100);
	}
}
