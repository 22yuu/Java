package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��¥ : 2021/05/27
 * �̸� : ������
 * ���� : �ڹ� ���� ����� �ǽ��ϱ�
 * */

public class FileIOTest {
	
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\bigdata.DESKTOP-61ML0B4\\Desktop\\test1.txt";
		String path2 = "C:\\Users\\bigdata.DESKTOP-61ML0B4\\Desktop\\test2.txt";
		
		// ���ϰ� �Է½�Ʈ�Ѹ� ����
		try {
			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			int value = 0;
			
			while(true) {
				
				// ��Ʈ������ ���� ������ �б�
				value = fis.read();
				
				if(value == -1) {
					// �� �̻� ���� �����Ͱ� ���� �� ����
					break;
				}
				
//				char ch = (char)value;
//				System.out.print(ch);
				fos.write(value);
				
			} // while end
			
			// ��Ʈ������
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println();
		System.out.println("���α׷� ����...");
	}
}
