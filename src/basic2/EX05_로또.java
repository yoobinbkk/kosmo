package basic2;

import java.util.Arrays;

public class EX05_로또 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		// 값 지정
		for (int i=0 ; i<lotto.length ; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
		}

		// 정렬
		// 버블 정렬
		for (int i=lotto.length-1; i>0; i--) {
			for (int j=0 ; j<i ; j++) {
				if(lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		
		for (int i=0 ; i<lotto.length ; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(lotto));
		
		/*
			temp = a;
			a = b;
			b = temp;
			
		*/
		
		/*
		 * 	Math.random() : 0.0 <- 소수점 < 1.0
		 * 
		 * 	ex) 0.1234
		 * 		0.00123
		 * 		0.5673
		 * 		0.9999
		 * 
		 * 	Math.random() * 10
		 * 
		 * 	ex) 0.1234	* 10 = 1.234	-> 1
		 * 		0.00123	* 10 = 0.0123	-> 0
		 * 		0.5673	* 10 = 5.673	-> 5
		 * 		0.9999	* 10 = 9.999	-> 9
		 * 
		 * 	(int) Math.random
		 */
		
		for (int i=0 ; i<lotto.length ; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}
		
		for (int i=lotto.length-1 ; i>0 ; i--) {
			for (int j=0 ; j<i ; j++) {
				if (lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));
		
		
	}

}
