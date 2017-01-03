package VariableTest;

public class TypeCast {
	public static void main(String[] args) {
		
		//암시적(implicity) casting
		int i1 = 9999;
		long l1 = i1;
		
		//명시적(explicity) casting
		long l2 = 9234567898L;		//숫자의 기본 타입은 integer값이므로 int의 범위를 넘어가면 long형이라는 것을 인지하기 위해 숫자 뒤에 L을 붙인다.
		int i2 = (int)l2;			//(int)를 붙이는 이유는 값이 짤려도 상관없다는 것을 알려주기 위함. 형 변환을 하지 않으면 컴파일 에러 발생.
		
		System.out.println(l1 + " : " + i1);
		System.out.println(l2 + " : " + i2);
	}
}
