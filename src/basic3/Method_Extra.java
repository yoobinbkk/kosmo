
/*
	후보를 투표하는데 그 내용을 배열에 놓습니다.
	예 : [1,5,4,3,2,5,2,5,5,4]
	배열 속에 있는 값은 후보를 대표하는 숫자입니다.
	여기서 가장 투표를 많이 받은 후보를 메소드로 알려주세요.
	후보의 번호를 return할 수 있어야 합니다.
	
	N (후보의 수) : 1~10
	votes (방 갯수) : 1~100
	votes의 원소 : 1~N
*/


package basic3;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Extra {
	
	static int election (int[] a) {
		int electedOne = 0;							// 투표를 가장 많이 받은 후보의 수
		int max = 0;
		for (int i=0 ; i<a.length ; i++) {
			if (a[i] > max) {						// 투표를 가장 많이 받은 값을 찾아내면
				max = a[i];
				electedOne = i+1;					// 그 값의 인덱스를 변수에 넣기
			}
		}
		
		return electedOne;							// 후보의 수를 반환
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("후보의 수를 입력하세요>>>");
		int N = input.nextInt();
		
		System.out.println("투표한 사람의 수를 입력하세요>>>");
		int voteNum = input.nextInt();
		
		int[] votes = new int[voteNum];
		int[] ballotCount = new int[N];
		
		for (int i=0 ; i<votes.length ; i++) {
			votes[i] = (int) (Math.random() * N)+1;
		}
		
		for (int i=0; i<votes.length ; i++) {
			ballotCount[votes[i]-1]++;
		}
		
		System.out.println(1 + "번부터 " + N + "번까지 " + N + "개의 후보가 있으며, 투표 결과는 " + Arrays.toString(votes) + "입니다."
				+ "각 후보의 득표수는 다음과 같습니다.\n");
		
		for (int i=0; i<ballotCount.length ; i++) {
			System.out.println("\t" + (i+1) + "번 후보가 " + ballotCount[i] + "표\n");
		}
		
		System.out.println("이 경우 " + election(ballotCount) + "번 후보가 표로 가장 많은 표를 얻었습니다.");
		
		
		
		
	}

}

// N에 따라 각각의 숫자를 