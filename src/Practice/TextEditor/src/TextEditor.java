import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class TextEditor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6395080144937000109L;
	private JPanel contentPane;
	public static Boolean Linewrap=false;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextEditor frame = new TextEditor();
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
	public TextEditor() {
		setTitle("\u6587\u672C\u7F16\u8F91\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 358);
		final JTextArea textArea = new JTextArea();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u6587\u4EF6");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u65B0\u5EFA");
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u6253\u5F00");
		menuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JFileChooser open=new JFileChooser();
				open.showOpenDialog(TextEditor.this);
			}
		});
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u4FDD\u5B58");
		menuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				//if()
			}
		});
		menu.add(menuItem_2);
		
		JMenuItem menuItem_13 = new JMenuItem("\u53E6\u5B58\u4E3A");
		menuItem_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JFileChooser open=new JFileChooser();
				open.showOpenDialog(TextEditor.this);
			}
		});
		menu.add(menuItem_13);
		
		JMenuItem menuItem_12 = new JMenuItem("\u9000\u51FA");
		menuItem_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				dispose();
			}
		});
		menu.add(menuItem_12);
		
		JMenu menu_1 = new JMenu("\u7F16\u8F91");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_4 = new JMenuItem("\u5168\u9009");
		menu_1.add(menuItem_4);
		
		JMenuItem menuItem_14 = new JMenuItem("\u81EA\u52A8\u6362\u884C");
		menuItem_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(Linewrap)
				{
					Linewrap=false;
				}
				else
				{
					Linewrap=true;		
				}
			}
		});
		menu_1.add(menuItem_14);
		
		JMenuItem menuItem_7 = new JMenuItem("\u526A\u5207");
		//menuItem_7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.v))
		menuItem_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				textArea.cut();
			}
		});
		menu_1.add(menuItem_7);
		
		JMenuItem menuItem_5 = new JMenuItem("\u590D\u5236");
		menu_1.add(menuItem_5);
		
		JMenuItem menuItem_6 = new JMenuItem("\u7C98\u8D34");
		menuItem_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				textArea.paste();
			}
		});
		
		menu_1.add(menuItem_6);
		
		JMenuItem menuItem_8 = new JMenuItem("\u5220\u9664");
		menu_1.add(menuItem_8);
		
		JMenuItem menuItem_9 = new JMenuItem("\u67E5\u627E");
		menu_1.add(menuItem_9);
		
		JMenuItem menuItem_10 = new JMenuItem("\u66FF\u6362");
		menu_1.add(menuItem_10);
		
		JMenu menu_2 = new JMenu("\u5E2E\u52A9");
		menuBar.add(menu_2);
		
		JMenuItem menuItem_11 = new JMenuItem("\u4F7F\u7528\u8BF4\u660E");
		menu_2.add(menuItem_11);
		
		JMenuItem menuItem_3 = new JMenuItem("\u5173\u4E8E");
		menuItem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "www");
			}
		});
		menu_2.add(menuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		
		textArea.setForeground(Color.BLACK);
		if(Linewrap)
		{
			textArea.setLineWrap(rootPaneCheckingEnabled);//自动换行【菜单栏选择】
		}
		scrollPane.setViewportView(textArea);
	}
	
}

