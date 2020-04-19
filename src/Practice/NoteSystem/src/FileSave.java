/**
 * 
 */
package huaxin.class49.group04.projcet01.notesystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

/**
 * @author Administrator
 *
 */
public class FileSave extends Thread{
	// 流类
	FileOutputStream fo = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	JFileChooser fc = null;
	// 临时保存文本信息
	private String contentInf;
	// 获得文件路径
	String fName;
	// 获得保存对话框返回直
	int returnValue;
	
	// 判断文件是否已保存
	static boolean isHasedSave = false;
	// 是否另存
	static boolean isOtherSave = true;
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		FileSave fileSave = new FileSave();
//		
//		fileSave.start();
//	}
	public FileSave() {
		fc = new JFileChooser();
	}
	// 返回另存界面
	public void showOtherSave() {
		returnValue = fc.showSaveDialog(null);
	}
	// 设置保存路径
	public void setSavePath(String fName) {
		this.fName = fName;
	}
	// 设置写入文件内容
	public void setContentInf(String contentInf) {
		this.contentInf = contentInf;
	}
	// 返回保存文件路径
	public String getSavePath() {
		return this.fName;
	}
	// 同步的写线程
	public synchronized void  run() {
		// 获得当前线程
		Thread runner = Thread.currentThread();
		// 判断是否为当前线程
		if(runner == this) {
			
			// 另存
			if(isOtherSave) { 
			// 判断是否已点击确认保存
				if(returnValue == JFileChooser.APPROVE_OPTION ) {
						// 生成写入流
						
						File file = fc.getSelectedFile();
						
						this.fName = file.getAbsolutePath();
						try {
						
							fw = new FileWriter(fName);
							bw = new BufferedWriter(fw);
							char[] charContent = contentInf.toCharArray();
							for(int i = 0; i < charContent.length; i++) {
							bw.write((int)charContent[i]);
							}
							bw.flush();
//							this.isFirstSave = false;
						}catch(IOException e) {
							e.printStackTrace();
						}finally {
							try {
								fw.close();
								bw.close();
							}catch(IOException e) {
								e.printStackTrace();
							}
						}
//					
				}
			}
//			非另存
			else if(!isOtherSave || !isHasedSave) {
				try {
					
					fw = new FileWriter(fName);
					bw = new BufferedWriter(fw);
//					this.isFirstSave = true;
				
					bw.write(contentInf);
				
					bw.flush();
				}catch(IOException e) {
					e.printStackTrace();
				}finally {
					try {
						fw.close();
						bw.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
