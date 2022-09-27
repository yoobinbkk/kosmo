
package c_collection;
import java.util.ArrayList;

class aArrayListEx {

	static Object[] dataSet() {

		String name = "김태희";
		Integer age = 31;
		Double height = 162.3;

		Object[] obj = new Object[3];
		obj[0] = name;
		obj[1] = age;
		obj[2] = height;

		return obj;

	}

	public static void main(String[] args) 
	{
		Object[] result = dataSet();

		for (int i=0 ; i<result.length ; i++) {
			System.out.println(result[i]);
		}

		// dataSet() 안의 변수 값들을 여기서 출력한다면??




	}
}
