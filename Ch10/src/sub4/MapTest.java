package sub4;

import java.util.HashMap;
import java.util.Map;

/*
 * ��¥ : 2021/05/26
 * �̸� : ������
 * ���� : �ڹ� Collection Map Ŭ���� �ǽ��ϱ�
 * */

public class MapTest {

	public static void main(String[] args) {
		// Map ����
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		
		map1.put(101, "������");
		map1.put(102, "������");
		map1.put(103, "�庸��");
		map1.put(104, "������");
		map1.put(105, "�̼���");
		
		// Map ������ ����
		System.out.println("map1 ������ ���� : " + map1.size());
		
		// Map ������ ���
		System.out.println("map 101�� ������ : " + map1.get(101));
		System.out.println("map 103�� ������ : " + map1.get(103));
		System.out.println("map 105�� ������ : " + map1.get(105));
		
		
	}
}
