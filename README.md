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











 =======================================
package coder;
//정보 데이터
public class Student {

	private String no;
	private String major;
	private String prof;
	private int grade;

	public Student(String no, String major, String prof, int grade) {
		this.no = no;
		this.major = major;
		this.prof = prof;
		this.grade = grade;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}



==================================



package coder;

//3학년만 퇴학
public class Test {
	public static void main(String[] args) {
		Student[] stuArr = new Student[2000];
		for (int i = 0; i < 2000; i++) {
			stuArr[i] = new Student("no-" + (i + 1), "Computer", "sasaki", (i % 4) + 1);
		}

		System.out.println();
		for (int i = 0; i < stuArr.length; i++) {
			Student s = stuArr[i];
			if (s.getGrade() == 3) {
				stuArr[i] = null;
			}	
		}
		for (int i = 0; i < stuArr.length; i++) {
			Student s = stuArr[i];
			if (null != s && s.getGrade() == 1) {
				s.setMajor("컴퓨터 & Ai");
			}			
		}
		System.out.println();

	}
}
//1학년만 전공명칭을 컴퓨터 &AI 로 변경



+++++++++++++++++++++++++++++

package Kakaotalk1; // 이 파일은 Kakaotalk1이라는 패키지에 속해 있어요

public class Team { // Team 클래스: 전체 프로그램을 실행하는 역할
    public static void main(String[] args) { // main 메서드: 자바 프로그램의 시작점
        Mesge m = new Mesge("안녕"); // 메시지 객체 생성, 내용은 "안녕"
        Me me = new Me();           // Me 객체 생성 (나 자신을 의미)
        Mesge result = me.send(m);  // Me 객체가 메시지를 보내는 동작 수행
        System.out.println("팀에게 보낸 메시지: " + result.text); // 결과 메시지 출력
    }
}





==============================


package Kakaotalk1; // 같은 패키지에 있어야 Team에서 접근 가능

public class Me { // Me 클래스: 메시지를 보내는 역할
    Mesge send(Mesge m) { // send 메서드: 메시지를 받아서 그대로 반환
        return m; // 받은 메시지를 그대로 돌려줌
    }
}

}


============
package Kakaotalk1; // 역시 같은 패키지

public class Mesge { // Mesge 클래스: 메시지 내용을 담는 객체
    String text; // 메시지의 실제 텍스트를 저장하는 변수

    public Mesge(String text) { // 생성자: 메시지를 만들 때 텍스트를 받아 저장
        this.text = text; // 전달받은 텍스트를 클래스의 text 변수에 저장
    }
}

	}




