package c_collection;

import java.util.*;

import chapter09.EX01.E;

public class StackQueue {

	public static void main(String[] args) {
		
		// 1. 스택												// 예 : 웹사이트 뒤로가기
		Stack s = new Stack();				// LIFO
		s.push("A");						// push : 넣기
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop());		// pop : 빼기 (출력용)
		
		// 2. 큐
		Queue q = new LinkedList();
		q.offer("A");
		q.offer("B");
		q.offer("C");
		
		System.out.println(q.poll());
		
	}

}
