/**
 * 
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 * @author 王敬佳 2008/1/4
 * @version 1.0 打开文件获得其中信息
 */
public class FileOpen extends Thread {
	JFileChooser fc = new JFileChooser();
	MyFileFilter jpgFileFilter = new MyFileFilter();
	MyFileFilter htmlFileFilter = new MyFileFilter();
	MyFileFilter htmFileFilter = new MyFileFilter();
	MyFileFilter docFileFilter = new MyFileFilter();
	MyFileFilter javaFileFilter = new MyFileFilter();
	MyFileFilter txtFileFilter = new MyFileFilter();
	private StringBuffer fileContent = new StringBuffer();
	// 存放打开文件路径
	static String fName;
	int returnValue;

	/**
	 * @param args
	 */

	public FileOpen() {

		jpgFileFilter.addExtension("jpg");
		htmlFileFilter.addExtension("html");
		htmFileFilter.addExtension("htm");
		docFileFilter.addExtension("doc");
		javaFileFilter.addExtension("java");
		txtFileFilter.addExtension("txt");
		// 添加过滤器
		fc.addChoosableFileFilter(jpgFileFilter);
		fc.addChoosableFileFilter(htmlFileFilter);
		fc.addChoosableFileFilter(htmFileFilter);
		fc.addChoosableFileFilter(docFileFilter);
		fc.addChoosableFileFilter(javaFileFilter);
		fc.addChoosableFileFilter(txtFileFilter);
		returnValue = fc.showOpenDialog(null);

		// System.out.println(fc.CHOOSABLE_FILE_FILTER_CHANGED_PROPERTY);

	}

	// 读线程
	public void run() {
		Thread thread = Thread.currentThread();
		FileInputStream fi = null;
		FileReader fr = null;
		BufferedReader br = null;

		if (thread == this) {
			// 获得当前选择文件过滤器类型
			FileFilter fileFilter = fc.getFileFilter();

			

			if (returnValue == JFileChooser.APPROVE_OPTION) {
				//			

				try {
					// 流建立
					File file = fc.getSelectedFile();
					this.fName = file.getAbsolutePath();
					fr = new FileReader(fName);
					br = new BufferedReader(fr);
					boolean eof = false;
					int intByte = 0;
					while (!eof) {
						intByte = br.read();
						if (intByte != -1) {

							fileContent.append((char) intByte);
							// System.out.println(fileContent.toString());
						} else
							eof = true;
					}

				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						fr.close();
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			}else if(returnValue == JFileChooser.CANCEL_OPTION) {
				try {
					// 流建立
//					File file = fc.getSelectedFile();
//					this.fName = file.getAbsolutePath();
					fr = new FileReader(fName);
					br = new BufferedReader(fr);
					boolean eof = false;
					int intByte = 0;
					while (!eof) {
						intByte = br.read();
						if (intByte != -1) {

							fileContent.append((char) intByte);
							// System.out.println(fileContent.toString());
						} else
							eof = true;
					}

				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						fr.close();
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

	// 返回读取文件中的信息
	public String getFileContent() {
		// System.out.println("fileContne");
		return this.fileContent.toString();

	}

	
}

/**
 * 
 * 过滤文件类型
 * 
 */
class MyFileFilter extends FileFilter {
	private HashMap filter = null;

	public boolean accept(File file) {
		// TODO Auto-generated method stub
		if (file.isDirectory() || file.getName().endsWith(".txt")
				|| file.getName().endsWith(".java")
				|| file.getName().endsWith(".doc")
				||file.getName().endsWith(".html")
				||file.getName().endsWith(".htm")) {
			return true;
		}
		return false;
	}

	public MyFileFilter() {
		filter = new HashMap();

	}

	// 添加拓展类型
	public void addExtension(String extension) {

		filter.put(extension, this);
	}
//	 返回文件类型关键字
	public String getDescription() {
		// TODO Auto-generated method stub
		String extensionInf = "";
		Set set = filter.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			extensionInf += "*." + key;
		}
		
		return extensionInf;
		
	}

	
//	public String getFileFilterKey() {
//		String fileKey = null;
//		Set set = filter.keySet();
//		Iterator iterator = set.iterator();
//		while (iterator.hasNext()) {
//			String key = (String) iterator.next();
//			fileKey += key;
//		}
//		return fileKey;
//	}

}