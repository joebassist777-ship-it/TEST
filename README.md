package coder;

public class A {
	int count = 5;
	String neme = "Hello World";
	
	// 참거짓
	boolean isValid = false;
	// 상수 파이는 3.14 무조건 대문자
	public static final double PI = 3.14;
	char ch = 'z';
	//디폴트 생성자


	//메소드
	public static void main(String[] args) { System.out.println("Hello World"); }
	//두정수를 받아 합 의 리턴
	int add (int a , int b) { return a + b; }
	//문자와 정수를 받아 참과 거짓을 리턴
	boolean a (String a, int b) { return false; }
	//문자 하나 받아 널로 하는것
	A  b (char c) { return null; }
	//에플과 커피를 받아 자동차로 리턴
	 Car c(Apple a, Coffee c) {return new Car();}
	//유니버시티를 받아 스쿨 리턴
	 School s (University d) {return new School();}
	



  	//디폴트 생성자 리턴이 없다
	//Apple(){}
	
	//생성자 오버로딩 3개
	Apple(){this(2);}
	Apple(int a){this ("헬로");}
	Apple(String s){}
	//생성자 디폴트 시작 다른생성자로 생성.
	
