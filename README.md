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





package Kakaotalk1;

public class Team {
	public static void main(String[] args) {
		Mesge m = new Mesge("안녕"); // 메시지 생성
        Me me = new Me();           // 나(Me) 객체 생성
        Mesge result = me.send(m);  // 메시지 보내기
        System.out.println("팀에게 보낸 메시지: " + result.text);
    }
}





==============================


package Kakaotalk1;

public class Me {
    Mesge send(Mesge m) {
        return m; // 메시지를 그대로 반환
    }
}


============
package Kakaotalk1;

public class Mesge {
    String text;

    public Mesge(String text) {
        this.text = text;
    }

	}




