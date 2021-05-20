package sub3;

/*
 * ��¥ : 2021/05/18
 * �̸� : ������
 * ���� : �ڹ� ������ �迭 �ǽ��ϱ�
 * */

public class MultiArrayTest {
	
	public static void main(String[] args) {

		// 1���� �迭
		int[] scores = {80, 60, 78, 62, 92};
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("�迭 scores�� �� : " +sum);
		
		// 2���� �迭
		int[][] arr2d = {{1,  2,  3,  4},
						 {5,  6,  7,  8},
						 {9, 10, 11, 12}};
		
		for(int i = 0 ; i < arr2d.length; i++) {
			for(int j = 0; j < arr2d[0].length; j++) {
				System.out.println("�迭 arr2d["+i+"]["+j+"] : "+arr2d[i][j]);
			}
		}

		// 3���� �迭
		int[][][] arr3d = {{{ 1,  2,  3},
							{ 4,  5,  6},
							{ 7,  8,  9}},
						   {{10, 11, 12},
							{13, 14, 15},
							{16, 17, 18}},
						   {{19, 20, 21},
							{22, 23, 24},
							{25, 26, 27}}};
		
		System.out.println("3���� �迭 arr3d[0][1][1] : " + arr3d[0][1][1]);
		System.out.println("3���� �迭 arr3d[1][1][0] : " + arr3d[1][1][0]);
		System.out.println("3���� �迭 arr3d[2][0][2] : " + arr3d[2][0][2]);
	}
}