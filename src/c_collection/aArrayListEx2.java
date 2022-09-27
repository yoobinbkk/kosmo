package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>(4);
		list.add("rabbit");
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노란 표시 없애려면 generics 지정 --> <String>
		
		// Arrays.toString[] 처럼 출력
		System.out.println(list);
		
		for (int i=0 ; i<list.size() ; i++) {
			String data = (String)list.get(i);				// 다른 타입인 경우 Object 타입으로 리턴함 --> String으로 바꾸고 싶으면 String으로 바꿔야 함
			System.out.print(data + " ");						// <String> generic을 붙이지 않을 경우
		}
		
		System.out.println();
		
		// 향상된 for 문
		for (String data : list) {
			System.out.print(data + " ");
		}
		
		System.out.println();
		
		list.set(3, "rabbit");							// (4 번째) fox --> rat	// fox --> rabbit
		System.out.println(list);
		
		list.remove(1);								// (두 번째) zebra X
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		

	}
}
