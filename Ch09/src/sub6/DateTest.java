package sub6;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��¥ : 2021/05/26
 * �̸� : ������
 * ���� : Date Ŭ���� �ǽ��ϱ�
 * */


public class DateTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("date : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//SimpleDateFormat sdf = new SimpleDateFormat("HH�� mm�� ss��");
		String now = sdf.format(date);
		
	}
}
