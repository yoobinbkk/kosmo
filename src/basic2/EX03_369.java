package basic2;

/*
 * 	[문제]
 * 
 * 	1부터 50까지 숫자 중에서 3, 6, 9에 숫자가 포함되면 
 * 	그 갯수만큼 '짝' 글자를 출력하고
 * 	그렇지 않으면 그 숫자를 출력
 * 
 * 	ex) 
 */

public class EX03_369 {

	public static void main(String[] args) {

		for (int i=1 ; i<=50 ; i++) {

			int num = i;
			boolean num369 = false;

			while (num!=0) {
				int rest = num % 10;
				if (rest==3 | rest==6 | rest==9) {
					System.out.print("짝");
					num369 = true;
				}
				num /= 10;
			}

			if(num369) System.out.println();
			else System.out.println(i);

		}


	}

}
