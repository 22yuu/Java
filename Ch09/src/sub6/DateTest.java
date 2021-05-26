package sub6;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 날짜 : 2021/05/26
 * 이름 : 이진유
 * 내용 : Date 클래스 실습하기
 * */


public class DateTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("date : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
		String now = sdf.format(date);
		
	}
}
