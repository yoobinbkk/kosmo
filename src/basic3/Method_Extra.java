
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
	
	// 최대값을 찾는 메소드
	static int maxVote (int[] a) {
		int max = 0;
		for (int i=0 ; i<a.length ; i++) {
			if (a[i] > max) {							// 만약 배열의 값이 최대값보다 크면
				max = a[i];								// 그 배열의 값을 최대값 변수에 넣어라
			}
		}
		return max;										// 최대값 변수를 반환
	}
	
	// 당선된 후표를 출력하는 메소드
	static String electedOne (int[] a) {
		int temp = 0;
		// 최대 득표수를 받은 후보의 수를 구하기
		for (int i=0 ; i<a.length ; i++) {
			if (maxVote(a) == a[i]) {					// 만약 배열의 값이 최대값이면
				temp++;									// temp 변수에 1을 더해라 <--- 최대 득표수를 받은 후보의 수를 구하는 것이다.
			}
		}
		
		// 당선된 후보의 배열
		int[] electedOne = new int[temp];				// 최대 득표수를 받은 후보의 수만큼 electedOne 배열의 방을 생성
		
		
		// 후보의 수를 구해서 electedOne 배열에 넣기
		int b = -1;
		for (int i=0 ; i<a.length ; i++) {
			if (maxVote(a) == a[i]) {					// 만약 배열의 값이 최대값이면
				electedOne[b+1] = i+1;					// 그 값의 인덱스(후보의 수)를 electedOne 배열에 넣어라
			}
		}
		return Arrays.toString(electedOne);				// electedOne 배열(최대 득표수를 받은 후보의 수)을 반환
	}

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		// 입력값 받기
		System.out.println("후보의 수를 입력하세요 (최대 10명)>>>");
		int N = input.nextInt();									// N(후보의 수)을 입력값으로 받기

		System.out.println("투표한 사람의 수를 입력하세요 (최대 100)>>>");
		int voteNum = input.nextInt();								// voteNum(투표하는 사람의 수)를 입력값으로 받기
		
		// 배열 선언
		int[] votes = new int[voteNum];								// 투표하는 사람의 입력값 만큼 votes 배열의 방을 만든다
		int[] ballotCount = new int[N];								// 후보의 수 만큼 ballotCount 배열의 방을 만든다
		
		// 랜덤으로 투표를 진행
		for (int i=0 ; i<votes.length ; i++) {
			votes[i] = (int) (Math.random() * N)+1;					// Math.random을 이용해 투표를 랜덤으로 설정한다
		}
		
		// 각각 후보의 투표수를 알아내기
		for (int i=0; i<votes.length ; i++) {
			ballotCount[votes[i]-1]++;								// 여기서 (votes[i]-1)는 후보의 기호, ballotCount[]는 그 후보가 받은 투표수이다
		}
		
		System.out.println(1 + "번부터 " + N + "번까지 " + N + "명의 후보가 있으며, 투표 결과는 " + Arrays.toString(votes) + "입니다."
				+ "각 후보의 득표수는 다음과 같습니다.\n");

		for (int i=0; i<ballotCount.length ; i++) {
			System.out.println("\t" + (i+1) + "번 후보가 " + ballotCount[i] + "표\n");				// 후보와 표수를 순차적으로 출력
		}

		System.out.println("이 경우 " + electedOne(ballotCount) + "번 후보가 " + maxVote(ballotCount) + "표로 가장 많은 표를 얻었습니다.");




	}

}

// N에 따라 각각의 숫자를 