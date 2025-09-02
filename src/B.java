package Kakaotalk1;

// Message 클래스: 메시지 내용을 담는 객체
public class Message {
    String text; // 메시지의 실제 텍스트를 저장하는 변수

    public Message(String text) { // 생성자: 메시지를 만들 때 텍스트를 받아 저장
        this.text = text;
    }
}



=======================




  package Kakaotalk1;

// Me 클래스: 메시지를 보내는 사람 (팀원)
public class Me {
    String name; // 팀원의 이름

    public Me(String name) { // 생성자: 이름을 받아 저장
        this.name = name;
    }

    public Message send(Message m) { // 메시지를 보내는 메서드
        // 메시지 앞에 이름을 붙여서 반환
        return new Message(name + "에게 보낸 메시지: " + m.text);
    }
}


===========================


package Kakaotalk1;

// Team 클래스: 전체 프로그램을 실행하는 역할
public class Team {
    public static void main(String[] args) {
        // 메시지 생성
        Message m = new Message("회의 시작합니다!");

        // 여러 명의 팀원 생성
        Me[] teamMembers = {
            new Me("지훈"),
            new Me("수아"),
            new Me("현우"),
            new Me("민지")
        };

        // 각 팀원에게 메시지를 보내고 출력
        for (Me member : teamMembers) {
            Message result = member.send(m); // 메시지 전송
            System.out.println(result.text); // 결과 출력
        }
    }
}

















  
