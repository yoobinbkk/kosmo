package basic1;

import java.util.Scanner;

public class EX02_Control2 {
	
	public static void main(String[] args) {
		
		// 2017111001
		// 2019211001
		// 2018133001
		
		System.out.println("학번을 입력하세요. >>>");
		Scanner input = new Scanner (System.in);
		String id = input.nextLine();
		
		String entYear = id.substring(0, 4);				// 입학연도
		int entYearNum = Integer.parseInt(entYear);
		
		String univ = null;									// 단과대
		String major = null;								// 학과
		
		char univStr = id.charAt(4);						// 단과대 번호
		String majorStr = id.substring(5, 7);				// 학과 번호
		int majorNum = Integer.parseInt(majorStr);
		
		if (univStr == '1') {
			univ = "공대";
			switch (majorNum) {
			case 11 : major = "컴퓨터학과"; break;				// 만약 1.4 버전을 사용할 경우 문자열은 통하지 않는다.
			case 12 : major = "소프트웨어학과"; break;
			case 13 : major = "모바일학과"; break;
			case 22 : major = "자바학과"; break;
			case 33 : major = "서버학과"; break;
			}
		} else if (univStr == '2') {
			univ = "사회대";
			switch (majorNum) {
			case 11 : major = "사회학과"; break;
			case 12 : major = "경영학과"; break;
			case 13 : major = "경제학과"; break;
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.println(id + " 는 " + entYearNum + "년도에 입학한 " + univ + " " + major + " " + "학생입니다.");
		
//		ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다
//
//		ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다
//
//		ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다  
		
	}
}
