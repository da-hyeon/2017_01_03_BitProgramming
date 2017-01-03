package VariableTest;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2000;

		if( year % 4 == 0 && year % 100 == 0 && year % 400 == 0){	//4와 100과 400으로 나누어 지면
			System.out.print("윤년 입니다.");
		} 
		else if( year % 400 != 0 || year % 100 != 0 || year % 4 != 0) {	//4, 100, 400으로 나누어지지 않으면
			System.out.print("윤년이 아닙니다.");
		}
	}
}