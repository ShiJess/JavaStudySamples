/**
 * 
 */


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
	// ����
	FileOutputStream fo = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	JFileChooser fc = null;
	// ��ʱ�����ı���Ϣ
	private String contentInf;
	// ����ļ�·��
	String fName;
	// ��ñ���Ի��򷵻�ֱ
	int returnValue;
	
	// �ж��ļ��Ƿ��ѱ���
	static boolean isHasedSave = false;
	// �Ƿ����
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
	// ����������
	public void showOtherSave() {
		returnValue = fc.showSaveDialog(null);
	}
	// ���ñ���·��
	public void setSavePath(String fName) {
		this.fName = fName;
	}
	// ����д���ļ�����
	public void setContentInf(String contentInf) {
		this.contentInf = contentInf;
	}
	// ���ر����ļ�·��
	public String getSavePath() {
		return this.fName;
	}
	// ͬ����д�߳�
	public synchronized void  run() {
		// ��õ�ǰ�߳�
		Thread runner = Thread.currentThread();
		// �ж��Ƿ�Ϊ��ǰ�߳�
		if(runner == this) {
			
			// ���
			if(isOtherSave) { 
			// �ж��Ƿ��ѵ��ȷ�ϱ���
				if(returnValue == JFileChooser.APPROVE_OPTION ) {
						// ����д����
						
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
//			�����
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
