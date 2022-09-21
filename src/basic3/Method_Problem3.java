
/*
   multiple 메소드 만들기

  - 2개의 int 인자인 경우는 곱셈계산 한 결과를 출력

  - 1개의 int 인자와 1개의 char 인자인 경우는 int 인자 수 만큼 char 인자 문자를 출력

  - 2개의 int 인자와 1개의 char 인자인 경우는 char 인자 문자를 n * m 형식의 행과 열로 출력 

 

   

  [예시]

    ` multiple ( 2, 3 ) 호출          [출력결과]  6      

    ` multiple ( 4, 'ㅋ' ) 호출        [출력결과]  ㅋㅋㅋㅋ

    ` multiple ( 2, 3 , 'ㅋ' ) 호출    [출력결과] ㅋㅋㅋ
                                              ㅋㅋㅋ
*/

package basic3;

public class Method_Problem3 {
	
	static void multiple (int a, int b) {
		System.out.println(a*b);
	}
	
	static void multiple (int a, char b) {
		for (int i=0 ; i<a ; i++) {
			System.out.print(b);
		}
		System.out.println();
	}
	
	static void multiple (int a, int b, char c) {
		for (int i=0 ; i<a ; i++) {
			for (int j=0 ; j<b ; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		System.out.print("1st 문제 : ");
		multiple(2,3);
		
		System.out.print("2nd 문제 : ");
		multiple(4,'ㅋ');
		
		System.out.println("3rd 문제");
		multiple(2,3,'ㅋ');
		
	}

}
