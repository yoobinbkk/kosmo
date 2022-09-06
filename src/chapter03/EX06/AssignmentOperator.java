package chapter03.EX06;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		// 대입 연사자의 축약 표현
		/*
		 * 	산술 연산의 축약 표현
			a = a + b		a += b
			a = a - b		a -= b
			a = a * b		a *= b
			a = a / b		a /= b
			
			비트 연산의 축약 표현
			a = a & b		a &= b
			a = a | b		a |= b
			
			쉬프트 연산의 축약 표현
			a = a >> b		a >>= b
			a = a << b		a <<= b
			
			논리 쉬프트
			a = a >>> b		a >>>= b
		 */
		
		int value1 = 3;
		value1 = value1 + 3;			// 대임 연산자는 제일 나중에 적용
		System.out.println(value1);
		System.out.println("==================");
		
		int value2;		// 변수 선언
		value2 = 1;		// 변수에 값 할당 : //
		int value3 = 4;
		System.out.println(value2 += 2);		// value2 = value2 + 2		value2 = 3
		System.out.println(value2 -= 2);		// value2 = value2 - 2		value2 = 1
		System.out.println(value2 *= 2);		// value2 = value2 * 2		value2 = 2
		System.out.println(value2 /= 2);		// value2 = value2 / 2		value2 = 1
		System.out.println(value2 %= 2);		// value2 = value2 % 2		value2 = 1
		System.out.println(value2 <<= 2);		// value2 = value2 << 2		value2 = 4
		System.out.println(value2 >>= 2);		// value2 = value2 >> 2		value2 = 1
		System.out.println(value3 >>>= 2);		// value2 = value2 >>> 2		value2 = 0
		
		
		
	}

}
