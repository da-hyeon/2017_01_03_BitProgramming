package VariableTest;

public class VariableTest {
	int number;
	
	public void test(){
		int j = number + 10; // 인스턴스 변수는 자동 초기화가 된다.
	}
	
	public static void main(String[] args) {
		//지역변수는 반드시 초기화 되어야 한다.
		int i = 10;
		int j = i + 10;
		
		boolean isHoliday = false;	//true , false만 사용 가능. 0,1은 사용 불가.
		char c = 'A';		//문자를 표기할때 작은 따옴표 사용.
		char e = 65;
		byte b = 10;
		short s = 20;
		int k = 10;
		long l = 123456789;
		float f = 3.14f;		//float형 변수 뒤에는 무조건 f를 붙여야함.
		double d = 3.14;
		
		System.out.println(isHoliday);
		System.out.println(c + " : " + e);
		System.out.println(b);
		System.out.println(s);
		System.out.println(k);
		System.out.println(f);
		System.out.println(d);
		
		//-------------상수-------------
		final int MAX_SPEED = 20;		//관례상 상수형 변수는 대문자로 작성한다.
		//MAX_SPEED = 200;
		//에러 : final이 붙은 변수는 이 후에 값 대입을 할 수 없다.
		
		//String 객체 확인
		String str = new String("Hello");
		System.out.println(str);
		
		//String객체를 리터럴로 사용하기.
		String str1 = "Hello";
		System.out.println(str1);
	}
}
