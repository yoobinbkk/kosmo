package collectzzzz;

import java.util.ArrayList;

public class ArrayListEx1 {

	static ArrayList <Object> dataSet() {

		String name = "dsds";
		Integer age = 31;
		Double height = 162.3;

		ArrayList <Object> list = new ArrayList <Object> ();			// 동적 배열 : () 안에 무엇을 넣어도 필요하면 자동으로 방 개수를 늘려준다.
		list.add(name);
		list.add(age);
		list.add(height);

		return list;

	}

	public static void main(String[] args) {

		ArrayList result = dataSet();

		for (int i=0 ; i<result.size() ; i++) {
			System.out.println(result.get(i));
		}

	}

}
