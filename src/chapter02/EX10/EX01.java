package chapter02.EX10;

public class EX01 {

	public static void main(String[] args) {
		
		// 각 변수의 평균 값을 계산하세요.
		
		int aa = 80;
		int bb = 90;
		int cc = 100;
		double dd = 75.5;
		double ee = 60.3;
		
		int avg01 = (int) ((aa + bb + cc + dd + ee) / 5);
		double avg02 = (aa + bb + cc + dd + ee) / 5;
		
		System.out.println("각 과목의 평균 값은 : " + avg01);
		System.out.println("각 과목의 평균 값은 : " + avg02);
		System.out.printf("각 과목의 평균 값은 : %d \n", avg01);
		System.out.printf("각 과목의 평균 값은 : %4.4f", avg02);

	}

}
