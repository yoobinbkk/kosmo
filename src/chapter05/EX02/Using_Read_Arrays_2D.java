package chapter05.EX02;

public class Using_Read_Arrays_2D {

	public static void main(String[] args) {
		
		// 2차원 배열의 값을 읽기
			// 1차원 배열일 때 : arr.length <-- 열의 갯수
			// 2차원 계열일 때 : arr.length <-- 행의 갯수
			//				 arr[i].length <-- 열의 갯수, i : 행의 번호
		
		int[] arr0 = new int[100];							// 1차원 배열, 열(방) 100개 생성
		System.out.println(arr0.length);					// 열의 갯수 : 100
		
		// 1. 2차원 배열의 길이 (정방형 배열)
		int[][] arr1 = new int[2][3];
		System.out.println(arr1.length);					// 행의 갯수 : 2
		System.out.println(arr1[0].length);					// 0행의 열의 갯수 : 3
		System.out.println(arr1[1].length);					// 1행의 열의 갯수 : 3
		
		System.out.println("=====================================");
		
		// 2. 2차원 배열의 길이 (비정방형 배열)
		int[][] arr2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(arr2.length);					// 행의 갯수 : 2
		System.out.println(arr2[0].length);					// 0행의 열의 갯수 : 2
		System.out.println(arr2[1].length);					// 1행의 열의 갯수 : 3
		
		System.out.println("=====================================");
		
		// 2차원 배열 출력 방법
		// 방법1 - 방 번호를 직접 출력
		System.out.println(arr2[0][0] + " " + arr2[0][1]);
		System.out.println(arr2[1][0] + " " + arr2[1][1] + " " + arr2[1][2]);
		
		System.out.println("====이중 for 문을 사용해서 이차원 배열 값 출력====");
		
		// 방법2 - for 문을 사용해서 출력 : 2차원 배열 이중 for 문 (for문 내의 for문)
			// 바깥쪽 for 문 : arr.length <-- 행의 갯수
			// 안쪽 for 문 : arr[i].length <-- 행의 열의 갯수
		for (int i=0 ; i<arr2.length ; i++) {
			for (int j=0 ; j<arr2[i].length ; j++) {
				System.out.print(arr2[i][j] + " ");			// i : 행의 방번호, j : 열의 방번호
			}
			System.out.println();							// 한 행이 끝나면 enter
		}
		
		System.out.println("====Enhanced for 문을 사용해서 이차원 배열 값 출력====");

		// 방법3 - Enhanced for 문을 사용해서 출력 : 이중 for 문을 사용해서 출력
		for (int[] e : arr2) {								// arr2 : 이차원 배열을 1차원 배열로 꺼낸다.
			for (int a : e) {								// e : 일차원 배열의 각방의 값을 b 변수로 꺼낸다.
				System.out.print(a + " ");
			}
			System.out.println();
		}

	}

}
